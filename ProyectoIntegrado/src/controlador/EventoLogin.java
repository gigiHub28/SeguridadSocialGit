package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexion.ConexionBD;
import modelo.ModeloConsultas;
import vista.VistaLogin;

public class EventoLogin implements ActionListener {

	private ConexionBD miConexion;
	private ModeloConsultas consultas;
	private VistaLogin vLogin;

	public EventoLogin(ConexionBD miConexion, ModeloConsultas consultas, VistaLogin vLogin) {
		this.consultas = consultas;
		this.miConexion = miConexion;
		this.vLogin = vLogin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String passwd = vLogin.getPassword().getPassword().toString();

		if (miConexion.existeUsusuario(consultas.getNomUsuario(vLogin.getDni().getText(), passwd))) {
			JOptionPane.showMessageDialog(null, "si", "",
					JOptionPane.ERROR_MESSAGE);
			// VistFTP.setVisible(true);
		} else {

			JOptionPane.showMessageDialog(null, "Dni o contraseña incorrectos", "",
					JOptionPane.ERROR_MESSAGE);
			
		}

	}

}
