package test;
import java.time.LocalDate;
import java.time.LocalTime;

import modelo.*;

public class TestTema2 {

	public static void main(String[] args) {
		Sistema s = new Sistema();
		
		System.out.println("Test nr 1 -----------------");
		try {
			s.agregarCliente(11111111, "Cliente", "Uno", false, "Calle 1111");
			s.agregarCliente(22222222, "Cliente", "Dos", true, "Calle 2222");
			s.agregarCliente(33333333, "Cliente", "Tres", false, "Calle 3333");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(s.getClientes());
		}
		System.out.println();
		
		System.out.println("Test nr 2 -----------------");
		s.agregarRepartidor(9999);
		s.agregarRepartidor(8888);
		s.agregarRepartidor(7777);
		s.agregarRepartidor(6666);
		System.out.println(s.getRepartidores());
		System.out.println();
		
		System.out.println("Test nr 3 -----------------");
		s.agregarPedidoSupermercado(LocalDate.of(2024, 11, 07), LocalTime.of(18, 0), "VEA", s.traerCliente(11111111), 5, true);
		s.agregarPedidoSupermercado(LocalDate.of(2024, 11, 07), LocalTime.of(18, 30),"DIA", s.traerCliente(22222222), 6, false);
		s.agregarPedidoSupermercado(LocalDate.of(2024, 11, 07), LocalTime.of(18, 45),"Mercado", s.traerCliente(33333333), 8, false);
		s.agregarPedidoRestaurante(LocalDate.of(2024, 11, 07), LocalTime.of(19, 20), "Pancheria", s.traerCliente(11111111), 10);
		s.agregarPedidoRestaurante(LocalDate.of(2024, 11, 07), LocalTime.of(19, 30), "Sushi", s.traerCliente(22222222), 15);
		s.agregarPedidoRestaurante(LocalDate.of(2024, 11, 07), LocalTime.of(19, 40), "Casa De Pastas", s.traerCliente(33333333), 20);
		System.out.println(s.getPedidos());
		System.out.println();
		System.out.println("Test Nr 4----------------------------");
		try {
			s.traerPedido(1).asignarRepartidor(s.traerRepartidor(9999));
			s.traerPedido(2).asignarRepartidor(s.traerRepartidor(8888));
			s.traerPedido(3).asignarRepartidor(s.traerRepartidor(7777));
			s.traerPedido(4).asignarRepartidor(s.traerRepartidor(6666));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(s.getPedidos());
		}
		System.out.println();
		System.out.println("Test 5--------------------------");
		s.traerPedido(1).marcarEntrega();
		s.traerPedido(2).marcarEntrega();
		System.out.println(s.getRepartidores());
		
		System.out.println("Test Nr 6--------------------------");
		System.out.println(s.traerEntregasAtrasadas());
		System.out.println();
		
		System.out.println("Test Nr 7----------------------");
		try {
			s.agregarCliente(22222222, "Cliente", "Dos", true, "Calle 2222");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Test Nr 8----------------------");
		try {
			s.traerPedido(6).asignarRepartidor(s.traerRepartidor(7777));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
