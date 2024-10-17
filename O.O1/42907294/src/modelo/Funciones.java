package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {

	public static boolean esBisiesto(int anio) {
		return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
	}	
	public static String traerFechaCorta(LocalDate fecha) {
		return fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear();
	}
	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour()+":"+hora.getMinute();
	}
	public static boolean esDiaHabil(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue()>=1 && fecha.getDayOfWeek().getValue() <= 5 ;
	}
	public static String traerDiaDeLaSemana(LocalDate f) {
		String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves","Viernes","Sabado","Domingo"};
		return dias[f.getDayOfWeek().getValue()-1];
	}
	public static String traerMesEnLetras(LocalDate fecha) {
        String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        return mes[fecha.getMonthValue()-1];
    }
    public static String traerFechaLarga(LocalDate fecha) {
        String diaSemana = traerDiaDeLaSemana(fecha);
        String mes = traerMesEnLetras(fecha);
        int dia = fecha.getDayOfMonth();
        int anio = fecha.getYear();
        return diaSemana + " " + dia + " de " + mes + " del " + anio;
    }
    public static int traerCantDiasDeUnMes(int anio, int mes) {
        return LocalDate.of(anio, mes, 1).lengthOfMonth();
    }
    public static double aproximar2Decimal(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
    public static boolean esNumero(char c) {
        return Character.isDigit(c);
    }
    public static boolean esLetra(char c) {
        return Character.isLetter(c);
    }
    public static boolean esCadenaNros(String cadena) {
        int i = 0;
        boolean esSoloNumeros = true;
        while (i < cadena.length() && esSoloNumeros) {
            esSoloNumeros = esNumero(cadena.charAt(i));
            i++;
        }
        return esSoloNumeros;
    }
    public static boolean esCadenaLetras(String cadena) {
        int i = 0;
        boolean esSoloLetras = true;
        while (i < cadena.length() && esSoloLetras) {
            esSoloLetras = esLetra(cadena.charAt(i));
            i++;
        }   
        return esSoloLetras;
    }  
}