import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String nombre;
		String mayus;
		String nomMinus;
		System.out.println("Escribe tu nombre:");
		nombre=sc.next();
		nombre=nombre.trim();
		mayus=nombre.substring(0,1);
		mayus=mayus.toUpperCase();
		nomMinus=nombre.substring(1,nombre.length());
		System.out.println(mayus+nomMinus);
		
	}

}
