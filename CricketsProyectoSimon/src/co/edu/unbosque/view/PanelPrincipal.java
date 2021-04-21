package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelPrincipal extends JPanel {

	private JLabel e_titulo;
	private JButton b_instru, b_jugar, b_historial, cre;

	public PanelPrincipal() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("SIMON");
		e_titulo.setForeground(Color.cyan);
		e_titulo.setFont(new Font("Algerian", 20, 40));
		e_titulo.setBounds(180, 110, 264, 45);
		add(e_titulo);

		b_instru = new JButton("Instrucciones");
		b_instru.setActionCommand("INSTRUCCIONES");
		b_instru.setBounds(160, 210, 155, 30);
		b_instru.setBackground(Color.lightGray);
		add(b_instru);

		b_jugar = new JButton("Jugar");
		b_jugar.setActionCommand("JUGAR");
		b_jugar.setBounds(160, 170, 155, 30);
		b_jugar.setBackground(Color.lightGray);
		add(b_jugar);

		b_historial = new JButton("Historial");
		b_historial.setActionCommand("HISTORIAL");
		b_historial.setBounds(160, 250, 155, 30);
		b_historial.setBackground(Color.lightGray);
		add(b_historial);

		cre = new JButton("INFO");
		cre.setActionCommand("CREDITOS");
		cre.setBounds(399, 305, 70, 40);
		cre.setBackground(Color.lightGray);
		add(cre);

	}

	public JButton getB_historial() {
		return b_historial;
	}

	public void setB_historial(JButton b_historial) {
		this.b_historial = b_historial;
	}

	public JButton getB_instru() {
		return b_instru;
	}

	public void setB_instru(JButton b_instru) {
		this.b_instru = b_instru;
	}

	public JButton getB_jugar() {
		return b_jugar;
	}

	public void setB_jugar(JButton b_jugar) {
		this.b_jugar = b_jugar;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getCre() {
		return cre;
	}

	public void setCre(JButton cre) {
		this.cre = cre;
	}
}
