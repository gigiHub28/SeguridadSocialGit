package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import modelo.MVistaRegistro;

public class VistaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtApells;
	private JTextField txtNombreUsu;
	private JTextField txtEmail;
	private JPasswordField contra;
	private JPasswordField contraConfirmar;
	private JComboBox tipoUsu;
	private MVistaRegistro miModelo = new MVistaRegistro();
	private JButton btnRegistro;

	/**
	 * Create the frame.
	 */
	public VistaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 439);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(miModelo.getLblName());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(72, 129, 85, 19);
		contentPane.add(lblNewLabel);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(279, 131, 260, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(miModelo.getLblApellidos());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(72, 166, 85, 13);
		contentPane.add(lblNewLabel_1);

		txtApells = new JTextField();
		txtApells.setBounds(279, 165, 260, 19);
		contentPane.add(txtApells);
		txtApells.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel(miModelo.getLblNomUser());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(72, 203, 161, 13);
		contentPane.add(lblNewLabel_2);

		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(279, 202, 260, 19);
		contentPane.add(txtNombreUsu);
		txtNombreUsu.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel(miModelo.getLblPassw());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(72, 236, 149, 19);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(miModelo.getLblCorreo());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(72, 309, 168, 13);
		contentPane.add(lblNewLabel_4);

		txtEmail = new JTextField();
		txtEmail.setBounds(279, 308, 260, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel(miModelo.getLblTipoUser());
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(72, 356, 153, 13);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel(miModelo.getLblTitle());
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblNewLabel_6.setBounds(279, 72, 267, 49);
		contentPane.add(lblNewLabel_6);

		tipoUsu = new JComboBox();
		tipoUsu.addItem(miModelo.getBoxFuncionario());
		tipoUsu.addItem(miModelo.getBoxEmpresario());
		tipoUsu.setBounds(279, 354, 161, 21);
		contentPane.add(tipoUsu);

		btnRegistro = new JButton(miModelo.getBtnRegistro());
		btnRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegistro.setBounds(607, 341, 149, 38);
		contentPane.add(btnRegistro);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(miModelo.getRutaIcono()));
		lblNewLabel_7.setBounds(0, 0, 399, 54);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(miModelo.getLblConfirmacion());
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(72, 275, 182, 13);
		contentPane.add(lblNewLabel_8);
		
		contra = new JPasswordField();
		contra.setBounds(279, 238, 260, 19);
		contentPane.add(contra);
		
		contraConfirmar = new JPasswordField();
		contraConfirmar.setBounds(279, 274, 260, 19);
		contentPane.add(contraConfirmar);
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtApells() {
		return txtApells;
	}

	public void setTxtApells(JTextField txtApells) {
		this.txtApells = txtApells;
	}

	public JTextField getTxtNombreUsu() {
		return txtNombreUsu;
	}

	public void setTxtNombreUsu(JTextField txtNombreUsu) {
		this.txtNombreUsu = txtNombreUsu;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JButton getRegistrarse() {
		return btnRegistro;
	}

	public void setRegistrarse(JButton registrarse) {
		this.btnRegistro = registrarse;
	}

	public JPasswordField getContra() {
		return contra;
	}

	public void setContra(JPasswordField contra) {
		this.contra = contra;
	}

	public JPasswordField getContraConfirmar() {
		return contraConfirmar;
	}

	public void setContraConfirmar(JPasswordField contraConfirmar) {
		this.contraConfirmar = contraConfirmar;
	}

	public JComboBox getTipoUsu() {
		return tipoUsu;
	}

	public void setTipoUsu(JComboBox tipoUsu) {
		this.tipoUsu = tipoUsu;
	}
	
	
}