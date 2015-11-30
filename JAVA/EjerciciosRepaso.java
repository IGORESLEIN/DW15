package ejercicio1;

import java.util.Scanner;

public class EjerciciosRepaso {
	
//escribe tu nombre en una linea de comentario
	
//escribe como comentario de varias lineas un texto
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*******************************************
		 * DEFINE LAS SIGUIENTES VARIABLES O CONSTANTES
		 ********************************************/
		//cantidad de alumnos en el aula
		int cantAlumnos;
		//cantidad maxima de alumnos teniendo un valor de 24
		final int MAXCANTALUMNOS=24;
		//una var. que me diga si  el aula esta completa o no
		boolean aulaCompleta;
		//nota mas alta del aula
		double notaMax;
		//el DNI del alumno
		String DNI;
		//tlfno del alumno
		int tlfno;
		/*******************************************
		 * ASIGNA LOS SIGUIENTES VALORES A LAS VARS 
		 * DEFINIDAS ANTERIORMENTE
		 ********************************************/
		//cant de alumn aula inicializa a 10
		cantAlumnos=10;
		//el aula esta llena
		aulaCompleta=true;
		//guarda en DNI tu dni
		DNI="72585875Z";
		//incrementa en 1 la cantidad de alumnos en aula
		cantAlumnos++; //cantAlumnos=cantAlumnos+1;
		//guarda en tel alumno un número de tlfno
		tlfno=943734394;
		//ahora hay sitio en el aula
		aulaCompleta=false;
		//decrementa en 1 la cantidad de alumnos en aula
		cantAlumnos--; //cantAlumnos=cantAlumnos-1;
		
		/*******************************************
		 * MUESTRA POR PANTALLA LOS SIGUIENTES MENSAJES
		 ********************************************/
		//muestra la cant de alum en aula
		System.out.println("la cantidad de alumnos en el aula es:"+cantAlumnos);
		//muestra el mensaje "en el aula hay xx alumnos"
		System.out.println("en el aula hay "+cantAlumnos+" alumnos");
		//muestra el mensaje "La cantidad máxima de alumnos es: xxx"
		System.out.println("la cantidad maxima de alumnos en el aula es:"+MAXCANTALUMNOS);
		
		//---------------------------------------------------------------------
		System.out.println("--------------------------------------------------");
		//---------------------------------------------------------------------
		
		/*******************************************
		 * DEFINE UN OBJETO SCANNER PARA LEER POR CONSOLA
		 ********************************************/
		
		Scanner sc=new Scanner(System.in); //importar el java util (import java.util.Scanner;)
		
		/*******************************************
		 * LEE LAS SIGUIENTES VARIABLES POR CONSOLA
		 ********************************************/
		//Pide la cantidad de alumnos por consola
		System.out.println("Cual es la cantidad de alumnos en el aula?");
		//guarda en la var. correspondiente el valor introducido
		cantAlumnos=sc.nextInt();
		//mostrar el resultado
		System.out.println("La cantidad de alumnos es:"+cantAlumnos);
		
		//---------------------------------------------------------------------
		System.out.println("--------------------------------------------------");
		//---------------------------------------------------------------------
		
		//Pide la nota más alta por consola
		System.out.println("Cual es la nota mas alta en el aula?");
		//guarda en la var. correspondiente el valor introducido
		notaMax=sc.nextDouble();
		//mostrar el resultado
		System.out.println("La nota mas alta es:"+notaMax);
		
		//---------------------------------------------------------------------
		System.out.println("--------------------------------------------------");
		//---------------------------------------------------------------------
		
		//Pide el dni del alumno por consola
		System.out.println("Cual es tu DNI?");
		//guarda en la var. correspondiente el valor introducido
		DNI=sc.next();
		//mostrar el resultado
		System.out.println("Tu DNI es:"+DNI);
		
		//---------------------------------------------------------------------
		System.out.println("--------------------------------------------------");
		//---------------------------------------------------------------------
		
		
		/*******************************************
		 * DESARROLLA LOS SIGUIENTES PROGRAMAS
		 ********************************************/
		
		//EjRep1: Muestra por consola el area de un circulo de radio 2
		
			//define variables y constantes
			final double PI=Math.PI;
			double radio;
			double area;
			//inicializar variables
			radio=2;
			//ejecutar calculos
			area=PI*(radio*radio);
			//mostrar resultado
			System.out.println("El area del circulo es:"+area);
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		//EjRep2:Muestra por consola el sueldo bruto mensual si al año cobro 24.000€
			
			//definir variables y constantes
			final int MESES=12;
			int sueldo;
			int sueldoMensual;
			//inicializar variables
			sueldo=24000;
			//calcular
			sueldoMensual=sueldo/MESES;
			//mostrar resultado
			System.out.println("el sueldo mensual es:"+sueldoMensual);
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		//EjRep3:Muestra los beneficios teniendo en cuenta: gastos=128.000,ingresos=350.000
		//beneficio=ingresos-gastos
			
			//definir variables y constantes
			int gastos;
			int ingresos;
			int beneficio;
			//inicializar variables
			gastos=128000;
			ingresos=350000;
			//calcular
			beneficio=ingresos-gastos;
			//mostrar resultado
			System.out.println("el beneficio es de:"+beneficio+"€");
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		//EjRep4:Pide al usuario su nombre y muestra "Hola XXX"
			
			//definir variables y constantes
			String nombre;
			//crear objeto Scanner en nuestro caso esta creado al principio, por lo tanto
			//no hay que hacerlo de nuevo
			//preguntar el nombre
			System.out.println("Como te llamas?");
			//leer el nombre por consola
			nombre=sc.next();
			//mostrar resultado
			System.out.println("Hola "+nombre);
			
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		//EjRep5:Pide al usuario su edad y muestra "El próximo año tendrás xxx años"
		
			//definir variables y constantes
			int edad;
			//crear objeto Scanner en nuestro caso esta creado al principio, por lo tanto
			//no hay que hacerlo de nuevo
			//preguntar el nombre
			System.out.println("Cuantos anos tienes?");
			//leer el nombre por consola
			edad=sc.nextInt();
			//mostrar resultado
			edad++;
			System.out.println("El proximo año tendras "+edad+" anos");
			
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
			
		//EjRep6:Pide al usuario su altura y muestra su peso ideal.
		//peso ideal=0,75 (altura en cm – 150) + 50
			
			//definir variables y constantes
			int altura;
			double pesoIdeal;
			//preguntar altura
			System.out.println("Cuanto mides?");
			//leer la altura
			altura=sc.nextInt();
			//calcular
			pesoIdeal=0.75*(altura-150)+50;
			//mostrar resultado
			System.out.println("Tu peso ideal es de:"+pesoIdeal);
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		//EjRep7:Pide al usuario su nombre, primer apellido y segundo apellido
		//muestra "Perez Lopez, Juan"
			
			//definir variables y constantes
			String nombreAp;
			String primerAp;
			String segundoAp;
			//preguntar 
			System.out.println("Como te llamas?");
			//leer
			nombreAp=sc.next();
			//preguntar 
			System.out.println("Cual es tu primer apellido?");
			//leer
			primerAp=sc.next();
			//preguntar 
			System.out.println("Como es tu segundo apellido?");
			//leer
			segundoAp=sc.next();
			//mostrar resultado
			System.out.println(primerAp+" "+segundoAp+", "+nombreAp);
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
			
	
		//EjRep8: Pide al usuario una cantidad de dinero y un número de personas
		//muestra "Cada persona debe pagar xxx€ y xxx céntimos"
		
			//definir variables y constantes
			double cantDinero;
			int euros;
			double centimos;
			int cantPersonas;
			double cantPorPersona;
			//preguntar 
			System.out.println("Cuanto dinero hay que pagar?");
			//leer
			cantDinero=sc.nextDouble();
			//preguntar 
			System.out.println("Cuantas personas tienen que pagar?");
			//leer
			cantPersonas=sc.nextInt();
			//calcular
			cantPorPersona=cantDinero/cantPersonas;
			euros=(int)cantPorPersona;
			centimos=(cantPorPersona-euros)*100;
			//mostrar resultado
			System.out.println("Cada persona debe pagar "+euros+"€ y "+(int)centimos+" centimos");
			
			//---------------------------------------------------------------------
			System.out.println("--------------------------------------------------");
			//---------------------------------------------------------------------
		
		
		
		
	}

}
