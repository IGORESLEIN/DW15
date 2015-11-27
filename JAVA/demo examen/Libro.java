
public class Libro {
	//-(2 puntos)Diseña la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus métodos 
	//la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su método toString para que muestre 
	//el título. Finalmente crea un programa que cree dos libros y los imprima por pantalla.
	//-(2 puntos)Mejora el ejercicio anterior:
	
	//*añade el atributo contLibros que contendrá el número total de libros creados en la aplicación, este número se incrementará cada vez
	//que se añada un libro nuevo e implementar el método getter.
	//*Independientemente de cómo se introduzca el título de los libros (mayúsculas o minúsculas) este se guardará en mayúsculas.
	//*El nombre de los autores se guardará con la primera letra de cada palabra en mayúsculas y el resto en minúsculas.
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
