
public class LibroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro();
			//-(2 puntos)Diseña la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus métodos 
			//la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su método toString para que muestre 
			//el título. Finalmente crea un programa que cree dos libros y los imprima por pantalla.
		//liborMejor();
				//-(2 puntos)Mejora el ejercicio anterior:
				//*añade el atributo contLibros que contendrá el número total de libros creados en la aplicación, este número se incrementará cada vez
				//que se añada un libro nuevo e implementar el método getter.
				//*Independientemente de cómo se introduzca el título de los libros (mayúsculas o minúsculas) este se guardará en mayúsculas.
				//*El nombre de los autores se guardará con la primera letra de cada palabra en mayúsculas y el resto en minúsculas.
		
	}
	public static void Libro(){
		Libro libro1=new Libro("HarryPotter");
		Libro libro2=new Libro("JuegodeTronos");
		Libro libro3=new Libro("JuegodeTronos2");
		Libro libro4=new Libro("JuegodeTronos3");
		System.out.println(libro1+" "+libro2);
		libro3.setAutor("igor");
		System.out.println(libro3.getAutor());
		System.out.println(Libro.getContLibros());
	}
}
