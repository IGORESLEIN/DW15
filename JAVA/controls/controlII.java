package control;

import java.util.Scanner;

public class controlII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//edadCristo();
		//nota();
		letra();
		}
	public static void edadCristo(){
		//realiza un programa que solicite un número si el numero es 33, muestra 'tienes la edad de cristo', si es menor 'eres menor que cristo' y si es mayor  'eres más viejo que cristo'.
		int edad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		edad=sc.nextInt();
		if (edad==33){
			System.out.println("Tienes la edad de cristo");
		}
			else if(edad<33){
				System.out.println("Eres mas joven que crito");
			}
			else{
				System.out.println("Eres mas viejo que crito");
			}
		sc.close();
	}
	
	public static void nota(){
	//realiza un programa que solicite una nota, que no tiene decimales, y muestra INSUFICENTE(0-4), SUFICIENTE(5), BIEN(6), NOTABLE(7,8),SOBRESALIENTE(9,10), ERROR en caso contrario. Para este ejercicio hay que utilizar la estructura switch
	int nota;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce tu nota");
	nota=sc.nextInt();
	switch(nota){
		case (1):
			System.out.println("INSUFICIENTE");
		break;
		case (2):
			System.out.println("INSUFICIENTE");
		break;
		case (3):
			System.out.println("INSUFICIENTE");
		break;
		case (4):
			System.out.println("INSUFICIENTE");
		break;
		case (5):
			System.out.println("SUFICIENTE");
		break;
		case (6):
			System.out.println("BIEN");
		break;
		case (7):
			System.out.println("NOTABLE");
		break;
		case (8):
			System.out.println("NOTABLE");
		break;
		case (9):
			System.out.println("SOBRESALIENTE");
		break;
		case (10):
			System.out.println("SOBRESALIENTE");
		break;
		default:
			System.out.println("Introduce una nota valida");
		break;
		}
	sc.close();
	}
	
	public static void letra(){
	//realiza un programa que solicite al usuario una letra y le diga si es vocal o consonante
	char letra;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce una letra");
	letra=sc.next().charAt(0);
	switch(letra){
	case('a'):
		System.out.println("Es una vocal");
	break;
	case('e'):
		System.out.println("Es una vocal");
	break;
	case('i'):
		System.out.println("Es una vocal");
	break;
	case('o'):
		System.out.println("Es una vocal");
	break;
	case('u'):
		System.out.println("Es una vocal");
	break;
	default:
		System.out.println("Es una consonante");
	break;
	}
	sc.close();
	}
}
