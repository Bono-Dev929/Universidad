package modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaDeNacimiento;
	public Persona(String nombre, String apellido, long dni, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public abstract String hablar();
	
	public abstract int calcularEdad();//Completar en las demas clases
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, fechaDeNacimiento, nombre);
	}

	public boolean equals(Persona p) {
		return dni == p.getDni();
	}
	
	
	
	
}
