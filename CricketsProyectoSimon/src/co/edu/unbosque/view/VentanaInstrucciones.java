package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaInstrucciones extends JFrame {

	private PanelInstrucciones pinstrucciones;
	private PanelImagenInstrucciones pImagen;
	private JLayeredPane lPane;
	
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
		pinstrucciones.setOpaque(false);
		getContentPane().add(pinstrucciones);
		
		lPane = new JLayeredPane();
		lPane.setBounds(0, 0, 900, 900);
		getContentPane().add(lPane);
		
		pImagen = new PanelImagenInstrucciones();
		pImagen.setBounds(10, 10, 1000, 2198);
		pImagen.setOpaque(true);
		lPane.add(pImagen, new Integer(0), 0);
	}

	public PanelInstrucciones getPtuto() {
		return pinstrucciones;
	}

	public void setPtuto(PanelInstrucciones ptuto) {
		this.pinstrucciones = ptuto;
	}
	
}
