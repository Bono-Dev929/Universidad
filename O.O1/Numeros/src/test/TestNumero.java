package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {
		
		Numero n1 = new Numero(5);
		
		//suma
		System.out.println(n1.sumar(10));// muestra 15
		System.out.println("---------------");
		
		//multiplicar
		System.out.println(n1.multiplicar(4));//muestra 20
		System.out.println("---------------");
		
		//esPar
		System.out.println(n1.esPar());//muestra false
		System.out.println("---------------");
		
		//esPrimo
		System.out.println(n1.esPrimo());//muestra true
		System.out.println("---------------");
		
		//convertirAString
		System.out.println(n1.convertirAString()+5);//muesra el numero pero como string si se le suma 5 me muestra 55
		System.out.println("---------------");
		
		//convertirEnDouble
		System.out.println(n1.convertirEnDouble());//muestra el numero como doble
		System.out.println("---------------");
		
		System.out.println(n1.factorial());//muestra 120
		System.out.println("---------------");
		
		//numeroCombinatorio
		System.out.println(n1.numeroCombinatorio(3));//10
		System.out.println(n1.numeroCombinatorio(6));//0
		System.out.println("---------------");
	}

}
