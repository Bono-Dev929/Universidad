package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class ProductoPerecedero extends Producto{

	private LocalDate fechaVencimiento;
	private boolean requiereRefrigeracion;
	public ProductoPerecedero(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
			int cantDisponible, LocalDate fechaVencimiento, boolean requiereRefrigeracion) {
		super(idProducto, codigo, nombre, precio, categoria, cantDisponible);
		this.fechaVencimiento = fechaVencimiento;
		this.requiereRefrigeracion = requiereRefrigeracion;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public boolean isRequiereRefrigeracion() {
		return requiereRefrigeracion;
	}
	public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
		this.requiereRefrigeracion = requiereRefrigeracion;
	}
	@Override
	public String toString() {
		return "ProductoPerecedero ["+super.toString()+", fechaVencimiento=" + fechaVencimiento + ", requiereRefrigeracion="
				+ requiereRefrigeracion + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fechaVencimiento, requiereRefrigeracion);
		return result;
	}
	@Override
	public boolean equals(Producto p) {
		ProductoPerecedero other = (ProductoPerecedero) p;
		return Objects.equals(fechaVencimiento, other.fechaVencimiento)
				&& requiereRefrigeracion == other.requiereRefrigeracion&&
				super.equals(p);
	}
	//-----------caso uso 6---------
	@Override
	public boolean esNecesarioRestablecer() {
		return fechaVencimiento.isBefore(LocalDate.now().plusDays(20));
	}
	
	
}
