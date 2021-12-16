package controlador;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.commons.net.ftp.FTPClient;

import modelo.MClienteFTP;

public class ClienteFTP {

	private MClienteFTP modeloCliente = new MClienteFTP();

	public static void main(String[] args) {

		final String host = "localhost";
		final int port = 5000;
		Socket miCliente;

		try {
			miCliente = new Socket(host, port);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
