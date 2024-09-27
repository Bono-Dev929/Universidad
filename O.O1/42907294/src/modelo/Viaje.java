package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Viaje {

	private String medioYlinea;
	private double precio;
	private double descuento;
	private LocalDate fecha;
	
	public Viaje(String medioYlinea, double precio, double descuento, LocalDate fecha) {
		super();
		this.medioYlinea = medioYlinea;
		this.precio = precio;
		this.descuento = descuento;
		this.fecha = fecha;
	}
	public String getMedioYlinea() {
		return medioYlinea;
	}
	public void setMedioYlinea(String medioYlinea) {
		this.medioYlinea = medioYlinea;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setfecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Viaje [medioYlinea=" + medioYlinea + ", precio=" + precio + ", descuento=" + descuento + ", fecha="
				+ fecha + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(descuento, fecha, medioYlinea, precio);
	}
	
	public boolean equals(Viaje v) {
		
		return descuento == v.getDescuento() && precio == v.getPrecio() && medioYlinea.equals(v.getMedioYlinea()) && fecha.equals(v.getFecha());
	}
	
	
	
}
