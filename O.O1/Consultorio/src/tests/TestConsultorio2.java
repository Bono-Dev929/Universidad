package tests;

import modelo.*;


public class TestConsultorio2 {

	public static void main(String[] args) {
		
		//Crendo al medico
		Medico medico1 = new Medico("Daniel", "Lopez", "medico");
		
		//Creando Pacientes
		Paciente paciente1 = new Paciente("Jose", "Perez", 1.80f, 94.6f);
		Paciente paciente2 = new Paciente("Jose", "Fernandez", 1.76f, 87.8f);
		
		
		//Mostrando medico y pacientes con su imc
		System.out.println("Medico: "+medico1.traerNombreCompleto());
		System.out.println("Paciente "+paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente1));
		System.out.println("Paciente "+paciente2.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente2));
		System.out.println("\n");
		//modificando el peso
		paciente1.actualizarPeso(-4);
		paciente2.actualizarPeso(1);
		//mostrando el nuevo imc
		System.out.println("Medico: "+medico1.traerNombreCompleto());
		System.out.println("Paciente "+paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente1));
		System.out.println("Paciente "+paciente2.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente2));
	}

}
