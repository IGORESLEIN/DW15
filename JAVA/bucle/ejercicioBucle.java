package ejerciciosBucle;

import java.util.Scanner;

public class ejercicioBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asteriscos();
		//solicAsteris();
		//numAsc();
		//numAscCompr();
		//numAscMejor();
		//listaNum();
		//cuadrado();
		//cuadradoMejor();
		//numCero();
		numCeroSuma();
		//piramide();
	}

	public static void asteriscos(){
		//dibujar 10 asteriscos
		for(int i=0;i<10;i++){
			System.out.println("*");
		}
	}

	public static void solicAsteris(){
		//pide un número y dibuje esa cantidad de asteriscos
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuantas veces quieres repetir el *?");
		num=sc.nextInt();
		for(int i=0;i<num;i++){
			System.out.println("*");
		}
		sc.close();
	}
	
	public static void numAsc(){
		//pide un número y escribe ascendentemente los enteros entre el 0 y dicho número
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		num=sc.nextInt();
		for(int i=0;i<num;i++){
			System.out.print(i);
		}
		sc.close();
	}
	
	public static void numAscCompr(){
		//mejora el ejercicio anterior comprobando que el número introducido no sea negativo
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		num=sc.nextInt();
		if (num>0){
			for(int i=0;i<num;i++){
				System.out.print(i);
			}
		}
		else {
			System.out.println("Introduce un numero positivo");
		}
		sc.close();
	}
	
	public static void numAscMejor(){
		//mejora el ejercicio anterior comprobando que el número introducido no sea negativo
		int num;
		Scanner sc=new Scanner(System.in);
		do{
				System.out.println("Introduce un numero entero positivo");
				num=sc.nextInt();
					for(int i=0;i<num;i++){
						System.out.print(i);
					}
				
			
		}while(num<0);
		sc.close();
	}
	
	public static void listaNum(){
	//pide al usuario dos números y muestra los la série de enteros entre el menor y el mayor.
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1=sc.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=sc.nextInt();
			if(num1<num2){
				for(int i=num1;i<=num2;i++){
					System.out.print(i+" ");
				}
			}
			else{
				for(int i=num2;i<=num1;i++){
					System.out.print(i+" ");
				}
			}
		sc.close();
	}
	
	public static void cuadrado(){
	//solicita un número y genera un cuadrado que de lado tenga el número de asteriscos introducidos por el usuario.
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1=sc.nextInt();
		System.out.println("");
			for(int j=0;j<num1;j++){
				for(int i=0;i<num1;i++){
					System.out.print("* ");
				}
				System.out.println("");
			}
		sc.close();
	}
	
	public static void cuadradoMejor(){
	//mejora el programa anterior solicitando un número y el carácter con el que vas a dibujar el cuadrado
		int num1;
		char caracter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1=sc.nextInt();
		System.out.println("Introduce el caracter que quieras para hacer el cuadrado");
		caracter=sc.next().charAt(0);
		System.out.println("");
			for(int j=0;j<num1;j++){
				for(int i=0;i<num1;i++){
					System.out.print(caracter+" ");
				}
				System.out.println("");
			}
		sc.close();
	}
	
	public static void numCero(){
	//solicita números hasta que se introduzca un cero, muestra como resultado la cantidad de enteros introducida.
		int num1;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Introduce un numero");
			num1=sc.nextInt();
			contador++;
		}while(num1!=0);
		System.out.println("Se han introducido "+contador+" numeros");
		sc.close();
	}
	
	public static void numCeroSuma(){
	//solicita números hasta que se introduzca un cero, muestra como resultado la suma de los números introducidos.
		int num1;
		int suma=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Introduce un numero");
			num1=sc.nextInt();
			suma=suma+num1;
		}while(num1!=0);
		System.out.println("La suma de los numeros introducidos es de "+suma);
		sc.close();
	}	
	

	
}
