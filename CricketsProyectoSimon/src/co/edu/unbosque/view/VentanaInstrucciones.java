package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaInstrucciones extends JFrame {

	private PanelInstrucciones pinstrucciones;
	
	public VentanaInstrucciones() {
		
		setTitle("Instrucciones");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);	
	}
	
	private void inicializarComponentes() {
		pinstrucciones = new PanelInstrucciones();
		pinstrucciones.setBounds(10,10,765,540);
		getContentPane().add(pinstrucciones);
	}

	public PanelInstrucciones getPtuto() {
		return pinstrucciones;
	}

	public void setPtuto(PanelInstrucciones ptuto) {
		this.pinstrucciones = ptuto;
	}
	
}
