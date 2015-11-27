import java.util.Scanner;

public class EjercicioCondicionalesII {
	
	//********************* Ejercicios condicionales II *******************
	//LOS EJERCICIOS QUE USAS FECHAS NO UTILIZAR LAS CLASES ESPECIFICAS DE JAVA

	

	

	

	//getSigSeg():Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.

	//escribeTextoNum():Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 46 mostrar: cuarenta y seis.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EjercicioCondicionalesII.isIgual();
		//EjercicioCondicionalesII.getMayor();
		//EjercicioCondicionalesII.ordenaNum();
		//EjercicioCondicionalesII.getNumCifras();
		//EjercicioCondicionalesII.escribeReves();
		//EjercicioCondicionalesII.isCapicua();
		//EjercicioCondicionalesII.isFechaOK();
		//EjercicioCondicionalesII.getSigDiaSimple();
		//EjercicioCondicionalesII.getSigDia();
		EjercicioCondicionalesII.getDiasEntreFechas();
	}
	
	public static void isIgual(){
		
		//isIgual():Pedir dos números y decir si son iguales o no.
		
		double numero1;
		double numero2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		numero1=sc.nextDouble();
		System.out.println("Introduce el segundo numero");
		numero2=sc.nextDouble();
		if (numero1==numero2){
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("Los numeros son diferentes");
		}
		sc.close();
	}
	
	public static void getMayor(){
		
		//getMayor():Pedir dos números y decir cual es el mayor.
		
		double numero1;
		double numero2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		numero1=sc.nextDouble();
		System.out.println("Introduce el segundo numero");
		numero2=sc.nextDouble();
		if (numero1>numero2){
			System.out.println(numero1+" es mayor que "+numero2);
		}
		else{
			System.out.println(numero2+" es mayor que "+numero1);	
		}
		sc.close();
	}
	
	public static void ordenaNum(){
		
		//ordenaNum():Pedir tres números y mostrarlos ordenados de mayor a menor.
		
		double numero1;
		double numero2;
		double numero3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		numero1=sc.nextDouble();
		System.out.println("Introduce el segundo numero");
		numero2=sc.nextDouble();
		System.out.println("Introduce el tercer numero");
		numero3=sc.nextDouble();
		if (numero1>numero2){
			if(numero1>numero3){
				if(numero2>numero3){
					System.out.println(numero1+" > "+numero2+" > "+numero3);
				}
				else {
					System.out.println(numero1+" > "+numero3+" > "+numero2);
				}
			}
			else{
				System.out.println(numero3+" > "+numero1+" > "+numero2);
			}	
		}
		else{
			if(numero2>numero3){
				if(numero1>numero3){
					System.out.println(numero2+" > "+numero1+" > "+numero3);
				}
				else {
					System.out.println(numero2+" > "+numero3+" > "+numero1);
				}
			}
			else{
				System.out.println(numero3+" > "+numero2+" > "+numero1);
			}	
		}
		sc.close();
	}
	
	public static void getNumCifras(){
		
		//getNumCifras():Pedir un número entero con un máximo de 4 cifras y devuelve el número de cifras que tiene.
		
		int numero1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero1=sc.nextInt();
		if (numero1<=9999 && numero1>999){
			System.out.println("el numero tiene 4 cifras");
		}
			else if(numero1<=999 && numero1>99){
				System.out.println("el numero tiene 3 cifras");
			}
				else if(numero1<=99 && numero1>9){
					System.out.println("el numero tiene 2 cifras");
				}
					else if(numero1<=9 && numero1>=0){
						System.out.println("el numero tiene 1 cifra");
					}
		else{
			System.out.println("Introduce un numero con un maximo de 4 cifras");
		}
		sc.close();
	}
	
	public static void escribeReves(){
		
		//escribeReves():Pedir un número entero con una máximo de 4 cifras y escríbelo al revés.
		
		int numero1;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero1=sc.nextInt();
		if (numero1<=9999 && numero1>999){
			cifra4=numero1%10;
			cifra3=(numero1/10)%10;
			cifra2=(numero1/100)%10;
			cifra1=numero1/1000;
			System.out.println(cifra4+""+cifra3+""+cifra2+""+cifra1);
		}
			else if(numero1<=999 && numero1>99){
				cifra3=numero1%10;
				cifra2=(numero1/10)%10;
				cifra1=numero1/100;
				System.out.println(cifra3+""+cifra2+""+cifra1);
			}
				else if(numero1<=99 && numero1>9){
					cifra2=numero1%10;
					cifra1=numero1/10;
					System.out.println(cifra2+""+cifra1);
				}
					else if(numero1<=9 && numero1>=0){
						System.out.println(numero1);
					}
		else{
			System.out.println("Introduce un numero con un maximo de 4 cifras");
		}
		sc.close();
	}
	
	public static void isCapicua(){
		
		//isCapicua()Pedir un número entero con una máximo de 4 cifras y devuelve si es capicúa o no.
		
		int numero1;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero1=sc.nextInt();
		if (numero1<=9999 && numero1>999){
			cifra4=numero1%10;
			cifra3=(numero1/10)%10;
			cifra2=(numero1/100)%10;
			cifra1=numero1/1000;
			if(cifra4==cifra1 && cifra3==cifra2){
				System.out.println("El numero es capicua");
			}
			else{
				System.out.println("El numero no es capicua");	
			}
		}
			else if(numero1<=999 && numero1>99){
				cifra3=numero1%10;
				cifra2=(numero1/10)%10;
				cifra1=numero1/100;
				if(cifra3==cifra1){
					System.out.println("El numero es capicua");
				}
				else{
					System.out.println("El numero no es capicua");	
				}
			}
				else if(numero1<=99 && numero1>9){
					cifra2=numero1%10;
					cifra1=numero1/10;
					if(cifra2==cifra1){
						System.out.println("El numero es capicua");
					}
					else{
						System.out.println("El numero no es capicua");	
					}
				}
					else if(numero1<=9 && numero1>=0){
						System.out.println("el numero es capicua");
					}
		else{
			System.out.println("Introduce un numero con un maximo de 4 cifras");
		}
		sc.close();
	}
	
	public static void isFechaOK(){
	//isFechaOK():Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
	//dias:1..28, 30 y 31 días;meses:1..12;Sin años bisiestos.
	int dia;
	int mes;
	int anno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el dia");
	dia=sc.nextInt();
	System.out.println("Introduce el mes");
	mes=sc.nextInt();
	System.out.println("Introduce el anno");
	anno=sc.nextInt();
	if(anno>1900 && anno<2100){ //un espacio de lo años mas actuales
		if (mes>0 && mes<13){
			switch(mes){
				case(1):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(2):
					if (dia>0 && dia<29){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(3):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(4):
					if (dia>0 && dia<31){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(5):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(6):
					if (dia>0 && dia<31){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(7):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(8):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(9):
					if (dia>0 && dia<31){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(10):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(11):
					if (dia>0 && dia<31){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(12):
					if (dia>0 && dia<32){
						System.out.println("La fecha es correcta");
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
			}//switch(mes)
		}//mes>0 && mes<13
		else{
			System.out.println("El mes no es correcto");
		}
	}//anno>1900 && anno<2100
	else{
		System.out.println("El anno no es correcto");
	}
	sc.close();
	}
	
	public static void getSigDiaSimple(){
	//getSigDiaSimple():Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
	//los meses tienen 30 días.
	int dia;
	int mes;
	int anno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el dia");
	dia=sc.nextInt();
	System.out.println("Introduce el mes");
	mes=sc.nextInt();
	System.out.println("Introduce el anno");
	anno=sc.nextInt();
	if(anno>1900 && anno<2100){ //un espacio de lo años mas actuales
		if (mes>0 && mes<13){
			switch(mes){
				case(1):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(2):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(3):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(4):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(5):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(6):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(7):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(8):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(9):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(10):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(11):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(12):
					if (dia>0 && dia<31){
						if (dia==30){
							anno=anno+1;
							System.out.println("Mañana sera el 1 del mes 1 del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
			}//switch(mes)
		}//mes>0 && mes<13
		else{
			System.out.println("El mes no es correcto");
		}
	}//anno>1900 && anno<2100
	else{
		System.out.println("El anno no es correcto");
	}
	sc.close();
	}
	
	public static void getSigDia(){
	//getSigDia():Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
	//teniendo en cuenta que los meses tienen:28,30,31 días. No tener en cuenta los bisiestos.
	int dia;
	int mes;
	int anno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el dia");
	dia=sc.nextInt();
	System.out.println("Introduce el mes");
	mes=sc.nextInt();
	System.out.println("Introduce el anno");
	anno=sc.nextInt();
	if(anno>1900 && anno<2100){ //un espacio de lo años mas actuales
		if (mes>0 && mes<13){
			switch(mes){
				case(1):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(2):
					if (dia>0 && dia<29){
						if (dia==28){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(3):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(4):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(5):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(6):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(7):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(8):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(9):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(10):
					if (dia>0 && dia<32){
						if (dia==31){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(11):
					if (dia>0 && dia<31){
						if (dia==30){
							mes=mes+1;
							System.out.println("Mañana sera el 1 del mes "+mes+" del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
				case(12):
					if (dia>0 && dia<32){
						if (dia==31){
							anno=anno+1;
							System.out.println("Mañana sera el 1 del mes 1 del anno "+anno);
						}
						else{
							dia=dia+1;
							System.out.println("Mañana sera el "+dia+" del mes "+mes+"del anno "+anno);
						}
					}
					else{
						System.out.println("La fecha no es correcta");
					}
				break;
			}//switch(mes)
		}//mes>0 && mes<13
		else{
			System.out.println("El mes no es correcto");
		}
	}//anno>1900 && anno<2100
	else{
		System.out.println("El anno no es correcto");
	}
	sc.close();
	}
	
	public static void getDiasEntreFechas(){
	//getDiasEntreFechas()Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
	//días.
	int dia;
	int mes;
	int anno;
	int dia2;
	int mes2;
	int anno2;
	int totalDias;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce el dia");
	dia=sc.nextInt();
	System.out.println("Introduce el mes");
	mes=sc.nextInt();
	System.out.println("Introduce el anno");
	anno=sc.nextInt();	
	System.out.println("Introduce el segundo dia");
	dia2=sc.nextInt();
	System.out.println("Introduce el segundo mes");
	mes2=sc.nextInt();
	System.out.println("Introduce el segundo anno");
	anno2=sc.nextInt();	
	totalDias = dia2-dia + 30*(mes2-mes)+365*(anno2-anno);
	System.out.println("La diferencia de dias es de: "+totalDias);	
	}
	
	
}
