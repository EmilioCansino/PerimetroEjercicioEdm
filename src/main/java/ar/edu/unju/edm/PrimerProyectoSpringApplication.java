package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringApplication.class, args);
	
		System.out.println("HolaMundo, soy Emilio");
		
		double a;
		double b;
		
		a = 15;
		b = 10;
		
		System.out.println("La multiplicacion de a * b = " + a*b);
		
		sumar(a,b);
		
		System.out.println();
		
		System.out.println("El resultado de la suma es: "+ sumar(a,b));
	}
	
	public static double sumar(double a, double b) {
		return a+b;
		
	}
}
