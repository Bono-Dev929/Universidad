package modelo;

import java.util.Objects;

public class Ubicacion {
	private String nombre;
	private String direccion;
	private int capacidadMaxima;
	public Ubicacion(String nombre, String direccion, int capacidadMaxima) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidadMaxima = capacidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	@Override
	public String toString() {
		return "Ubicacion [nombre=" + nombre + ", direccion=" + direccion + ", capacidadMaxima=" + capacidadMaxima
				+ "] \n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacidadMaxima, direccion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ubicacion other = (Ubicacion) obj;
		return capacidadMaxima == other.capacidadMaxima && Objects.equals(direccion, other.direccion)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
