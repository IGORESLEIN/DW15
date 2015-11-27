import java.util.Scanner;

public class EjercicioLista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notaMedia();
		//enteros();
		//random();
		//randomMejor();
		//nombres();
	}
	public static void notaMedia(){
	//Crear un array que solicite 3 notas, las almacene en un array y muestre la nota media 
		int[] lstNotas=new int[3];
		int suma=0;
		int notaMedia=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("Nota:");
			lstNotas[i]=sc.nextInt();
			suma=suma+lstNotas[i];
		}
		notaMedia=suma/lstNotas.length;
		System.out.println("La nota media es: "+notaMedia);
	}
	public static void enteros(){
		
		int [] lstnum=new int [10];
		int num;
		int menor = 99999;
		int mayor = 0;
		int suma= 0;
		Scanner sc=new Scanner(System.in);
		//pedir numeros
		System.out.println("Introduce 10 numeros enteros: ");
		for (int i=0;i<lstnum.length;i++) {
			System.out.println("Introduce un entero: ");
			num=sc.nextInt();
			lstnum[i]=num;
				if (num<menor) { menor=num;}
				else if (num>mayor) {mayor=num;}
		}
		
		suma=(lstnum[0]+lstnum[1]+lstnum[2]+lstnum[3]+lstnum[4]+lstnum[5]+lstnum[6]+lstnum[7]+lstnum[8]+lstnum[9]);
		System.out.println("El numero mayor es "+mayor+" ,el numero menor es "+menor+" y la suma de los numeros es "+suma);
	}
	public static void random(){
		
		int [] lstrandom=new int [10];
		int random= 0;
		
		for (int i=0;i<lstrandom.length;i++) {
			
		random=(int) (Math.random()*6+1);
		lstrandom[i]=random;
		}
		
		for (int j=0;j<lstrandom.length;j++){
			System.out.println(lstrandom[j]);
		}
	
	}
	public static void randomMejor(){
		
		int [] lstrandom=new int [10];
		int random= 0;
		int num;
		int posicion;
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<lstrandom.length;i++) {
			
		random=(int) (Math.random()*6+1);
		lstrandom[i]=random;
		System.out.println("Introduce un numero para dar con el aleatorio: ");
		num=sc.nextInt();
		posicion=i+1;
			if (random==num) {
				System.out.println("Has dado con el numero correcto! Esta en la posicion "+posicion);
			}
			else {
				System.out.println("Numero desconocido.");
			}
		}
	}
	public static void nombres(){
		String [] lstNombres=new String [8];
		String nombre;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce 8 nombres para escribirlos del ultimo al primero: ");
		for (int i=0;i<lstNombres.length;i++) {
			System.out.println("Introduce un nombre: ");
			nombre=sc.next();
			lstNombres[i]=nombre;
		}
		for (int j=lstNombres.length-1;j>=0;j--) {
			System.out.println(lstNombres[j]);
		}
	}
	

}


