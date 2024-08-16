package test;

import clase1.Paciente;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarando una instancia de un objeto
		// es la primera parte del proyecto
		Paciente yo = new Paciente("nombre","apellido",1.0f,2.2f);
		//despues de declarar los "pasientes" 
		//consultas a realizar
		System.out.println(yo.traerNombreCompleto());
	
		//crear un metodo para actualizar el peso
	}

}
