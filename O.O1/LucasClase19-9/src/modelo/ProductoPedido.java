package modelo;

import java.util.Objects;

public class ProductoPedido {

	private String producto;
	private double precio;
	
	public ProductoPedido(String producto, double precio) {
		super();
		this.producto = producto;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ProductoPedido [producto=" + producto + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(precio, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoPedido other = (ProductoPedido) obj;
		return Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(producto, other.producto);
	}
	
	
	
	
	
}
