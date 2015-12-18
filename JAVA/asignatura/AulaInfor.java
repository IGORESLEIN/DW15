import java.util.ArrayList;

public class AulaInfor extends Aula{
	
	private ArrayList<Ordenador> lstOrden=new ArrayList<Ordenador>();
	AulaInfor(int numAlum){
		super(numAlum);
	}
	public Ordenador getorden(String codigo){
		for(int i=0;i<lstOrden.size();i++){
			if(lstOrden.get(i).getCodigo().equals(codigo)){
				return lstOrden.get(i);
			}
		}
		return new Ordenador("");
	}
	public void addOrden(Ordenador o){
		lstOrden.add(o);
	}
	public void delOrden(String codigo){
		for(int i=0;i<lstOrden.size();i++){
			if(lstOrden.get(i).getCodigo().equals(codigo)){
				lstOrden.remove(i);
				break;
			}
		}
	}
	public void modOrden(String codigo, Ordenador o){
		for(int i=0;i<lstOrden.size();i++){
			if(lstOrden.get(i).getCodigo().equals(codigo)){
				lstOrden.set(i, o);
				break;
			}
		}
	}
	public void escribeOrden(){
		for(int i=0;i<lstOrden.size();i++){
			System.out.println(lstOrden.get(i));
		}
	}
}
