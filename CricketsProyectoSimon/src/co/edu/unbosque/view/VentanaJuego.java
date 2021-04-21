package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;


public class VentanaJuego extends JFrame {

	private PanelJuego pJuego;
	private PanelImagen pImagenjuego;
	private JLayeredPane lPane;

	public VentanaJuego() {
		
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);

		inicializarComponentes();
	
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}

	public void inicializarComponentes() {
		
		pJuego = new PanelJuego();
		pJuego.setBounds(5, 5, 573, 550);
		getContentPane().add(pJuego);
				

	}

	public PanelJuego getpJuego() {
		return pJuego;
	}

	public void setpJuego(PanelJuego pJuego) {
		this.pJuego = pJuego;
	}

}