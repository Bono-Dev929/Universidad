package modelo;

import modelo.Paciente;

public class Medico {
	
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private String especialidad;
	private Paciente[] pacientesFrecuentes;
	
	//CONSTRUCTOR
	public Medico(String nombre,String apellido,String especialidad,Paciente[] pacientesFrecuentes) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.pacientesFrecuentes = pacientesFrecuentes;
	}
	//METODOS
	public String traerNombreCompleto() {return this.nombre + " "+ this.apellido;}
	
	public float calcularIMC(Paciente p) {return (p.getPeso()/(p.getEstatura()*p.getEstatura()));}
	
	public double traerPromedioPeso() {
		double pesos = 0;
		
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			pesos += pacientesFrecuentes[i].getPeso();
		}
		
		
		return pesos/pacientesFrecuentes.length;
	}
	
	public Paciente traerMayorEstatura() {
		Paciente p = pacientesFrecuentes[0];
		
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			if (p.getEstatura() < pacientesFrecuentes[i].getEstatura()) {
				p = pacientesFrecuentes[i];
			}
		}
		
		return p;
	}
	
	public Paciente traerMenorImc(){
		Paciente p = pacientesFrecuentes[0];
		
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			if (calcularIMC(p) > calcularIMC(pacientesFrecuentes[i])) {
				p = pacientesFrecuentes[i];
			}
		}
		
		return p;
	}
	

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
	public Paciente[] getPacientesFrecuentes() {
		return pacientesFrecuentes;
	}

	public void setPacientesFrecuentes(Paciente[] pacientesFrecuentes) {
		this.pacientesFrecuentes = pacientesFrecuentes;
	}
	
	@Override
	public String toString() {
		String pacientes = "";
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			pacientes += pacientesFrecuentes[i].toString();
		}
		
		return "[Medico: "+nombre+" "+apellido+"][Especialidad: "+especialidad+"]"
				+ "\nPacientes Frecuentes:\n"+pacientes;
	}
	
	
	
	public boolean equals(Medico m) {
		int cont = 0;
		
		for (int i = 0; i < pacientesFrecuentes.length; i++) {
			if (pacientesFrecuentes[i].equals(m.getPacientesFrecuentes()[i])) {
				cont +=1;
			}
		}
		
		
		return (nombre == m.getNombre() && apellido == m.getApellido() && especialidad == m.getEspecialidad() && cont == pacientesFrecuentes.length);
	}	
	
	
	
	
	
	
	
	
}
