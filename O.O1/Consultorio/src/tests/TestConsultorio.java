package tests;

import modelo.*;

public class TestConsultorio {

	public static void main(String[] args) {
		
		//Crendo al medico
		Medico medico1 = new Medico("Daniel", "Lopez", "medico");
		
		//Creando Pacientes
		Paciente paciente1 = new Paciente("Jose", "Perez", 1.85f, 95.2f);
		Paciente paciente2 = new Paciente("Jose", "Fernandez", 1.75f, 87.2f);
		
		//Mostrando medico y pacientes con su imc
		System.out.println("Visita 1");
		System.out.println("Medico: "+medico1.traerNombreCompleto());
		System.out.println("Paciente "+paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente1));
		System.out.println("Paciente "+paciente2.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente2));
		System.out.println("\n");
		
		
	}

}
