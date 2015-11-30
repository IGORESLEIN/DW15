package control;

import java.util.Scanner;

public class controlIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//suma();
		//tabla();
		password();
	}
	
	public static void suma(){
	//pide un número al usuario y calcula las suma de los numeros enteros hasta el introducido:1+2+3+4+num
	int num;
	int suma=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un numero");
	num=sc.nextInt();
		for (int i=0;i<=num;i++){
			suma=suma+i;
		}
	System.out.println("La suma de los numeros hasta el "+num+" es "+suma);
	sc.close();
	}
	
	public static void tabla(){
	//pide un número al usuario y muestra su tabla de multiplicar
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un numero");
	num=sc.nextInt();
		for (int i=0;i<=10;i++){
			System.out.println(num+"x"+i+"="+num*i);
		}
	sc.close(); 
	}
	
	public static void password(){
	//pide al usuario un password hasta que lo introduzca correctamente. El password sera "admin".
	final String PASSWORD="igor";
	String passEscrita;
	do{
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce la contraseña");
	passEscrita=sc.nextLine();
	}while(!PASSWORD.equals(passEscrita));
	System.out.println("BIENVENIDO");
	}
}
