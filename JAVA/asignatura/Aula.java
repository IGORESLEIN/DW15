
public class Aula {
	
	private String[] listado;
	private int numAula;
	public Aula( int numAlum){
		listado = new String[numAlum];
		for ( int i = 0; i < listado.length; i++){
			
			listado[i] = "";
		}
	}
	public void addAlumno(String alumno) {
		int i=0;
		while((!listado[i].equals("")) && (i < listado.length)){
			i++;
		}
		if ( i < listado.length){
			listado[i] = alumno;
		}
	}
	
	public void delAlumno(String alumno) {
		
	}
	
	public String[] getAlumnos() {
		return listado;
	}
	
	
	
	public String toString(){
		String texto ="aula "+ numAula +": "; 
		for (int i=0; i < listado.length; i++){
			if (listado[i].equals("")){
				break;
				
			}
			else{
			texto = texto + listado[i]+" ";
			}
		}
		return texto;
	}
	
}
