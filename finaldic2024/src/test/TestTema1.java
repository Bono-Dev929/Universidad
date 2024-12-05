package test;

import java.time.LocalDate;
import java.time.LocalTime;
import modelo.*;

public class TestTema1 {

	public static void main(String[] args) {
		
		Sistema s = new Sistema();
		
		//-----TEST nro1-----------
		System.out.println("1)");
		s.agregarUbicacion("Gran Rex", "Av. Corrientes 857", 3200);
		s.agregarUbicacion("Luna Park", "Av. Eduardo Madero 470", 8400);
		s.agregarUbicacion("Teatro Colon", "Cerrito 628", 2400);
		s.agregarUbicacion("Teatro Metropolitan", "Av. Corrientes 1343", 850);
		System.out.println(s.getLstUbicaciones());
		
		System.out.println();
		//-----------TEST Nro2---------------------
		System.out.println("2)");
		try {
			s.agregarConcierto(1111, "Fito Paez", LocalDate.of(2025, 1, 18), LocalTime.of(21, 00), s.traerUbicacion("Gran Rex"), 25000, 60, 180);
			s.agregarConcierto(2222, "Andres Calamaro", LocalDate.of(2025, 1, 18), LocalTime.of(22, 00), s.traerUbicacion("Luna Park"), 30000, 20, 200);
			s.agregarObraTeatro(3333, "Mundodanza", LocalDate.of(2025, 1, 18), LocalTime.of(20, 00), s.traerUbicacion("Teatro Colon"), 20000, "Laura Falcoff", "Un espectaculo de danza para chicos y grandes");
			s.agregarObraTeatro(4444, "Fernando Sanjiao", LocalDate.of(2025, 1, 18), LocalTime.of(21, 00), s.traerUbicacion("Teatro Metropolitan"), 15000, "Fernando Sanjiao", "Festeja sus 20 años de comedia en una fiesta imperdible");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(s.getLstEventos());
		}
		
		System.out.println();
		//-----------TEST Nro3--------------
		System.out.println("3)");
		try {
			s.agregarVenta(LocalDate.of(2024, 11, 28), s.traerEvento(1111), 2, false);
			s.agregarVenta(LocalDate.of(2024, 11, 29), s.traerEvento(1111), 3, true);
			s.agregarVenta(LocalDate.of(2024, 11, 28), s.traerEvento(2222), 4, false);
			s.agregarVenta(LocalDate.of(2024, 11, 29), s.traerEvento(2222), 5, false);
			s.agregarVenta(LocalDate.of(2024, 11, 28), s.traerEvento(3333), 6, true);
			s.agregarVenta(LocalDate.of(2024, 11, 29), s.traerEvento(3333), 7, false);
			s.agregarVenta(LocalDate.of(2024, 11, 28), s.traerEvento(4444), 8, true);
			s.agregarVenta(LocalDate.of(2024, 11, 29), s.traerEvento(4444), 9, false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(s.getLstVentas());
		}
		
		
		System.out.println();
		//----------------TEST Nro4----------------
		System.out.println("4)");
		System.out.println(s.traerConciertos(LocalDate.of(2025, 1, 18), 190));
		
		
		System.out.println();
		//----------------TEST Nro5-------------------
		System.out.println("5)");
		System.out.println("La recaudacion fue: "+s.traerRecaudacionEvento(s.traerEvento(1111)));
		
		
		System.out.println();
		//----------------TEST Nro6----------------
		System.out.println("6)");
		System.out.println(s.traerEventosCompraOnline());
		
		
		System.out.println();
		//----------------TEST Nro7----------------
		System.out.println("7)");
		try {
			s.agregarConcierto(1111, "Fito Paez", LocalDate.of(2025, 1, 18), LocalTime.of(21, 0), s.traerUbicacion("Gran Rex"), 25000, 60, 180);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println();
		//----------------TEST Nro8----------------
		System.out.println("8)");
		try {
			s.agregarVenta(LocalDate.of(2024, 11, 20), s.traerEvento(2222), 4, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}	

}
