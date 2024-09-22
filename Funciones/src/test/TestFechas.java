package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import modelo.*;

public class TestFechas {

	
	
	public static void main(String[] args) {
		
		LocalTime h1 = LocalTime.now();
		LocalDate falta = LocalDate.of(2025,02,25);
		LocalDate ahora = LocalDate.now();
		
		System.out.println(falta);
		
		LocalDate weekafter = falta.plusWeeks(1);
		
	
		System.out.println("Trayendo FechaCorta "+Funciones.traerFechaCorta(falta));
		System.out.println("Trayendo HoraCorta "+Funciones.traerHoraCorta(h1));
		System.out.println("Es dia Habil? "+Funciones.esDiaHabil(ahora));
		System.out.println("Trayendo DiaSemana "+Funciones.traerDiaDeLaSemana(LocalDate.of(2024, 9, 23)));
		System.out.println("Trayendo Mes en Letras "+Funciones.traerMesEnLetras(ahora));
		System.out.println("Trayendo FechaLarga "+Funciones.traerFechaLarga(ahora));
		System.out.println("TrayendoCantidad de dia del mes "+Funciones.traerCantDiasDeUnMes(2025,5));
		System.out.println("Redondeando desimal "+Funciones.aproximar2Decimal(524.2651));
		System.out.println("Es un numero? "+Funciones.esNumero('4'));
		System.out.println("Es una letra "+Funciones.esLetra('s'));
		System.out.println("Es una cadena de numeros "+Funciones.esCadenaNros("22a51"));
		System.out.println("Es una cadena de letras "+Funciones.esCadenaLetras("Hola loco2"));
		System.out.println();
		
		
	}

}
