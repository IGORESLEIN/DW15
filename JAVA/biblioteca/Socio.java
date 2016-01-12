import javax.swing.DefaultListModel;

public class Socio {

	private String dni;
	private String nombre;
	private String direccion;
	private String tlfno;
	private int numSocio;
	private int numMaxPrest;
	private DefaultListModel<Libro> lista=new DefaultListModel<Libro>();
	
	public String toString() {
		return "Socio= " + nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTlfno() {
		return tlfno;
	}
	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	public int getNumMaxPrest() {
		return numMaxPrest;
	}
	public void setNumMaxPrest(int numMaxPrest) {
		this.numMaxPrest = numMaxPrest;
	}
	
	
}
