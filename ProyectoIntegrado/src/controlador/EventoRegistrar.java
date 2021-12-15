package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexion.ConexionBD;
import modelo.ModeloConsultas;
import modelo.Usuario;
import vista.VistaRegistro;

public class EventoRegistrar implements ActionListener {

	private ConexionBD miConexion;
	private VistaRegistro miRegistro;
	private Usuario miUsuario;
	private ModeloConsultas consultas;

	public EventoRegistrar(ConexionBD miConexion, VistaRegistro miRegistro, Usuario miUsuario,
			ModeloConsultas consultas) {
		this.miConexion = miConexion;
		this.miRegistro = miRegistro;
		this.miUsuario = miUsuario;
		this.consultas = consultas;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Usuario miUsuario;
		boolean existe;
		String tipoUsuario;
		String nuevoPass;
		String passwd = new String(miRegistro.getContra().getPassword());
		String passwdConfirmar = new String(miRegistro.getContraConfirmar().getPassword());

		if (miRegistro.getTxtUsuario().getText().equals("") || miRegistro.getTxtApells().getText().equals("")
				|| miRegistro.getTxtEmail().getText().equals("") || miRegistro.getTxtNombreUsu().getText().equals("")
				|| passwd.equals("") || passwdConfirmar.equals("")) {

			JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

		} else {
			existe = miConexion.existeUsusuario(consultas.getExisteUsuario(miRegistro.getTxtNombreUsu().getText(),
					miRegistro.getTxtEmail().getText()));

			if (!existe) {
				if (passwd.equals(passwdConfirmar)) {
					nuevoPass = Hash.sha1(passwd);
					tipoUsuario = (String) miRegistro.getTipoUsu().getSelectedItem();

					miUsuario = new Usuario(miRegistro.getTxtUsuario().getText(), miRegistro.getTxtApells().getText(),
							miRegistro.getTxtNombreUsu().getText(), passwd, miRegistro.getTxtEmail().getText(),
							tipoUsuario);

					if (miConexion.insertUsuario(miUsuario, consultas.getSqlInsert())) {
						JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No ha podido registrarse. Inténtelo de nuevo", "",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado", "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
