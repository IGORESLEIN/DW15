
public class Alumno extends Persona{
	//def ctes
		private static final int NUM_EVAL=3;
		//def atributos
		public double[] lstNotas=new double[NUM_EVAL];
		private static int contAlumnos=0;
		//def metodos
		//constructoras
		public Alumno(String nombre){
			//llamar a la constructora del padre
			super(nombre);		
			//inicializar el array de notas
			for (int i=0;i<lstNotas.length;i++){
				lstNotas[i]=-1;
			}
			contAlumnos++;
			
		}
		
		public static int getContAlumnos() {
			return contAlumnos;
		}
		public static void setContAlumnos(int contAlumnos) {
			Alumno.contAlumnos = contAlumnos;
		}
		//resto de métodos
		public double getNota1() {
			return lstNotas[0];
		}
		public void setNota1(double nota1) {
			this.lstNotas[0] = nota1;
		}
		public double getNota2() {
			return lstNotas[1];
		}
		public void setNota2(double nota2) {
			this.lstNotas[1] = nota2;
		}
		public double getNota3() {
			return lstNotas[2];
		}
		public void setNota3(double nota3) {
			this.lstNotas[2] = nota3;
		}
		public double getNotaMedia(){
			double suma=0;
			for (int i=0;i<lstNotas.length;i++){
				suma=suma+lstNotas[i];
			}
				
			return suma/NUM_EVAL;
		}
		
		public double getNota(int eval){
			if(eval>=1 && eval<=NUM_EVAL){
				//ha introducido una eval. correcta
				return lstNotas[eval-1];
			}else{
				return -1;
			}
		}
		public void setNota(int eval,double nota){
			//comprobar que la eval es correcta
			if((eval>=1 && eval<=NUM_EVAL)&&
			   (nota>=0 && nota<=10)){
				lstNotas[eval-1]=nota;
			}
		}
		public String toString(){
			return super.toString()+" "+getNotaMedia();
		}

}
