package test;

import modelo.ArregloUnidimencional;

public class TestArrayUnidimencional {

	public static void main(String[] args) {
		
		int[] vector = {1,5,6,1,100,-25,1,81,6,1};
		int[] vector2 = {9,5,6,10,5,81,5,2,5};
		
		ArregloUnidimencional v1 = new ArregloUnidimencional(vector);
		ArregloUnidimencional v2 = new ArregloUnidimencional(vector2);
		
		System.out.println("equals y toString");
		System.out.println(v1.toString());
		System.out.println(v1.equals(v2));
		
		System.out.println("\nEl menor de cada uno");
		System.out.println(v1.traerElMenor());
		System.out.println(v2.traerElMenor());

		System.out.println("\nEl mayor de cada uno");
		System.out.println(v1.traerElMayor());
		System.out.println(v2.traerElMayor());
	
		System.out.println("\nPromedio");
		System.out.println(v2.promedio());
		
		//------------------------- lista ordenada
		System.out.println("Lista ordenada ascendente");
		for (int i = 0; i < v1.getVector().length; i++) {
			System.out.print(v1.ordenarAcendente()[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("Lista ordenada descendente");
		for (int i = 0; i < v1.getVector().length; i++) {
			System.out.print(v1.ordenarDescendente()[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("Frecuencia del 1: "+ (v1.frecuencia(1)));
		
		System.out.println("moda: "+v1.moda());
		
	}

}
