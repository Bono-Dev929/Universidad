package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Carga {

	private LocalDate fecha;
	private double valor;
	
	public Carga(LocalDate fecha, double valor) {
		super();
		this.fecha = fecha;
		this.valor = valor;
	}
	public LocalDate getfecha() {
		return fecha;
	}
	public void setfecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Carga [fecha=" + fecha + ", valor=" + valor + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha, valor);
	}
	
	public boolean equals(Carga c) {
		return valor == c.getValor() && fecha.equals(c.getfecha());
	}
	
	
	
}
