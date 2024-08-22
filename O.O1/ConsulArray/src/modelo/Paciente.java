package modelo;
/**
 * paciente
 */
public class Paciente {

	//atributos 
	private String nombre;//los atributos se declaran privados
	private String apellido;
	private float estatura;
	private float peso;
	
	//seccion del Constructor
	public Paciente(String nombre, String apellido, float estatura, float peso) {// atravez de este metodo creamos un objeto especifico
		this.apellido = apellido;
		this.nombre =nombre;
		this.estatura = estatura;
		this.peso = peso;
		
	}///termina la seccion del constructor
	
	//empieza la seccion de comportamientos o metodos
	
	public String traerNombreCompleto() {return this.nombre + " "+ this.apellido;}
	
	/**
	 * Se usa para modificar el peso de un paciente respecto de su peso anterior sumandole la  diferencia del peso actual
	 * 
	 * @param newPeso es la diferencia que se registra con respecto al peso anterior del pasiente
	 * */
	public void actualizarPeso(int diferencia) {
		setPeso((this.peso + diferencia));
	}
	
	
	//termina seccion metodos/ comportamientos
	//empiezan los get y set
	public String getNombre(){
		return this.nombre;
	}
	public void setAltura(float estatura) {
		this.estatura= estatura;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "[Nombre: "+ nombre +", Apellido: "+ apellido +"Peso: "+this.peso+", Estatura: "+this.estatura+"]\n";
	}
	
	public boolean equals(Paciente p) {
		return (nombre == p.getNombre() && apellido == p.getApellido() && peso == p.getPeso() && estatura == p.getEstatura());
	}
	
	
	
}
