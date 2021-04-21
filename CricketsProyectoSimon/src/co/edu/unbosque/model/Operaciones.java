package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Operaciones extends Créditos {

	private ArrayList<String> numeros;
	
	

	public Operaciones() {
		
		numeros=new ArrayList<String>();
		
		
	}

	public ArrayList<String> numAleatorios(int tamNumero) {
		String resul = "";
		for (int i = 1; i <= tamNumero; i++) {

			int random = (int) (Math.floor(Math.random() * (4)) + 1);
			resul = String.valueOf(random);
			numeros.add(resul);
		}

		return numeros;
	}
	
	@Override
	public String credits() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "BRAYAN CAMILO FRANCO\nDAVID MILLÁN\nJORGE GARCÍA\nJULIAN DAVID GUZMÁN", "CRÉDITOS" , 3);
		
		return null;
		
	}

}
