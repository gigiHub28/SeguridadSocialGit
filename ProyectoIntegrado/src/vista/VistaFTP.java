package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.MVistaFTP;

public class VistaFTP extends JFrame {

	private ArrayList<JButton> botones = new ArrayList<>();
	private ArrayList<JTextField> textos = new ArrayList<>();
	private ArrayList<JPanel> paneles = new ArrayList<>();
	private JScrollPane scroll = new JScrollPane();
	private JList lista = new JList();
	private MVistaFTP miModelo = new MVistaFTP();

	public VistaFTP() {

		propiedades();
		generarPaneles();
		generarBotones();
		generarTextos();
		configurarVista();

	}

	private void configurarVista() {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				paneles.get(i).setLayout(new BoxLayout(paneles.get(i), BoxLayout.Y_AXIS));
				paneles.get(i).add(textos.get(0));
				paneles.get(i).add(textos.get(1));
				paneles.get(i).add(lista);
				this.getContentPane().add(paneles.get(i), BorderLayout.LINE_END);
				break;

			case 1:
				paneles.get(i).setLayout(new BoxLayout(paneles.get(i), BoxLayout.X_AXIS));
				paneles.get(i).add(botones.get(0));
				paneles.get(i).add(botones.get(1));
				paneles.get(i).add(botones.get(2));
				this.getContentPane().add(paneles.get(i), BorderLayout.SOUTH);

			case 2:
				paneles.get(i).setLayout(new BoxLayout(paneles.get(i), BoxLayout.Y_AXIS));
				paneles.get(i).add(botones.get(3));
				paneles.get(i).add(botones.get(4));
				paneles.get(i).add(botones.get(5));
				this.getContentPane().add(paneles.get(i), BorderLayout.EAST);
			}
		}

	}

	private void generarBotones() {
		for (int i = 0; i < 7; i++) {
			botones.add(new JButton(miModelo.getBtnNombres()[i]));
		}
	}

	private void generarTextos() {
		for (int i = 0; i < 3; i++) {
			textos.add(new JTextField());
		}
	}

	private void generarPaneles() {
		for (int i = 0; i < 4; i++) {
			paneles.add(new JPanel());
		}

	}

	private void propiedades() {
		this.setLocation(550, 200);
		this.setSize(new Dimension(300, 300));
		this.setTitle(miModelo.getTitulo());
		this.setLayout(new BorderLayout());
		this.setResizable(false);
	}

}
