package co.edu.unbosque.view;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class VentanaHistorial extends JFrame{

	private PanelHistorial phistorial;
	
	public VentanaHistorial() {
		
		setTitle("Simon");
		setSize(550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		
		phistorial = new PanelHistorial();
		phistorial.setBounds(5, 5, 525,350);
		getContentPane().add(phistorial);
		
	}
	public PanelHistorial getPhistorial() {
		return phistorial;
	}
	public void setPhistorial(PanelHistorial phistorial) {
		this.phistorial = phistorial;
	}

	
}