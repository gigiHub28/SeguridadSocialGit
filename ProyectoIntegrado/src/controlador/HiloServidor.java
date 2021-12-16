package controlador;

import java.net.Socket;

public class HiloServidor implements Runnable {

	private Thread t;
	private Socket cliente;
	private Tuberia miTuberia;

	public HiloServidor(Socket cliente, Tuberia miTuberia) {
		this.t = new Thread(this);
		this.cliente = cliente;
		this.miTuberia = miTuberia;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
