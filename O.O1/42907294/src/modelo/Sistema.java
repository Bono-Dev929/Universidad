package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Sistema {

	private List<Producto> productos;
	private List<Categoria> categorias;
	private List<MovimientoInventario> movimientos;
	public Sistema() {
		super();
		this.productos =new ArrayList<Producto>();
		this.categorias = new ArrayList<Categoria>();
		this.movimientos = new ArrayList<MovimientoInventario>();
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<MovimientoInventario> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<MovimientoInventario> movimientos) {
		this.movimientos = movimientos;
	}
	@Override
	public String toString() {
		return "Sistema [productos=" + productos + ", \ncategorias=" + categorias + ", \nmovimientos=" + movimientos + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(categorias, movimientos, productos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sistema other = (Sistema) obj;
		return Objects.equals(categorias, other.categorias) && Objects.equals(movimientos, other.movimientos)
				&& Objects.equals(productos, other.productos);
	}
	
	//-------------	CASO USO 1 ------------------------------------
	public Categoria traerCategoria(String nombre) {
		Categoria categoria = null;
		int i =0;
		while (i < categorias.size() && categoria == null) {
			if (categorias.get(i).getNombre().equals(nombre)) categoria = categorias.get(i);
			i++;
		}
		return categoria;
	}
	//------------------- CASO USO 2---------------------
	public boolean agregarCategoria(String nombre) {
		return categorias.add(new Categoria(nombre));
	}
	
	//---------------------CASO USO 3 ---------------------
	public Producto traerProducto(int codigo) {
		Producto producto = null;
		int i =0;
		while (i<productos.size() && producto == null) {
			if (productos.get(i).getCodigo() == codigo) producto = productos.get(i);
			i++;
		}
		return producto;
	}
	//-----------------CASO USO 4 ---------------------
	public boolean agregarProductoNoPerecedero(int codigo,String nombre, Float precio, Categoria categoria, int mesesGarantia, int cantMinima) throws Exception {
		if (traerProducto(codigo) != null) throw new Exception("El producto ya existe");	
		return productos.add(new ProductoNoPerecedero(productos.isEmpty() ? 1: productos.get(productos.size()-1).getIdProducto()+1
				, codigo, nombre, precio, categoria, 0, mesesGarantia, cantMinima));
	}
	//--------------------CASO USO 5----------------------
	public boolean agregarProductoPerecedero(int codigo, String nombre, float precio, Categoria categoria, LocalDate fechaVencimiento, boolean requiereRefrigeracion) throws Exception {
		if (traerProducto(codigo)!= null) throw new Exception("El producto ya existe");
		
		return productos.add(new ProductoPerecedero(productos.isEmpty() ? 1: productos.get(productos.size()-1).getIdProducto()+1
				, codigo, nombre, precio, categoria, 0, fechaVencimiento, requiereRefrigeracion));
	}
	
	//------------------------Caso uso 7------------------
	public boolean agregarMovimientoInventario(Producto p, LocalDate fecha, int cant) throws Exception {
		if(cant*(-1) >p.getCantDisponible())throw new Exception("La cantidad no puede ser mayor a la disponible");	
		traerProducto(p.getCodigo()).setCantDisponible(p.getCantDisponible()+cant);
		return movimientos.add(new MovimientoInventario(movimientos.isEmpty()?1:movimientos.get(movimientos.size()-1).getIdMovimientoInventario()+1, p, fecha, cant));
	}
	//----------CASO USO 8----------------
	public List<MovimientoInventario> traerVentas(LocalDate desde, LocalDate hasta) {
		List<MovimientoInventario> lstAux =  new ArrayList<MovimientoInventario>();
		
		for (MovimientoInventario movimientoInventario : movimientos) {
			if(movimientoInventario.getFecha().isAfter(desde) || movimientoInventario.getFecha().isEqual(desde) 
					&& movimientoInventario.getFecha().isBefore(hasta) || movimientoInventario.getFecha().isEqual(hasta)) {
				if (movimientoInventario.getCantidad() <0) {
					lstAux.add(movimientoInventario);
				}
			}
		}
		return lstAux;
	}
	//------------CASO USO 9-----------------------
	public List<MovimientoInventario> traerVentasProductosRefrigerados(LocalDate fecha){
		List<MovimientoInventario> lstAux = new ArrayList<MovimientoInventario>();
		for (MovimientoInventario movimientoInventario : movimientos) {
			if (movimientoInventario.getFecha().isEqual(fecha)) {//busco por fecha
				if (movimientoInventario.getProducto() instanceof ProductoPerecedero) {//pregunto si es Perecederop
					ProductoPerecedero p = (ProductoPerecedero)movimientoInventario.getProducto();//lo casteo
					if (p.isRequiereRefrigeracion()) lstAux.add(movimientoInventario);//pregunto por refrigeracion y agrego
				}
			}
		}
		return lstAux;
	}
	//-------------CASO USO 10--------------------
	public List<Producto> traerProductosAReabastecer(Categoria c){
		List<Producto> lstAuxList = new ArrayList<Producto>();
		for (Producto producto : productos) {
			if (producto.getCategoria().equals(c)) {
				if (producto.esNecesarioRestablecer()) {
					lstAuxList.add(producto);
				}
			}
			
		}
		return lstAuxList;
	}
	
}
