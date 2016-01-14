import javax.swing.DefaultListModel;

public class GestorSocios {
private DefaultListModel<Socio> lstSocios=new DefaultListModel<Socio>();

public DefaultListModel<Socio> getSocios(){
	return lstSocios;
}

public void addSocio(Socio s){
	lstSocios.addElement(s);
}

public void modSocio(int ind,Socio s){
	lstSocios.setElementAt(s, ind);
}

public Socio getSocio(int ind){
	return lstSocios.getElementAt(ind);
}

public void delSocio(int ind){
	lstSocios.removeElementAt(ind);
}

}
