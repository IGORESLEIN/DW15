import java.util.Scanner;

public class EjercicioCondicionales {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioCondicionales.diaSemana();
		//EjercicioCondicionales.meses();
		//EjercicioCondicionales.usuarioPasswd();
		//EjercicioCondicionales.usuarioPasswd2();
	}
	public static void diaSemana(){
		
		//dado el día numérico devuelva el dia literal de la semana
		
		//definir vars
		int numeroSemana;
		//objeto Scanner
		Scanner sc=new Scanner(System.in);
		//pide y lee el numero
		System.out.println("Indica el numero del dia de la semana");
		numeroSemana=sc.nextInt();
		//Cambia el nuemero por el dia
		switch (numeroSemana){
			case (1) :
			System.out.println("Hoy es lunes");
			break;
			case (2) :
			System.out.println("Hoy es martes");
			break;		
			case (3) :
			System.out.println("Hoy es miercoles");
			break;		
			case (4) :
			System.out.println("Hoy es jueves");
			break;		
			case (5) :
			System.out.println("Hoy es viernes");
			break;		
			case (6) :
			System.out.println("Hoy es sabado");
			break;		
			case (7) :
			System.out.println("Hoy es domingo");
			break;
			
		}
	}
		
	public static void meses(){
	//dado el mes del año devuelva el número de días q tiene
		//definir vars
		String mes;
		//objeto Scanner
		Scanner sc=new Scanner(System.in);
		//pide y lee el numero
		System.out.println("Indica el mes");
		mes=sc.next();
		//cambia el mes por los dias que tiene
		if (mes.equals("enero")){
			System.out.println("Enero tiene 31 dias");
		}
		else if (mes.equals("febrero")){
			System.out.println("Febrero tiene 28 dias y 29 en los años bisiestos");
		}
		else if (mes.equals("marzo")){
			System.out.println("Marzo tiene 31 dias");
		}
		else if (mes.equals("abril")){
			System.out.println("Abril tiene 30 dias");
		}
		else if (mes.equals("mayo")){
			System.out.println("Mayo tiene 31 dias");
		}
		else if (mes.equals("junio")){
			System.out.println("Junio tiene 30 dias");
		}
		else if (mes.equals("julio")){
			System.out.println("Julio tiene 31 dias");
		}
		else if (mes.equals("agosto")){
			System.out.println("Agosto tiene 31 dias");
		}
		else if (mes.equals("septiembre")){
			System.out.println("Septiembre tiene 30 dias");
		}
		else if (mes.equals("octubre")){
			System.out.println("Octubre tiene 31 dias");
		}
		else if (mes.equals("noviembre")){
			System.out.println("Noviembre tiene 30 dias");
		}
		else if (mes.equals("diciembre")){
			System.out.println("Diciembre tiene 31 dias");
		}
		else {
			System.out.println("Introduce el mes en minusculas y/o correctamente");
		}
		
	}
	public static void usuarioPasswd(){
	//Solicita al usuario un password, si no es '1234' escribe 'passwd incorrecto' si no 'Bienvenido'
		final String PASSWD="1234";
		String passwdEscrita;
		//objeto Scanner
		Scanner sc=new Scanner(System.in);
		//pide y lee la passwd
		System.out.println("Escribe tu password");
		passwdEscrita=sc.nextLine();
		//comprueba si esta bn
		if (PASSWD.equals(passwdEscrita)){
			System.out.println("BIENVENIDO");
		}
		else {
			System.out.println("Password incorrecto");
		}

	
	}
	
		public static void usuarioPasswd2(){
		//Soliciata al usuario un usuario y passwd, si es 'admin' y '1234' mostrar 'Bienvenido', sino 'usuario o passwd incorrecto'
		final String USUARIO="admin";
		final String PASSWD="1234";
		String usuarioEscrito;
		String passwdEscrita;
		//objeto Scanner
		Scanner sc=new Scanner(System.in);
		//pide y lee la passwd y el usuario
		System.out.println("Escribe tu usuario");
		usuarioEscrito=sc.nextLine();
		System.out.println("Escribe tu password");
		passwdEscrita=sc.nextLine();
		//comprueba si esta bn
		if (USUARIO.equals(usuarioEscrito) && PASSWD.equals(passwdEscrita)){
			System.out.println("BIENVENIDO");
		}
		else {
			System.out.println("Usuario o password incorrecto");
		}

		
	}
}
