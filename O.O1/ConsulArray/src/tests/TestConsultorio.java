package tests;

import modelo.*;

public class TestConsultorio {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("Lucas", "Bono", 1.84f, 98.2f);
		Paciente p2 = new Paciente("Jose", "Perez", 1.70f, 70.6f);
		Paciente p3 = new Paciente("Jose", "Fernandez", 1.75f, 80.6f);
		Paciente p4 = new Paciente("Martin", "Gonzales", 1.80f, 79.5f);
		Paciente p5 = new Paciente("Jose", "Perez", 1.70f, 70.6f);
		
		Paciente[] listaPacientes = {p1,p2,p3,p4,p5};
		
		Medico m1 = new Medico("Jose", "Martinez", "General", listaPacientes);
		
		Paciente p6 = new Paciente("Lucas", "Bono", 1.84f, 98.2f);
		Paciente p7 = new Paciente("Jose", "Perez", 1.70f, 70.6f);
		Paciente p8 = new Paciente("Jose", "Fernandez", 1.75f, 80.6f);
		Paciente p9 = new Paciente("Martin", "Gonzales", 1.80f, 79.5f);
		Paciente p10 = new Paciente("Jose", "Perez", 1.70f, 70.6f);
		
		Paciente[] listaPacientes2 = {p6,p7,p8,p9,p10};
		
		Medico m2 = new Medico("Jose", "Martinez", "General", listaPacientes2);
		
		//------ToString
		System.out.println(m1.toString());
		
		//-----EQUALS
		System.out.println("Los medicos son iguales? "+m1.equals(m2));
		
		//--------Traer Prom Pesos
		System.out.println("El promedio de pesos es: "+m1.traerPromedioPeso());
		
		//--------Traer mayor estatura
		System.out.println("El paciente con mayor estatura es: \n"+m1.traerMayorEstatura().toString());
		
		///------menor IMC
		System.out.println("El paciente con el menor IMC es: \n"+m1.traerMenorImc().toString()+"IMC: "+m1.calcularIMC(m1.traerMenorImc()));
		
	}

}
