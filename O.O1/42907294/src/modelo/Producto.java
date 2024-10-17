package modelo;

import java.util.Objects;

public abstract class Producto {

	protected int idProducto;
	protected int codigo;
	protected String nombre;
	protected float precio;
	protected  Categoria categoria;
	protected int cantDisponible;
	public Producto(int idProducto, int codigo, String nombre, float precio, Categoria categoria, int cantDisponible) {
		super();
		this.idProducto = idProducto;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.cantDisponible = cantDisponible;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getCantDisponible() {
		return cantDisponible;
	}
	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio
				+ ", categoria=" + categoria + ", cantDisponible=" + cantDisponible + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantDisponible, categoria, codigo, idProducto, nombre, precio);
	}
	public boolean equals(Producto p) {
		return cantDisponible == p.cantDisponible && categoria.equals(p.categoria)
				&& codigo == p.codigo && idProducto == p.idProducto && p.equals(p.nombre)
				&& precio == p.precio;
	}
	
	//--------------CASO USO 6--------------------
	public abstract boolean esNecesarioRestablecer();
	
}	
