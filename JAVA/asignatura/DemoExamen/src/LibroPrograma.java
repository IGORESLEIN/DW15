
public class LibroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro();
			//-(2 puntos)Dise�a la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus m�todos 
			//la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su m�todo toString para que muestre 
			//el t�tulo. Finalmente crea un programa que cree dos libros y los imprima por pantalla.
		//liborMejor();
				//-(2 puntos)Mejora el ejercicio anterior:
				//*a�ade el atributo contLibros que contendr� el n�mero total de libros creados en la aplicaci�n, este n�mero se incrementar� cada vez
				//que se a�ada un libro nuevo e implementar el m�todo getter.
				//*Independientemente de c�mo se introduzca el t�tulo de los libros (may�sculas o min�sculas) este se guardar� en may�sculas.
				//*El nombre de los autores se guardar� con la primera letra de cada palabra en may�sculas y el resto en min�sculas.
		
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
