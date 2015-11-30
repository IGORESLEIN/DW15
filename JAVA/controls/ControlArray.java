package control;

import java.util.Scanner;

public class ControlArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array con 10 números generados aleatoriamente entre el 1 y 100
		//solicita al usuario números hasta que acierte uno de los números del array y muestra su posición.
		random();
	}
	public static void random(){
		Scanner sc=new Scanner(System.in);
		int num;
		int[] lstNum=new int[10];
		for (int i=0;i<lstNum.length;i++){
			lstNum[i]=(int)(Math.random()*100+1);
		}
		do{
			System.out.println("Introduce un numero del 1-100 (introduce 0 para apagar):");
			num=sc.nextInt();
			for (int j=0;j<lstNum.length;j++){
				if (num==lstNum[j]){
				System.out.println("Has acertado el numero en la posicion "+j);
				}
			}			
		}while(num!=0);
		System.out.println("Bye!!");
	}

}
