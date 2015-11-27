
public class Libro {
	//-(2 puntos)Dise�a la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus m�todos 
	//la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su m�todo toString para que muestre 
	//el t�tulo. Finalmente crea un programa que cree dos libros y los imprima por pantalla.
	//-(2 puntos)Mejora el ejercicio anterior:
	
	//*a�ade el atributo contLibros que contendr� el n�mero total de libros creados en la aplicaci�n, este n�mero se incrementar� cada vez
	//que se a�ada un libro nuevo e implementar el m�todo getter.
	//*Independientemente de c�mo se introduzca el t�tulo de los libros (may�sculas o min�sculas) este se guardar� en may�sculas.
	//*El nombre de los autores se guardar� con la primera letra de cada palabra en may�sculas y el resto en min�sculas.
	private String titulo;
	private String autor;
	private int hojas;
	public static int contLibros;
	
	//contructora
	public Libro(String titulo){
		this.titulo=titulo.toUpperCase();
		this.contLibros++;
	}
	//otros metodos
	public String toString(){
		return titulo;
	}
	//getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		autor=autor.substring(0,1).toUpperCase()+autor.substring(1,autor.length());
		this.autor=autor;
	}
	public int getHojas() {
		return hojas;
	}
	public void setHojas(int hojas) {
		this.hojas = hojas;
	}
	public static int getContLibros() {
		return contLibros;
	}
	public void setContLibros(int contlibros) {
		this.contLibros = contlibros;
	}
	
}
