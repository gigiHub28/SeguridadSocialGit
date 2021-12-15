package controlador;

import conexion.ConexionBD;
import modelo.ModeloConsultas;
import modelo.Usuario;
import vista.VistaRegistro;

public class CSeguridadSocial {

	private static VistaRegistro miRegistro = new VistaRegistro();
	private static ConexionBD miConexion = new ConexionBD();
	private static Auxiliar miHash = new Auxiliar();
	private static Usuario miUsuario = new Usuario();
	private static ModeloConsultas consultas = new ModeloConsultas();

	public static void main(String[] args) {

		miConexion.crearConexion();
		miRegistro.setVisible(true);
		generarEventoRegistro();
	}

	private static void generarEventoRegistro() {
		miRegistro.getRegistrarse().addActionListener(new EventoRegistrar(miConexion, miRegistro, miUsuario, consultas));

	}

}