package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public abstract class Evento {
	
	protected int idEvento;
	protected int codigo;
	protected String nombre;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected Ubicacion lugar;
	protected float precioEntrada;
	
	public Evento(int idEvento, int codigo, String nombre, LocalDate fecha, LocalTime hora, Ubicacion lugar,
			float precioEntrada) {
		super();
		this.idEvento = idEvento;
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.precioEntrada = precioEntrada;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Ubicacion getLugar() {
		return lugar;
	}
	public void setLugar(Ubicacion lugar) {
		this.lugar = lugar;
	}
	public float getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(float precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	@Override
	public String toString() {
		return "[idEvento=" + idEvento + ", codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha
				+ ", hora=" + hora + ", lugar=" + lugar + ", precioEntrada=" + precioEntrada ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fecha, hora, idEvento, lugar, nombre, precioEntrada);
	}
	
	public boolean equals(Evento e) {
		return codigo == e.getCodigo();
	}
	//------CASO USO 6 ---------------
	public abstract boolean permiteVentaOnline(LocalDate fechaCompra);
	
	
}
