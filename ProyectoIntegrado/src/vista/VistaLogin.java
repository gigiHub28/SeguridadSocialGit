package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.MVistaLogin;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField dni;
	private JPasswordField password;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	JButton btnRegister;
	JButton btnEnter;
	private MVistaLogin login = new MVistaLogin();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VistaLogin frame = new VistaLogin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public VistaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel(login.getLbltitulo());
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 26));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(76, 78, 240, 40);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(login.getUrlImg()));
		lblNewLabel_1.setBounds(0, 10, 378, 50);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(login.getLblDNI());
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel_2.setBounds(76, 137, 71, 27);
		contentPane.add(lblNewLabel_2);
		
		dni = new JTextField();
		dni.setBounds(75, 168, 226, 19);
		contentPane.add(dni);
		dni.setColumns(10);
		
		lblNewLabel_3 = new JLabel(login.getLblPswdd());
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel_3.setBounds(75, 203, 121, 36);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel(login.getLblRegister());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_4.setBounds(75, 272, 141, 13);
		contentPane.add(lblNewLabel_4);
		
		btnRegister = new JButton(login.getBtRegistrarse());
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRegister.setBounds(218, 270, 84, 21);
		contentPane.add(btnRegister);
		
		password = new JPasswordField();
		password.setBounds(75, 244, 226, 19);
		contentPane.add(password);
		
		btnEnter = new JButton(login.getBtEntrar());
		btnEnter.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setBounds(125, 315, 125, 44);
		contentPane.add(btnEnter);
	}

	public JTextField getDni() {
		return dni;
	}

	public void setDni(JTextField dni) {
		this.dni = dni;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}

	public JButton getBtnEnter() {
		return btnEnter;
	}

	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}
	
	
}