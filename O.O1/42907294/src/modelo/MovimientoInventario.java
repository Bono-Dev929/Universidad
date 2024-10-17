package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class MovimientoInventario {

	private int idMovimientoInventario;
	private Producto producto;
	private LocalDate fecha;
	private int cantidad;
	public MovimientoInventario(int idMovimientoInventario, Producto producto, LocalDate fecha, int cantidad) {
		super();
		this.idMovimientoInventario = idMovimientoInventario;
		this.producto = producto;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}
	public int getIdMovimientoInventario() {
		return idMovimientoInventario;
	}
	public void setIdMovimientoInventario(int idMovimientoInventario) {
		this.idMovimientoInventario = idMovimientoInventario;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "MovimientoInventario [idMovimientoInventario=" + idMovimientoInventario + ", producto=" + producto
				+ ", fecha=" + fecha + ", cantidad=" + cantidad + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, fecha, idMovimientoInventario, producto);
	}
	public boolean equals(MovimientoInventario m) {
		return cantidad == m.cantidad && fecha.equals(m.fecha)
				&& idMovimientoInventario == m.idMovimientoInventario && producto.equals(m.producto);
	}
	
	
	
}
