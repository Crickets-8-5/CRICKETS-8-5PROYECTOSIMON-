package co.edu.unbosque.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class OperacionArchivo {
	private File f;
	private FileInputStream fis;
	private InputStreamReader isr;
	private BufferedReader linea;
	
	public OperacionArchivo() {
		f= new File("Data/historial.txt");
		
		
	}
		
	public String leerArchivo () {
		String linea = "";
		String cadena = "";
		
	    try {
	    	FileReader fr = new FileReader(f);
	    	BufferedReader br = new BufferedReader(fr);
	    	linea = br.readLine();
	    	while (linea != null) {
	    		cadena += linea;
	    		linea = br.readLine();
	    	}
	    	fr.close();
	    	
	    } catch (IOException e){
			return null;
	   
	    }
	    return cadena;
	}
	
	
	public void escribirArchivo(String texto) {
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader linea = new BufferedReader(isr);
			FileWriter lineaatx = new FileWriter(f);
			String linea_arch = texto;
			lineaatx.write(linea_arch);
			lineaatx.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
