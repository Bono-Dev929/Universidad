package test;

import modelo.Punto;

public class TestPunto3 {

	public static void main(String[] args) {
		
		Punto p1= new Punto(8, 6);
		Punto p2= new Punto(15, 3);
		
		System.out.println("La distancia entre "+p1.toString()+" y "+p2.toString()+" es:");
		System.out.println(p1.calcularDistancia(p2));

	}

}
