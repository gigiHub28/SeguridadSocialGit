package controlador;

import conexion.ConexionBD;
import modelo.ModeloConsultas;
import modelo.Usuario;
import vista.VistaFTP;
import vista.VistaLogin;
import vista.VistaRegistro;

public class CSeguridadSocial {

	private static VistaRegistro miRegistro = new VistaRegistro();
	private static ConexionBD miConexion = new ConexionBD();
	private static Hash miHash = new Hash();
	private static Usuario miUsuario = new Usuario();
	private static ModeloConsultas consultas = new ModeloConsultas();
	private static VistaFTP ftp = new VistaFTP();
	private static VistaLogin vLogin = new VistaLogin();

	public static void main(String[] args) {

		vLogin.setVisible(true);
		miConexion.crearConexion();
		eventosLogin();
	}

	private static void eventosLogin() {
		vLogin.getBtnEnter().addActionListener(new EventoLogin(miConexion, consultas, vLogin));
		vLogin.getBtnRegister()
				.addActionListener(new EventoRegistrar(miConexion, miRegistro, miUsuario, consultas, vLogin));
		miRegistro.getRegistrarse()
				.addActionListener(new EventoRegistrar(miConexion, miRegistro, miUsuario, consultas, vLogin));
	}

}