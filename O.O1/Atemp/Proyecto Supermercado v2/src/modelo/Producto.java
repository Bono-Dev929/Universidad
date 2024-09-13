package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

	// Atributos
	private int idProducto;
	private String producto;
	private float precio;

	private LocalDate elaboracion;
	private LocalDate vencimiento;

	// constructor
	public Producto(int idProducto, String producto, float precio, LocalDate elaboracion, LocalDate vencimiento) throws Exception {
		super();
		this.idProducto = idProducto;
		this.producto = producto;
		this.precio = precio;
		this.elaboracion = elaboracion;
		setVencimiento(vencimiento);
	}

	// Metodos

	public boolean estaVencido(LocalDate vencimiento) throws Exception {
		return (vencimiento.getYear() < LocalDate.now().getYear()
				|| vencimiento.getMonthValue() < LocalDate.now().getMonthValue()
				|| vencimiento.getDayOfMonth() < LocalDate.now().getDayOfMonth());
	}

	// Acesores
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public LocalDate getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(LocalDate elaboracion) {
		this.elaboracion = elaboracion;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) throws Exception {
		if(estaVencido(vencimiento)) throw new Exception("");
		this.vencimiento = vencimiento;
	}

	@Override
	public String toString() {
		return "[Producto: " + producto + ", idProducto: " + idProducto + ", Precio: " + precio + "]\n";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}

	public boolean equals(Producto p) {
		return idProducto == p.getIdProducto();
	}

}
