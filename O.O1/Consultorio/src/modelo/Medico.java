package modelo;

import modelo.Paciente;

public class Medico {
	
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private String especialidad;
	
	//CONSTRUCTOR
	public Medico(String nombre,String apellido,String especialidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	//METODOS
	
	public float calcularIMC(Paciente p) {return (p.getPeso()/(p.getEstatura()*p.getEstatura()));}
	
	public String traerNombreCompleto() {return this.nombre + " "+ this.apellido;}

	//ACCESORES
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "[Medico: "+nombre+" "+apellido+"][Especialidad: "+especialidad+"]";
	}
}
