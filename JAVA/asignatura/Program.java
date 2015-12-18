
public class Program {
	
	public static void main(String[] args){
	
		//personas();
		ordenadores();
	
	}
	
	public static void personas(){
		
		Persona[] lstPersonal=new Persona[10];	
		
		
		Profesor p1=new Profesor("juan");
		p1.setDni("12121212b");
		p1.setTitulo("señor lizenziao");
		
		lstPersonal[0]=p1;
		
		Persona p2=new Persona("juan");
		p2.setDni("12121212b");
		//p2.setTitulo("señor lizenziao");
		
		lstPersonal[1]=p2;
		
		Persona p3=new Profesor("juan");
		p3.setDni("12121212b");
		((Profesor) p3).setTitulo("señor lizenziao");
		
		lstPersonal[2]=p3;
		
	}
	public static void ordenadores(){
		//crear ordenador
		Ordenador o1=new Ordenador("prueba1");
		o1.setCpu("i7");
		o1.setHd("2t");
		o1.setRam(8);
		//crear ordenador
		Ordenador o2=new Ordenador("prueba2");
		o2.setCpu("i5");
		o2.setHd("1t");
		o2.setRam(4);
		//crear ordenador
		Ordenador o3=new Ordenador("prueba3");
		o3.setCpu("atom");
		o3.setHd("1t");
		o3.setRam(2);
		//crear un aula
		AulaInfor a1=new AulaInfor(5);
		//añadir ordenadores al aula
		a1.addOrden(o1);
		a1.addOrden(o2);
		a1.addOrden(o3);
		a1.delOrden("prueba2");
		a1.modOrden("prueba3", o1);
		//imprimir los ordenadores
		a1.escribeOrden();
		
		
	}
}
