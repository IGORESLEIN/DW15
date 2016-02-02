package Vehiculos;

import App.Alquilable; 

public class Coche extends Vehiculo implements Alquilable {
	
	public static final int GASOIL=0;
	public static final int GASOLINA=1;
	public static final int HIBRIDO=2;
	public static final int ELECTRICO=3;
	private int tipo;
	private String color;
	private double precio;
	private boolean libre;

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
