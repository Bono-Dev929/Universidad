package modelo;

import java.util.Objects;

public class Repartidor {
	private int codigo;
	private boolean ocupado;
	public Repartidor(int codigo) {
		super();
		this.codigo = codigo;
		this.ocupado = false;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Repartidor [codigo=" + codigo + ", ocupado=" + ocupado + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, ocupado);
	}
	
	public boolean equals(Repartidor r) {
		return codigo == r.getCodigo();
	}
	
}
