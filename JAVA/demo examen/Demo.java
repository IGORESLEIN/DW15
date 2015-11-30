import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Edad();		
		//-(1 punto)Pide al usuario su edad(22) y su nombre(juan) y muestra como resultado "juan en el 2017 tendras 24 años".
//Random();
		//-(1 puntos)Genera un número aleatorio entre el 1 y el 10. Pide un numéro al usuario y muestra si es menor, mayor o ha
		//acertado.
//RandomMejor();
		//-(2 punto)Modifica el ejercicio anterior para que pida números al usuario hasta que acierte el número mostrándole si
		//es menor o mayor cada vez que introduzca un número sin acertar.
Numeros();
		//-(2 puntos)Crea un programa que solicite 10 números por consola, los imprima todos y muestre el valor y la posición del menor y del
		//mayor:
		//[4,2,5,1,7,9,3,0,2,10]
		//el menor es 0 en la posición 8
		//el mayor es 10 en la posición 10
		//*/

	}
	public static void Edad(){
		Scanner sc=new Scanner(System.in);
		String nombre;
		int edad;
		System.out.println("Introduce tu nombre");
		nombre=sc.nextLine();
		System.out.println("Introduce tu edad");
		edad=sc.nextInt();
		System.out.println(nombre+" tendra "+(edad+2)+" en el 2017");
		sc.close();
	}
	public static void Random(){
		Scanner sc=new Scanner(System.in);
		int num;
		int numRandom = (int)(Math.random()*10+1);
		System.out.println("Adivina el numero");
		num=sc.nextInt();
		if(num!=numRandom){
			if(num<numRandom){
				System.out.println("El numero es mayor");
			}//if
			else{
				System.out.println("El numero es menor");
			}//else
		}//if
		else{
			System.out.println("Enhorabuena lo has adivinado");
		}//else
		sc.close();
	}//random
	public static void RandomMejor(){
		Scanner sc=new Scanner(System.in);
		int num;
		int numRandom = (int)(Math.random()*10+1);
		do{
		System.out.println("Adivina el numero");
		num=sc.nextInt();
		if(num<numRandom){
			System.out.println("El numero es mayor");
		}//if
		else if(num>numRandom){
			System.out.println("El numero es menor");
		}//else
		}while(num!=numRandom);
		System.out.println("Enhorabuena lo has adivinado");
		sc.close();
	}//random
	public static void Numeros(){
		Scanner sc=new Scanner(System.in);
		int num;
		int posMenor=0;
		int posMayor=0;
		int menor = 99999;
		int mayor = 0;
		int[] lstNumeros=new int[10];
		for(int i=0;i<lstNumeros.length;i++){
			System.out.println("Introduce el "+(i+1)+". numero");
			num=sc.nextInt();
			lstNumeros[i]=num;
			if (num<menor) { 
				menor=num;
				posMenor=i+1;
			}
			else if (num>mayor) {
				mayor=num;
				posMayor=i+1;
			}
		}
		for(int i=0;i<lstNumeros.length;i++){
		System.out.print(" "+lstNumeros[i]);
		}
		System.out.println("");
		System.out.println(menor+" esta en la posicion "+posMenor);
		System.out.println(mayor+" esta en la posicion "+posMayor);
		sc.close();
	}
}
