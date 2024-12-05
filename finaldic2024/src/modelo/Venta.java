package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Venta {
	private LocalDate fecha;
	private Evento evento;
	private int cantidad;
	private boolean online;
	public Venta(LocalDate fecha, Evento evento, int cantidad, boolean online) {
		super();
		this.fecha = fecha;
		this.evento = evento;
		this.cantidad = cantidad;
		this.online = online;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	@Override
	public String toString() {
		return "Ventas [fecha=" + fecha + ", evento=" + evento + ", cantidad=" + cantidad + ", online=" + online + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, evento, fecha, online);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return cantidad == other.cantidad && Objects.equals(evento, other.evento) && Objects.equals(fecha, other.fecha)
				&& online == other.online;
	}
	
	
	
	
}
