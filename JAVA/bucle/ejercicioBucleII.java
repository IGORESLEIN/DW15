package ejercicioBucle;

import java.util.Scanner;

public class ejercicioBucleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numeros();
		//impares();
		//factorial();
		//sueldos();
		//mayorMenorMedia();
		//tabla();
		//notas();
		//notasSuspensos();
		//tablas();
		random();
	}
	
	public static void numeros(){
		//Escribir todos los números del 100 al 0 de 7 en 7.
		for (int i=100;i>0;i=i-7){
			System.out.println(i);
		}
	}
	
	public static void impares(){
		//Muestra el producto de los 10 primeros números impares.
		int num=1;
		for (int i=0;i<10;i++){
			System.out.println(num);
			num=num+2;
		}
	}
	
	public static void factorial(){
		//Pedir un número y calcular su factorial.
		int num;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		num=sc.nextInt();
			for (int i=1;i<=num;i++){
				factorial=factorial*i;
			}
		System.out.println("El factor de "+num+" es "+factorial);
		sc.close();
	}
	
	public static void sueldos(){
	//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€
	int total=0;
	int sueldos;
	int mayor1000=0;
	Scanner sc=new Scanner(System.in);
		for (int i=1;i<=10;i++){
			System.out.println("Introduce un numero");
			sueldos=sc.nextInt();
			total=total+sueldos;
			if (sueldos>1000){
				mayor1000=mayor1000+1;
			}
		}
	System.out.println("El total de los sueldos es "+total+" y "+mayor1000+" sueldos son mayores de mil euros");
	sc.close();
	}
	
	public static void mayorMenorMedia(){
	//Pide 10 número y muestra el mayor, el menor y la media.
	final int CANTNUM=10;
	int num;
	int total=0;
	int media=0;
	int menor=99999;
	int mayor=-99999;
	Scanner sc=new Scanner(System.in);
		for (int i=1;i<=10;i++){
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			total=total+num;
			if (menor>num){
				menor=num;
			}
			if (mayor<num){
				mayor=num;
			}
		}
		media=total/CANTNUM;
	System.out.println("El mayor es "+mayor+", el menor es "+menor+" y la media es "+media);
	sc.close();
	}
	
	public static void tabla(){
	//Pide un número entre 1 y 10 y muestra su tabla de multiplicar.
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un numero");
	num=sc.nextInt();
		for (int i=0;i<=10;i++){
			System.out.println(num+"x"+i+"="+num*i);
		}
	sc.close(); 
	}
	
	public static void notas(){
	//Pide 6 notas y muestra cuantos han aprobado y cuantos han suspendido.
	final int CANTNOTAS=6;
	int notas;
	int aprobados=0;
	int suspendidos;
	Scanner sc=new Scanner(System.in);
		for (int i=1;i<=6;i++){
			System.out.println("Introduce un numero");
			notas=sc.nextInt();
	
			if (notas>=5){
				aprobados=aprobados+1;
			}
		}
	suspendidos=CANTNOTAS-aprobados;	
	System.out.println("El numero de aprovados es "+aprobados+" y suspendidos es "+suspendidos);
	sc.close();
	}
	
	public static void notasSuspensos(){
	//Pide 6 número y muestra si ha habido algún suspenso.	final int CANTNOTAS=6;
	final int CANTNOTAS=6;
	double notas;
	int aprobados=0;
	int suspendidos=0;
	Scanner sc=new Scanner(System.in);
		for (int i=1;i<=6;i++){
			System.out.println("Introduce un numero");
			notas=sc.nextDouble();
		
			if (notas<5){
				suspendidos=suspendidos+1;
			}
		}
	aprobados=CANTNOTAS-suspendidos;	
	System.out.println("El numero de aprovados es "+aprobados+" y suspendidos es "+suspendidos);
	sc.close();
	}
	
	public static void tablas(){
	//Pide un número entre 1 y 10 y muestra su tabla de multiplicar.
	int num;
	Scanner sc=new Scanner(System.in);
	for (int j=0;j<=10;j++){
		for (int i=0;i<=10;i++){
			System.out.println(j+"x"+i+"="+j*i);
		}//fori
	}//forj
	sc.close(); 
	}
	
	public static void random(){
	//Calcula un número entre el 1 y el 10 aleatoriamente, el usuario tendrá tres intentos para acertar.
	int numRandom = (int)(Math.random()*10+1);
	int num;
	Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++){
			System.out.println("Adivina el numero");
			num=sc.nextInt();
			if(num==numRandom){
				System.out.println("Enhorabuena lo has adivinado");
				break;
			}//if	
		}//for	
	}
}
