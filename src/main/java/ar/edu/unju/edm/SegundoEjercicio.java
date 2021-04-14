package ar.edu.unju.edm;

public class SegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura;
		int base;
		
		altura = 10;
		base = 20;
		
		//pasar al rectangulo
		//llamar al constructor
		Rectangulo unRectangulo = new Rectangulo();
		unRectangulo.calcularSuperficie(altura, base);
		int resuultado = unRectangulo.calcularSuperficie(base, altura);
		System.out.println("La superficie del rectangulo es:"+ resuultado   );
	
		//PERIMETRO
		unRectangulo.setAltura(altura);
		unRectangulo.setBase(base);
		
		unRectangulo.calcularPerimentro();
		System.out.println("El perimetro es: "+unRectangulo.getPerimetro() );
	}

}
