package gui;

import diccionario.Diccionario;
import diccionario.Palabra;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diccionario d=new Diccionario();
		d.leer();
		//crear una palabra
		Palabra p=new Palabra();
		p.setPalabra("holita");
		d.delPalabra(p);
		d.guardar();
		
				
		
		
		/*
		//crear una palabra
		Palabra p=new Palabra();
		p.setPalabra("hola");
		p.setIdioma("español");
		p.setSignificado("saludo tradicional y campechano");
		//añadir la palabra al diccionario
		d.addPalabra(p);
		//guardar el diccionario
		d.guardar();
		*/
	}

}
