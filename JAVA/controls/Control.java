package control;
//Igor Uria Urrutia

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//DEFINICION DE VARIABLES
			//var para guardar el nombre de una asignatura
			String asignatura;
			//var para guardar el número de alumnos matriculados
			int alumnosMatriculados;
			//var para guardar la nota del alumno1
			double notaAlumno1;
			//var para guardar la nota del alumno2
			double notaAlumno2;
			//var para guardar la nota media obtenida por los alumnos en la asignatura
			double notaMedia;

			//INICIALIZACIÓN DE VARABLES
			//guarda en la var asignatura el texto 'programacion'
			asignatura="programacion";
			//guarda en la var num. de alum. matric. el valor 2
			alumnosMatriculados=2;
			//guarda en la var nota del alumno1 el valor 6.7
			notaAlumno1=6.7;
			//guarda en la var nota del alumno2 el valor 4.9
			notaAlumno2=4.9;

			//MOSTRAR MENSAJES EN LA CONSOLA
			//Escribe en consola el nombre de la asignatura
			System.out.println("la asignatura es "+asignatura);
			//Escribe en consola a partir de los valores de las variables: 'en programacion hay 2 alumnos'
			System.out.println("en "+asignatura+" hay "+alumnosMatriculados+" alumnos");
			
			//PROGRAMA A IMPLEMENTAR
			//creacion de un objeto scanner
			Scanner sc=new Scanner(System.in);
			//Pide al usuario que introduzca la asignatura
			System.out.println("Cual es la asignatura?");
			//guarda en la var. asign. el texto introducido por el usuario
			asignatura=sc.nextLine();
			//Pide al usuario que introduzca la nota del primer alumno
			System.out.println("Cual es la nota del primer alumno?");
			notaAlumno1=sc.nextDouble();
			//Pide al suario la nota del segundo alumno
			System.out.println("Cual es la nota del segundo alumno?");
			notaAlumno2=sc.nextDouble();
			//Guarda en la var media la media de las notas introducidas por el usuario
			notaMedia=(notaAlumno1+notaAlumno2)/alumnosMatriculados;
			//Muestra por pantalla el mensaje 'la nota media en xxx es yy'
			System.out.print("La nota media de "+asignatura+" es "+notaMedia);
			
			//alumnos matriculados deberia ser constante porque seria ams facil cambiarlo
			//final int ALUMNOSMATRICULADOS=2;

			
	}

}
