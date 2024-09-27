package modelo;

import java.util.Objects;

public class Usuario {
	
	private int idUsuario;
	private long dni;
	private String apellido;
	private String nombre;
	
	public Usuario(int idUsuario, long dni, String apellido, String nombre) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre
				+ "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, idUsuario, nombre);
	}
	
	public boolean equals(Usuario u) {
		return idUsuario == u.getIdUsuario() && dni == u.getDni() && nombre.equals(u.getNombre()) && apellido.equals(u.getApellido());
	}
	
	
}
