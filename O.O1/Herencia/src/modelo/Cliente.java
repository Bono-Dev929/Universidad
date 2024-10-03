package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente extends Persona {
	
	private String ciut;
	private float limiteCredtito;
	
	public Cliente(String nombre, String apellido, long dni, LocalDate fechaDeNacimiento, String ciut,float limiteCredtito) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.ciut = ciut;
		this.limiteCredtito = limiteCredtito;
	}

	@Override
	public String hablar(){
		return "Soy un Cliente";
	}
	
	
	@Override
	public int calcularEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//estadoCredito
	
	public String getCiut() {
		return ciut;
	}

	public void setCiut(String ciut) {
		this.ciut = ciut;
	}

	public float getLimiteCredtito() {
		return limiteCredtito;
	}

	public void setLimiteCredtito(float limiteCredtito) {
		this.limiteCredtito = limiteCredtito;
	}

	@Override
	public String toString() {
		return "Cliente [ciut=" + ciut + ", limiteCredtito=" + limiteCredtito + "]["+super.toString()+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ciut, limiteCredtito);
		return result;
	}

	public boolean equals(Cliente c) {
		return super.equals(c);
	}

	



	
	
	
	
}
