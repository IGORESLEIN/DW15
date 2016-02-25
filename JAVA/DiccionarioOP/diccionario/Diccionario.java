package diccionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Diccionario {
	private ArrayList<Palabra> lstPalabras=new ArrayList<Palabra>();
	//definicion de métodos
	//método que va a cargar las palabras a lstPalbras de un fichero 
	public void  leer(){
		FileReader fichero = null;
	    BufferedReader pw = null;
	       try
	       {
	    	   //abrir el fichero de texto de lectura
	           fichero = new FileReader("diccionario.txt");
	           pw = new BufferedReader(fichero);
	           //leer una línea del fichero de texto
	           String linea=pw.readLine();
	           //mientras haya leido una palabra
	           
	           while (linea!=null){
	        	   //separar la información separada por comas
	        	   String[] datos=linea.split(",");
	        	   //crear una palabra con la informacion
	        	   Palabra p=new Palabra();   
	        	   p.setPalabra(datos[0]);
	        	   p.setIdioma(datos[1]);
	        	   p.setSignificado(datos[2]);
	        	   //añadir la palabra a lstPalabras
	        	   addPalabra(p);
	        	   //leer la siguiente linea del fichero
	        	   linea=pw.readLine();
	           }

	       }catch(FileNotFoundException e1){ 
	    	   //no existe el fichero de lectura
	    	   System.out.println("Fichero de lectura no encontrado");
	       }catch (Exception e) {
	           e.printStackTrace();
	       } finally {
	          try {
	          // Nuevamente aprovechamos el finally para 
	          // asegurarnos que se cierra el fichero.
	          if (null != fichero)
	             fichero.close();
	          } catch (Exception e2) {
	             e2.printStackTrace();
	          }
	       }
	
	}
	//guarda las palabras en el fichero
	public void guardar(){
		FileWriter fichero = null;
		PrintWriter pw = null;
    try{
        fichero = new FileWriter("diccionario.txt");
        pw = new PrintWriter(fichero);
        for(int i=0;i<lstPalabras.size();i++){
            //guardar los atributos de cada palabra
        	Palabra p=lstPalabras.get(i);
            pw.print(p.getPalabra()+",");
            pw.print(p.getIdioma()+",");
            pw.println(p.getSignificado());
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
       // asegurarnos que se cierra el fichero.
       if (null != fichero)
          fichero.close();
       } catch (Exception e2) {
          e2.printStackTrace();
       }
    }
	}	
	
	//añade una palabra al diccionario
	public void addPalabra(Palabra p){
		lstPalabras.add(p);
		
	}

	//elimina una palabra del diccionario
	public void delPalabra(Palabra p){
		for(int i=0;i<lstPalabras.size();i++){
			if(lstPalabras.get(i).equals(p)){
				lstPalabras.remove(i);
			}
		}
	}
	
	//devuelve las palabras q empiecen como el parámetro
	public DefaultListModel<Palabra> getPalabras(String s){
		DefaultListModel<Palabra> dlm=new DefaultListModel<Palabra>();
		//recorrer el array list
		for(int i=0;i<lstPalabras.size();i++){
			Palabra p=lstPalabras.get(i);
			//comprobar si la palabra empieza como el parametro(s)
			if(p.getPalabra().startsWith(s)){
				dlm.addElement(p);
			}
		}
		return dlm;
	}

	//modifica la palabra o por la palabra n
	public void modPalabra(Palabra o, Palabra n){
		//recorrera todas las palabras
		for(Palabra pal:lstPalabras){
			//si es la palabra q buscamos
			if(pal.equals(o)){
				//actualizar la información
				pal.setPalabra(n.getPalabra());
				pal.setIdioma(n.getIdioma());
				pal.setSignificado(n.getSignificado());
				
			}
		}
		
	}

}
