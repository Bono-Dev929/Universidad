package test;

import modelo.Punto;

public class TestPunto2 {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(10, 9);
		Punto p2 = new Punto(10, 9);
		
		System.out.println("Test 2: Coordenadas iguales , diferentes objetos");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

}
