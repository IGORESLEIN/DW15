
public class Candado implements ICandado {
	private int clave;
	private boolean abierto;
	

	public Candado(int clave) {
		// TODO Auto-generated constructor stub
		this.clave=clave;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public boolean isAbierto() {
		return abierto;
	}
	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	
public boolean abrir(Object clave){
	
	//si esta abierto devolver false
	if(abierto){
		return false;
	}else{
		//si no->si la clave no coincide devolver false
		if(((Integer)clave)!=this.clave){
			return false;
		}else{
			//si no->abierto=true y devolver true
			abierto=true;
			return true;
		}
		
	}


	
}

//método público que cierra el candado
public boolean cerrar(){
	//si el candado esta cerrado devuelve false
	if(!abierto){
		return false;
	}else{
		//si esta abierto lo cierra y devuelve true
		abierto=false;
		return true;
	}
}
}
