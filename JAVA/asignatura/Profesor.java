public class Profesor extends Persona{

	private String titulo;
	//contructoras
	Profesor(String nombre){
		//llamo a la constructora de mi padre
		super(nombre);
		
	}
	//metodos getter&setter
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	//resto de m�todos
	public String toString(){
		return super.toString()+"-"+getTitulo();
	}
}

