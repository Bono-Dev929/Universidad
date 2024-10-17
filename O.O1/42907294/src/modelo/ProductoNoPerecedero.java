package modelo;

import java.util.Objects;

public class ProductoNoPerecedero  extends Producto{
	private int mesesGarantia;
	private int cantMinima;
	public ProductoNoPerecedero(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
			int cantDisponible, int mesesGarantia, int cantMinima) {
		super(idProducto, codigo, nombre, precio, categoria, cantDisponible);
		this.mesesGarantia = mesesGarantia;
		this.cantMinima = cantMinima;
	}
	public int getMesesGarantia() {
		return mesesGarantia;
	}
	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}
	public int getCantMinima() {
		return cantMinima;
	}
	public void setCantMinima(int cantMinima) {
		this.cantMinima = cantMinima;
	}
	@Override
	public String toString() {
		return "ProductoNoPerecedero "+super.toString()+", mesesGarantia=" + mesesGarantia + ", cantMinima=" + cantMinima + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantMinima, mesesGarantia);
		return result;
	}
	@Override
	public boolean equals(Producto p) {
		ProductoNoPerecedero other = (ProductoNoPerecedero) p;
		return cantMinima == other.cantMinima && mesesGarantia == other.mesesGarantia && super.equals(p);
	}
	//-----------caso uso 6---------
	@Override
	public boolean esNecesarioRestablecer() {
		return cantDisponible <cantMinima;
	}
	
	
	
}
