package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelJugador extends JPanel {

	
	private JTextArea c_lista;
	private JButton b_1, b_2, b_3, b_4, b_verificar;

	public JButton getB_verificar() {
		return b_verificar;
	}

	public void setB_verificar(JButton b_verificar) {
		this.b_verificar = b_verificar;
	}

	public PanelJugador() {
		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBorder(new LineBorder(Color.darkGray));
		
		c_lista = new JTextArea("");
		c_lista.setBounds(170, 20, 160, 60);
		c_lista.setBorder(new LineBorder(null));
		c_lista.setFont(c_lista.getFont().deriveFont(35f));
		c_lista.setEditable(false);
		add(c_lista);

		b_1 = new JButton("1");
		b_1.setBackground(Color.GREEN);
		b_1.setActionCommand("UNO");
		b_1.setBounds(100, 100, 160, 160);
		add(b_1);

		b_2 = new JButton("2");
		b_2.setBackground(Color.RED);
		b_2.setActionCommand("DOS");
		b_2.setBounds(262, 100, 160, 160);
		add(b_2);

		b_3 = new JButton("3");
		b_3.setBackground(Color.YELLOW);
		b_3.setActionCommand("TRES");
		b_3.setBounds(100, 262, 160, 160);
		add(b_3);

		b_4 = new JButton("4");
		b_4.setBackground(Color.blue);
		b_4.setActionCommand("CUATRO");
		b_4.setBounds(262, 262, 160, 160);
		add(b_4, BorderLayout.CENTER);

		b_verificar = new JButton("TERMINAR");
		b_verificar.setActionCommand("RESULTADO");
		b_verificar.setBounds(190, 440, 140, 50);
		add(b_verificar);

	}

	

	public JTextArea getC_lista() {
		return c_lista;
	}

	public void setC_lista(JTextArea c_lista) {
		this.c_lista = c_lista;
	}

	public JButton getB_1() {
		return b_1;
	}

	public void setB_1(JButton b_1) {
		this.b_1 = b_1;
	}

	public JButton getB_2() {
		return b_2;
	}

	public void setB_2(JButton b_2) {
		this.b_2 = b_2;
	}

	public JButton getB_3() {
		return b_3;
	}

	public void setB_3(JButton b_3) {
		this.b_3 = b_3;
	}

	public JButton getB_4() {
		return b_4;
	}

	public void setB_4(JButton b_4) {
		this.b_4 = b_4;
	}

}
