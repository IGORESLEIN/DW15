import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class GestorJugadores {

	private DefaultListModel<Jugador> lstJugadores=new DefaultListModel<Jugador>();

	public DefaultListModel<Jugador> getJugador(){
		return lstJugadores;
	}

	public void addJugador(Jugador j){
		lstJugadores.addElement(j);;
	}

	public void modJugador(int ind,Jugador s){
		lstJugadores.setElementAt(s, ind);
	}

	public Jugador getJugador(int ind){
		return lstJugadores.getElementAt(ind);
	}

	public void delJugador(int ind){
		lstJugadores.removeElementAt(ind);
	}
}
