package modelo;

import java.util.Objects;

public class Cliente {
	private int dni;
	private String nombre;
	private String apellido;
	private boolean esPlus;
	private String direccion;
	public Cliente(int dni, String nombre, String apellido, boolean esPlus, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.esPlus = esPlus;
		this.direccion = direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isEsPlus() {
		return esPlus;
	}
	public void setEsPlus(boolean esPlus) {
		this.esPlus = esPlus;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", esPlus=" + esPlus
				+ ", direccion=" + direccion + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, direccion, dni, esPlus, nombre);
	}
	
	public boolean equals(Cliente c) {
		return dni == c.getDni();
	}
	
	
}
