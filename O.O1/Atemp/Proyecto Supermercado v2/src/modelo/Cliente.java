package modelo;

import java.util.Objects;

public class Cliente {

	//Atributos
	private int idCliente;
	private String cliente;
	private long dni;
	private String direccion;
	
	//Constructor
	public Cliente(int idCliente, String cliente, long dni, String direccion) throws Exception {
		setIdCliente(idCliente);
		this.cliente = cliente;
		setDni(dni);
		this.direccion = direccion;
	}
	
	//Accesores
	public int getIdCliente() {
		return idCliente;
	}
	private void setIdCliente(int idCliente) throws Exception {
		if (idCliente <=0) {
			throw new Exception("ID invalido, debe ser mayor a 0");
		}
		this.idCliente = idCliente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public long getDni() {
		return dni;
	}
	private void setDni(long dni) throws Exception {
		if (dni <=0) {
			throw new Exception("DNI invalido, debe ser mayor a 0");
		}
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente= " + idCliente + ", cliente= " + cliente + ", dni= " + dni + ", direccion= " + direccion
				+ "]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(direccion, other.direccion) && dni == other.dni
				&& idCliente == other.idCliente;
	}
	
	
	
}
