package modelo;

import java.util.Objects;

public class Mesa {

	private int idMesa;
	private int nrMesa;
	private int capacidad;
	public Mesa(int idMesa, int nrMesa, int capacidad) {
		super();
		this.idMesa = idMesa;
		this.nrMesa = nrMesa;
		this.capacidad = capacidad;
	}
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getNrMesa() {
		return nrMesa;
	}
	public void setNrMesa(int nrMesa) {
		this.nrMesa = nrMesa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacidad, idMesa, nrMesa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		return capacidad == other.capacidad && idMesa == other.idMesa && nrMesa == other.nrMesa;
	}
	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", nrMesa=" + nrMesa + ", capacidad=" + capacidad + "]";
	}
	
	
	
}
