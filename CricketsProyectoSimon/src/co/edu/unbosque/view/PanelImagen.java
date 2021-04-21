package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{
	
	private ImageIcon im;

	public PanelImagen() {
		
	}
	
	public void paint (Graphics g) {
		Dimension tam = getSize();
		im =  new ImageIcon(getClass().getResource("/imagenes/imagen2.jpg"));
		g.drawImage(im.getImage(), 75,0 , 325, 350, null);
		setOpaque(false);
		super.paint(g);
	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}

	
	
}
