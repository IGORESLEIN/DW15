package Vehiculos;

import App.Alquilable;

public class Bici extends Vehiculo implements Alquilable {
	
	public static final int BTT=0;
	public static final int CARRETERA=1;
	public static final int EBIKE=2;
	private String color;
	private int tipo;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
