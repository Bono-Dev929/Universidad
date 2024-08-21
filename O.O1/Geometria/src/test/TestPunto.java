package test;

import modelo.*;

public class TestPunto {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(5 , 6);
		Punto p2 = new Punto(8 , 4);
		
		System.out.println("Test 1 ditintas Coordenadas, distinto objeto");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		
	}

}
