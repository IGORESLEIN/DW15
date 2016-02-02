package Viviendas;

import App.Alquilable;

public abstract class Vivienda implements Alquilable {
	 private String poblacion;
	 private String direccion;
	 private boolean ascensor;
	 private boolean libre;
	 private double precio;
	 
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public boolean isDisponible() {
		// TODO Auto-generated method stub
		return libre;
	}

	@Override
	public void ocupar() {
		// TODO Auto-generated method stub
		libre=false;
	}

	@Override
	public void librar() {
		// TODO Auto-generated method stub
		libre=true;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isAscensor() {
		return ascensor;
	}

	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
