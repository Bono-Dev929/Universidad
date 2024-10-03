package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona {
	
	private long legajo;
	private float sueldo;
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaDeNacimiento, long legajo, float sueldo) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

	@Override
	public String hablar(){
		return "Soy un Empleado";
	}
	
	@Override
	public int calcularEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//calcularSueldo
	
	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", sueldo=" + sueldo + "]["+super.toString()+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo, sueldo);
		return result;
	}

	public boolean equals(Empleado e) {
		return super.equals(e);
	}	
	
	
}
