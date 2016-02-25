package diccionario;

public class Palabra {
private String palabra;
private String idioma;
private String significado;

public String getPalabra() {
	return palabra;
}
public void setPalabra(String palabra) {
	this.palabra = palabra;
}
public String getIdioma() {
	return idioma;
}
public void setIdioma(String idioma) {
	this.idioma = idioma;
}
public String getSignificado() {
	return significado;
}
public void setSignificado(String significado) {
	this.significado = significado;
}

public String toString(){
	return palabra;
	
}

public boolean equals(Palabra p){
	if(palabra.equals(p.getPalabra())){
		return true;
	}else{
		return false;
	}
}
}
