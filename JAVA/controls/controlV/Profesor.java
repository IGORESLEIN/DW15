public class Profesor {
	//def atributos
	private String nombre;
	private String apellido;
	private String dni;
	private Asignatura asignatura;
	
	//contructora	
	public Profesor(String nombre, String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
	}
	//metodos
	public String toString(){
		return getNombre()+" "+getApellido();
	}
	
	//getters setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asig1) {
		this.asignatura = asig1;
	}
	
}

