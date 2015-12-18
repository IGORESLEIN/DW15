
public class Persona {

	private String nombre;
	private String dni;
	
	//constructora
	Persona(String nombre){
		this.nombre=nombre;
	}
	//metodos
	public String toString(){
		return nombre;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}

