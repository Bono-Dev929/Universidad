package test;

import modelo.*;

public class Test2 {

	public static void main(String[] args)  {
		
		Supermercado s = new Supermercado();
		
		try {
			s.agregarCliente("Lucas", "mi casa 2561", 25252525);
			s.agregarCliente("Jose", "Echeveria 561", 12345678);
			s.agregarCliente("Pepe", "Pavon 601", 22222222);
			s.agregarCliente("Pericles", "9 de Julio", 11111111);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			s.agregarCarrito(25252525);
			s.agregarCarrito(11111111);
			s.agregarCarrito(12345678);
			s.agregarCarrito(25252525);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(s.agregarProducto("Detergente", 4500f));
			System.out.println(s.agregarProducto("Alfajor", 600f));
			System.out.println(s.agregarProducto("Lavandina", 2000f));
			System.out.println(s.agregarProducto("Caramelos", 100f));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			s.agregarItem(25252525, 2, 5, 1);
			s.agregarItem(25252525, 2, 5, 1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(s.eliminarProducto(0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(s);
		System.out.println("---------------------------------");
		System.out.println("Carritos de Yo");
		System.out.println(s.traerCarritos(25252525));
		System.out.println("Carritos de Pepe: "+s.traerCarritos(22222222));
		
		
		System.out.println(s.traerCarritos(25252525));
		
	}

}
