package co.edu.unbosque.view;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaPrincipal extends JFrame{

	private PanelPrincipal principal;
	private PanelImagen pImagen;
	private JLayeredPane lPane;
	
	
	public VentanaPrincipal() {
		
		setTitle("Menú Principal");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	

public void inicializarComponentes() {
		
		principal = new PanelPrincipal();
		principal.setBounds(5, 5, 475,350);
		principal.setOpaque(false);
		getContentPane().add(principal);
		
		lPane = new JLayeredPane();
		lPane.setBounds(0, 0, 400, 400);
		getContentPane().add(lPane);
		
		pImagen = new PanelImagen();
		pImagen.setBounds(5, 5, 600, 600);
		pImagen.setOpaque(true);
		lPane.add(pImagen, new Integer(0), 0);
	}

	public PanelPrincipal getPrincipal() {
		return principal;
	}

	public void setPrincipal(PanelPrincipal principal) {
		this.principal = principal;
	}

	public PanelImagen getpImagen() {
		return pImagen;
	}

	public void setpImagen(PanelImagen pImagen) {
		this.pImagen = pImagen;
	}

	public JLayeredPane getlPane() {
		return lPane;
	}

	public void setlPane(JLayeredPane lPane) {
		this.lPane = lPane;
	}
	
	
	
}
