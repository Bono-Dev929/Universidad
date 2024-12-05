package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class ObrasTeatro extends Evento{
	private String director;
	private String resumen;
	public ObrasTeatro(int idEvento, int codigo, String nombre, LocalDate fecha, LocalTime hora, Ubicacion lugar,
			float precioEntrada, String director, String resumen) {
		super(idEvento, codigo, nombre, fecha, hora, lugar, precioEntrada);
		this.director = director;
		this.resumen = resumen;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	@Override
	public String toString() {
		return "ObrasTeatro "+super.toString()+", director=" + director + ", resumen=" + resumen + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(director, resumen);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObrasTeatro other = (ObrasTeatro) obj;
		return Objects.equals(director, other.director) && Objects.equals(resumen, other.resumen);
	}
	
	//------CASO USO 6 ---------------
	public boolean permiteVentaOnline(LocalDate fechaCompra) {
		return true;
	};
}
