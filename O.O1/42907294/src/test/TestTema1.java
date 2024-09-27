package test;

import java.time.LocalDate;
import modelo.*;

public class TestTema1 {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		//test 1
		try {
			sistema.agregarUsuario(11111111, "Apellido 1", "Nombre 1");
			sistema.agregarUsuario(22222222, "Apellido 2", "Nombre 2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("PRUEBA 1------------------------");
			System.out.println(sistema.getLstUsuarios());
			System.out.println("-------------------------------");
			System.out.println();
		}
		
		//test 2
		try {
			sistema.agregarTarjeta("111222", sistema.traerUsuario(11111111));
			sistema.agregarTarjeta("333444", sistema.traerUsuario(22222222));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("PRUEBA 2-----------------------");
			System.out.println(sistema.getLstTarjetas());
			System.out.println("-------------------------------");
			System.out.println();
		}
		
		//test 3
		sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 23), 200);
		sistema.traerTarjeta("111222").agregarCarga(LocalDate.of(2024, 9, 30), 800);
		System.out.println("PRUEBA 3 ---------------------------");
		System.out.println(sistema.traerTarjeta("111222").getLstCargas());
		System.out.println(sistema.traerTarjeta("111222").getSaldoActual());
		System.out.println("--------------------------------------------");
		System.out.println();		
		//test4
		try {
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 1));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 2));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 2", 200.0, LocalDate.of(2024, 10, 2));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 3", 100.0, LocalDate.of(2024, 10, 2));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 4", 150.0, LocalDate.of(2024, 10, 2));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 3));
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 100.0, LocalDate.of(2024, 10, 4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("PRUEBA 4 ---------------------------");
			System.out.println(sistema.traerTarjeta("111222").getLstViajes());
			System.out.println("Saldo Actual: "+sistema.traerTarjeta("111222").getSaldoActual());
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		
		//test 5
		System.out.println("PRUEBA 5---------------------------------------");
		try {
			sistema.traerTarjeta("111222").agregarViaje("Colectivo 1", 1000, LocalDate.of(2024, 10, 2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		
		System.out.println("PRUEBA 6---------------------------------------");
		try {
			System.out.println("Gastos en un dia: "+sistema.traerTarjeta("111222").calcularGastoTarjetaEnDia(LocalDate.of(2024, 10, 2)));
			for (Viaje v : sistema.traerTarjeta("111222").traerViajes(LocalDate.of(2024, 10, 2))) {
				System.out.println("Descuento/Viaje: "+v.getDescuento());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		System.out.println("PRUEBA 7---------------------------------------");
		try {
			System.out.println("Usuarios sin saldo:");
			System.out.println(sistema.traerUsuarioSinSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		System.out.println("PRUEBA 8---------------------------------------");
		try {
			sistema.agregarUsuario(22222222, "Apellido 2", "Nombre 2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		
		System.out.println("PRUEBA 9---------------------------------------");
		try {
			sistema.agregarTarjeta("123", sistema.traerUsuario(22222222));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("--------------------------------------------");
			System.out.println();
		}
		
	}

}
