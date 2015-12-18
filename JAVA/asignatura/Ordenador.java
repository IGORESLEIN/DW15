
public class Ordenador {
	private String codigo;
	private String cpu;
	private int ram;
	private String hd;
	
	//constructora
	Ordenador(String codigo){
		setCodigo(codigo);
	}
	//metodos
	public String toString() {
		return codigo+" ("+cpu+"-"+ram+"-"+hd+")";
	}
	//getters y setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}
	
}
