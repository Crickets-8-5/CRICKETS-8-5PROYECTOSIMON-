package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class PanelHistorial extends JPanel {

	public JTextArea jhistorial;
	public JLabel jlhistorial, h_titulo;
	private JScrollPane lista;
	private JButton b_volver;
	

	public PanelHistorial() {

		inicializarComponentes();
		setLayout(null);
	}

	public void inicializarComponentes() {

		h_titulo = new JLabel("Historial");
		h_titulo.setFont(new Font("Algerian", 20, 40));
		h_titulo.setBounds(160, 15, 250, 45);
		add(h_titulo);
		
		jhistorial = new JTextArea("");
		jhistorial.setBounds(10,60, 510, 250);
		jhistorial.setBorder(new LineBorder(null));
		jhistorial.setEditable(false);
		add(jhistorial);

		b_volver = new JButton("Volver");
		b_volver.setBounds(10,320, 100, 20);
		b_volver.setActionCommand("VOLVERHISTORIAL");
		b_volver.setBackground(Color.lightGray);
		add(b_volver);
		
		lista = new JScrollPane(jhistorial);
		lista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		lista.setBounds(10,60, 510, 250);
		add(lista);
		
		
		

		
	}

	
	public JTextArea getJhistorial() {
		return jhistorial;
	}

	
	public void setJhistorial(JTextArea jhistorial) {
		this.jhistorial = jhistorial;
	}

	
	public JLabel getJlhistorial() {
		return jlhistorial;
	}

	
	public void setJlhistorial(JLabel jlhistorial) {
		this.jlhistorial = jlhistorial;
	}

	
	public JScrollPane getLista() {
		return lista;
	}

	
	public void setLista(JScrollPane lista) {
		this.lista = lista;
	}

	public JLabel getH_titulo() {
		return h_titulo;
	}

	public void setH_titulo(JLabel h_titulo) {
		this.h_titulo = h_titulo;
	}

	public JButton getB_volver() {
		return b_volver;
	}

	public void setB_volver(JButton b_volver) {
		this.b_volver = b_volver;
	}

}