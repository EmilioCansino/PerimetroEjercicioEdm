package ar.edu.unju.edm;

public class Rectangulo {
	//la clase tiene tres cosas.
	//atributos: son las variables

	private int altura;
	private int base;
	
	private int perimetro;
	
	//String color;
	//String material;
	
	
	//constructor: crea el rectangulo
	
	public Rectangulo() {
		// TODO Auto-generated *constructor* stub
		
	}
	
	//metodo: resuelven el problema
	public int calcularSuperficie(int base, int altura){
	return base*altura;
	}
	public int calcularPerimetro(){
	return 2*base+2*altura;
	}

	
	public void calcularPerimentro() {
		perimetro = 2*base+2*altura;
		
	}
	
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int superficie) {
		this.perimetro = perimetro;
	}
	
}
