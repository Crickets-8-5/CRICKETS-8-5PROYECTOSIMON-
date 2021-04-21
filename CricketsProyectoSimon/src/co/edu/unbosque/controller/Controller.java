package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.persistence.OperacionArchivo;
import co.edu.unbosque.view.VentanaJuego;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.PanelHistorial;
import co.edu.unbosque.view.VentanaHistorial;
import co.edu.unbosque.view.VentanaInstrucciones;

public class Controller implements ActionListener {

	private VentanaPrincipal vPrincipal;
	private VentanaJuego vJuego;
	private VentanaInstrucciones vInstrucciones;
	private Operaciones op;
	private VentanaHistorial vHistorial;
	private ArrayList<String> numerobotones;
	private OperacionArchivo operacion;
	private boolean accion = true;
	private String numeros;

	public Controller() {
		operacion = new OperacionArchivo();

		vPrincipal = new VentanaPrincipal();
		vJuego = new VentanaJuego();
		vInstrucciones = new VentanaInstrucciones();

		op = new Operaciones();
		numerobotones = new ArrayList<String>();
		vHistorial = new VentanaHistorial();

		agregarHistorial(null);
		asignarOyentes();

		do {

			metodoSleep();
		} while (accion == true);

	}

	public void asignarOyentes() {

		vPrincipal.getPrincipal().getB_instru().addActionListener(this);
		vPrincipal.getPrincipal().getB_jugar().addActionListener(this);
		vPrincipal.getPrincipal().getB_historial().addActionListener(this);
		vInstrucciones.getPtuto().getB_menu().addActionListener(this);
		vInstrucciones.getPtuto().getB_play().addActionListener(this);
		vJuego.getpJuego().getB_menu().addActionListener(this);
		vJuego.getpJuego().getInicio().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_1().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_2().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_3().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_4().addActionListener(this);
		vJuego.getpJuego().getpJugador().getB_verificar().addActionListener(this);
		vHistorial.getPhistorial().getB_volver().addActionListener(this);
		vPrincipal.getPrincipal().getCre().addActionListener(this);

	}

	int contador = 4;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String lista = "";

		if (arg0.getActionCommand().equals("CREDITOS")) {
			op.credits();
		} else

		if (arg0.getActionCommand().equals("VOLVER")) {
			vJuego.setVisible(false);
			vInstrucciones.setVisible(false);
			vPrincipal.setVisible(true);
			vJuego.getpJuego().getpJugador().getC_lista().setText("");
			numerobotones.clear();
			op.numAleatorios(contador).clear();

		} else

		if (arg0.getActionCommand().equals("INSTRUCCIONES")) {
			vInstrucciones.setVisible(true);
			vPrincipal.setVisible(false);
		} else

		if (arg0.getActionCommand().equals("PLAY")) {
			vJuego.setVisible(true);
			vInstrucciones.setVisible(false);
			vPrincipal.setVisible(false);

		} else

		if (arg0.getActionCommand().equals("JUGAR")) {
			vJuego.setVisible(true);
			vInstrucciones.setVisible(false);
			vPrincipal.setVisible(false);

		} else

		if (arg0.getActionCommand().equals("HISTORIAL")) {

			vJuego.setVisible(false);
			vPrincipal.setVisible(false);
			vInstrucciones.setVisible(false);
			vHistorial.setVisible(true);

		} else

		if (arg0.getActionCommand().equals("VOLVERHISTORIAL")) {
			vJuego.setVisible(false);
			vInstrucciones.setVisible(false);
			vPrincipal.setVisible(true);
			vHistorial.setVisible(false);

		}

		if (arg0.getActionCommand().equals("INICIO")) {

			vJuego.setVisible(true);
			vPrincipal.setVisible(false);
			vInstrucciones.setVisible(false);
			op.numAleatorios(contador).clear();
			vJuego.getpJuego().getpJugador().getC_lista().setText("" + op.numAleatorios(contador));
			accion = true;

		} else

		if (arg0.getActionCommand().equals("UNO")) {

			if (numerobotones.size() < 4) {
				numerobotones.add("1");

			} else

				JOptionPane.showMessageDialog(null, "ya ha hecho todos sus movimientos");

		} else

		if (arg0.getActionCommand().equals("DOS")) {

			if (numerobotones.size() < 4) {
				numerobotones.add("2");

			} else
				JOptionPane.showMessageDialog(null, "ya ha hecho todos sus movimientos");

		} else

		if (arg0.getActionCommand().equals("TRES")) {

			if (numerobotones.size() < 4) {
				numerobotones.add("3");

			} else
				JOptionPane.showMessageDialog(null, "ya ha hecho todos sus movimientos");

		} else

		if (arg0.getActionCommand().equals("CUATRO")) {

			if (numerobotones.size() < 4) {
				numerobotones.add("4");

			} else

				JOptionPane.showMessageDialog(null, "Ya ha realizado todos sus movimientos");

		} else if (arg0.getActionCommand().equals("TERMINAR")) {
			int cont = 0;

			if (numerobotones.size() == 4) {
				for (int i = 0; i < 4; i++) {

					if (op.numAleatorios(contador).get(i).equals(numerobotones.get(i))) {

						cont += 1;
					}
				}

				if (cont == 4) {

					JOptionPane.showMessageDialog(null, "¡ GANASTE :) !");
					numeros = "La jugada fue: " + " [";
					ArrayList<String> aux = op.numAleatorios(contador);
					for (int i = 0; i < 4; i++) {
						if (i == 3) {
							numeros += aux.get(i) + "]";
						} else {
							numeros += aux.get(i) + ", ";
						}
					}
					numeros += "  ha ganado";
					numerobotones.clear();
					op.numAleatorios(contador).clear();

				} else if (cont != 4) {
					JOptionPane.showMessageDialog(null, "¡ PERDISTE :( !");
					numeros = "La jugada fue: " + " [";
					ArrayList<String> aux = op.numAleatorios(contador);
					for (int i = 0; i < 4; i++) {
						if (i == 3) {
							numeros = numeros + aux.get(i) + "]";
						} else {
							numeros = numeros + aux.get(i) + ",";
						}
					}
					numeros += "  ha perdido";
					numerobotones.clear();
					op.numAleatorios(contador).clear();

				}
			} else {

				JOptionPane.showMessageDialog(null, "No ha realizado todos sus movimientos");
				numerobotones.clear();
				op.numAleatorios(contador).clear();
			}

			agregarHistorial(numeros);

		}

	}

	public void agregarHistorial(String numeros) {
		String leido = operacion.leerArchivo();
		String aux="";
		if (numeros != null) {
			leido += numeros + ";";
		}
		operacion.escribirArchivo(leido);
		numeros = "";
		String split[] = operacion.leerArchivo().split(";"); 
		for (int i = 0; i < split.length; i++) {
		
		aux +="\n"+split[i];
		vHistorial.getPhistorial().getJhistorial().setText(aux + "\n");
		}

	}

	public void metodoSleep() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vJuego.getpJuego().getpJugador().getC_lista().setText("");

	}
}
