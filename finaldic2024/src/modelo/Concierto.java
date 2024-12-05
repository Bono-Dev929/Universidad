package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Concierto extends Evento{
	
	private int diasAntesVentaOnline;
	private int duracionAproximada;
	
	public Concierto(int idEvento, int codigo, String nombre, LocalDate fecha, LocalTime hora, Ubicacion lugar,
			float precioEntrada, int diasAntesVentaOnline, int duracionAproximada) {
		super(idEvento, codigo, nombre, fecha, hora, lugar, precioEntrada);
		this.diasAntesVentaOnline = diasAntesVentaOnline;
		this.duracionAproximada = duracionAproximada;
	}

	public int getDiasAntesVentaOnline() {
		return diasAntesVentaOnline;
	}

	public void setDiasAntesVentaOnline(int diasAntesVentaOnline) {
		this.diasAntesVentaOnline = diasAntesVentaOnline;
	}

	public int getDuracionAproximada() {
		return duracionAproximada;
	}

	public void setDuracionAproximada(int duracionAproximada) {
		this.duracionAproximada = duracionAproximada;
	}

	@Override
	public String toString() {
		return "Concierto "+super.toString()+", diasAntesVentaOnline=" + diasAntesVentaOnline + ", duracionAproximada=" + duracionAproximada
				+ "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diasAntesVentaOnline, duracionAproximada);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concierto other = (Concierto) obj;
		return diasAntesVentaOnline == other.diasAntesVentaOnline && duracionAproximada == other.duracionAproximada;
	}
	
	//------CASO USO 6 ---------------
	public  boolean permiteVentaOnline(LocalDate fechaCompra) {
		return fecha.minusDays(diasAntesVentaOnline).isBefore(fechaCompra);
	};
	
	
	

}
