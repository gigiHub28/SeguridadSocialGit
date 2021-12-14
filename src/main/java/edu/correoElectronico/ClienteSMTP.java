package edu.correoElectronico;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.apache.commons.net.smtp.AuthenticatingSMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.smtp.SimpleSMTPHeader;

/**
 * Conexión al servidor SMTP
 * 
 * @author Grupo 4
 *
 */
public class ClienteSMTP {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnrecoverableKeyException,
			KeyStoreException, InvalidKeyException, InvalidKeySpecException {
		// Creación de cliente SMTP seguro
		AuthenticatingSMTPClient cliente = new AuthenticatingSMTPClient();
		// Datos
		String servidor = "smtp.gmail.com";
		String usuario = "Pepe42";
		String contrasenia = "1234";
		int puerto = 587;// SSL = 465 -/- TLS = 587
		// SMTPClient cliente = new SMTPClient(); - Cliente no seguro
		// --Conexión--
		try {
			int respuesta;
			// Crear clave para un canal seguro
			KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(null, null);
			KeyManager km = kmf.getKeyManagers()[0];

			cliente.connect(servidor, puerto);// Por defecto es el puerto 25
			System.out.println(" 1) " + cliente.getReplyString());
			// comunicación segura
			cliente.setKeyManager(km);

			respuesta = cliente.getReplyCode();
			if (!SMTPReply.isPositiveCompletion(respuesta)) {
				cliente.disconnect();
				System.err.println("Conexión rechazada");
				System.exit(1);
			}
			// Enviar comando EHLO
			cliente.ehlo(servidor);
			System.out.println(" 2) " + cliente.getReplyString());

			if (cliente.execTLS()) {
				System.out.println(" 3) " + cliente.getReplyString());
				// Autenticación con el servidor
				if (cliente.auth(AuthenticatingSMTPClient.AUTH_METHOD.PLAIN, usuario, contrasenia)) {
					System.out.println(" 4) " + cliente.getReplyString());
					String destinoA = "Pepe42";
					String asunto = "Prueba de SMTPClient con GMAIL";
					String mensaje = "Hola";

					// Crear cabecera
					SimpleSMTPHeader cabecera = new SimpleSMTPHeader(usuario, destinoA, asunto);
					// Información correcta
					cliente.setSender(usuario);
					cliente.addRecipient(destinoA);
					System.out.println(" 5) " + cliente.getReplyString());

					// Enviar DATA
					Writer escribir = cliente.sendMessageData();
					if (escribir == null) {// = Error
						System.out.println("Error en el envío de DATA");
						System.exit(1);
					}
					escribir.write(cabecera.toString());// La cabecera siempre primero
					escribir.write(mensaje);// Después el mensaje
					escribir.close();
					System.out.println(" 6)" + cliente.getReplyString());

					boolean exito = cliente.completePendingCommand();
					System.out.println(" 7) " + cliente.getReplyString());
					if (!exito) {// = Error
						System.out.println("Error al cerrar transacción");
						System.exit(1);
					}
				} else {
					System.out.println("Usuario no verificado");
				}
			} else {
				System.out.println("Error al ejecutar StartTLS");
			}
		} catch (IOException ex) {
			System.err.println("No se pudo conectar al servidor");
			ex.printStackTrace();
			System.exit(1);
		}
		// --Desconexión--
		try {
			cliente.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin del proceso");
		System.exit(0);
	}
}
