package modelo;


public class Producto {

	//Atributos
	private int idProducto;
	private String producto;
	private float precio;
	
	//constructor
	public Producto(int idProducto, String producto, float precio) {
		super();
		this.idProducto = idProducto;
		this.producto = producto;
		this.precio = precio;
	}
	
	//Metodos
	
	
	//Acesores
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
	
	@Override
	public String toString() {
		return "[Producto: "+producto+", idProducto: "+idProducto+", Precio: "+precio+"]\n";
	}
	
	public boolean equals(Producto p) {
		return idProducto == p.getIdProducto() && producto.equals(p.getProducto()) && precio == p.getPrecio();
	}
	
}
