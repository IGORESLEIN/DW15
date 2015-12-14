
public class Asignatura {

	//def ctes
	public static final int MAX_HORAS=400;
	//def atributos
	private String codigo;
	private String nombre;
	private int horas;
	//private static int contador=0;
	//constructoras
	public Asignatura(String nombre){
		this.nombre=nombre;
		//contador++;
		//this.codigo="zub"+contador;
	}
	//metodos
	public String toString(){
		return "-("+codigo+") "+nombre+" "+horas;
	}
	//resto de metodos
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if(horas<=MAX_HORAS){
		this.horas = horas;
		}
		else{
		System.out.println("La asignatura no puede tener mas de 400 horas");
		}
	}
}
