package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelJuego extends JPanel {

	private JButton b_menu, inicio;
	private PanelJugador pJugador;

	public PanelJuego() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		
		pJugador = new PanelJugador();
		pJugador.setBounds(10, 40, 553, 500);
		pJugador.getB_verificar().setActionCommand("TERMINAR");
		add(pJugador);
		setBackground(new Color(111, 111, 111));
		setBorder(new LineBorder(new Color(190, 255, 237)));
		

		b_menu = new JButton("VOLVER");
		b_menu.setBounds(443, 5, 120, 30);
		b_menu.setActionCommand("VOLVER");
		add(b_menu);

		inicio = new JButton("JUGAR");
		inicio.setActionCommand("INICIO");
		inicio.setBounds(10, 5, 120, 30);
		add(inicio);
		
		
	}

	public PanelJugador getpJugador() {
		return pJugador;
	}

	public void setpJugador(PanelJugador pJugador) {
		this.pJugador = pJugador;
	}

	public JButton getB_menu() {
		return b_menu;
	}

	public void setB_menu(JButton b_menu) {
		this.b_menu = b_menu;
	}

	public JButton getInicio() {
		return inicio;
	}

	public void setInicio(JButton inicio) {
		this.inicio = inicio;
	}

}
