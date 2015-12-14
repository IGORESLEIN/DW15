import javax.swing.DefaultListModel;

public class GestorAsignaturas {

	private DefaultListModel<Asignatura> tAsignatura=
	new DefaultListModel<Asignatura>();
	
	public void addAsignatura(Asignatura a){
		tAsignatura.addElement(a);
	}
	public void delAsignatura(int ind){
		tAsignatura.removeElementAt(ind);
	}
	public void modAsignatura(int ind, Asignatura a){
		tAsignatura.setElementAt(a, ind);
	}	
	public Asignatura getAsignatura(int ind){
		return tAsignatura.getElementAt(ind);
	}
	public DefaultListModel getAsignatura(){
		return tAsignatura;
	}
}
