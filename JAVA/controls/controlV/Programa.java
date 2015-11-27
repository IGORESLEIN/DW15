
public class Programa {
	public static void main(String[]args){
		//nuevos alumnos
		Asignatura asig1;
		asig1=new Asignatura("programacion");
		Profesor profe1;
		profe1=new Profesor("Aitor", "Alkorta");
		//modificar atributos
		profe1.setAsignatura(asig1);
		//imprimir profesor y asignatura impartida
		System.out.println("El profesor "+profe1+" imparte "+profe1.getAsignatura());
		

	}

}
