package control;

import java.util.Scanner;

public class controlIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palabras();
		//suma();
		//factorial();
		numeros();
	}
	
	public static void palabras(){
		//pide palabras al usuario hasta que escriba "bye" y muestre la cantidad de palabras introducidas.
		final String PALABRAFINAL="bye";
		String palabra;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Introduce una palabra");
			palabra=sc.nextLine();
			contador++;
		}while(!palabra.equals(PALABRAFINAL));
		System.out.println("Has introducido "+contador+" palabras");
		sc.close(); 
	}
	
	public static void suma(){
		//pide un número al usuario y escribe la suma=1+2+3+4+num
		int num;
		int suma=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		num=sc.nextInt();
		for(int i=1;i<num;i++){
			suma=suma+i;
			System.out.print(i+"+");
		}
		suma=suma+num;
		System.out.print(num+"="+suma);
		sc.close();
	}
	
	public static void factorial(){
		//realiza un programa que muestre el factorial de los diez primeros números: 1!=1 2!=2 3!=6....
		for(int j=1;j<=10;j++){
			int factorial=1;
			for (int i=1;i<=j;i++){
				factorial=factorial*i;
			}//forI
			System.out.println(j+"="+factorial);
		}//forJ
	}
	
	public static void numeros(){
	//realiza un programa que solicite números hasta introducir 0 y muestre la cantidad de pares e impares y el total de números introducidos
	int num;
	int contador=0;
	int par=0;
	int impar=0;
	Scanner sc=new Scanner(System.in);
	do{
	System.out.println("Introduce un numero");
	num=sc.nextInt();
	contador++;
		if(num%2==0){
			par++;
		}//if
		else{
			impar++;
		}//else
	}while(num!=0);
	System.out.println("el numero de numeros introducidos es "+contador);
	System.out.println("de los cuales pares "+par);
	System.out.println("de los cuales impares "+impar);
	}

}
