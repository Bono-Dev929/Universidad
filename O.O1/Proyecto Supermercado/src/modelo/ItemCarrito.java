package modelo;

public class ItemCarrito {

	//Atributos
	private int idItem;
	private Producto producto;
	private int cantidad;
	
	//constructor
	public ItemCarrito(int idItem, Producto producto, int cantidad) {
		super();
		this.idItem = idItem;
		this.producto = producto;
		setCantidad(cantidad);
	}
	
	//metodos
	
	public float calcularSubTotal() {
		return producto.getPrecio()*cantidad;
	}
	
	//accesores
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		if(cantidad <=0)throw new Exception("Cantidad no puede ser menor a cero");
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "[idItem: "+idItem+", Cantidad: "+cantidad+", Producto: "+producto.toString()+"]";
	}
	
	public boolean equals(ItemCarrito i) {
		return idItem == i.getIdItem()&& producto.equals(i.getProducto())&&cantidad == i.getCantidad();
	}
	
}
