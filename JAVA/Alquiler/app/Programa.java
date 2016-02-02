package App;

import java.util.ArrayList;

import Vehiculos.Bici;
import Vehiculos.Coche;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alquilable> lstProductos=new ArrayList<Alquilable>();
		Bici b=new Bici();
		b.setColor("verde");
		b.setTipo(Bici.BTT);
		lstProductos.add(b);
		
		Coche c=new Coche();
		c.setColor("verde");
		c.setTipo(Coche.GASOIL);
		
	}

}
