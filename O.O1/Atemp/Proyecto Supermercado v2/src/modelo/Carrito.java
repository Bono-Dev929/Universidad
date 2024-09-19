package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Carrito {

	//Atributos
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> listItem;
	private Cliente cliente;
	
	//Constructor
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, Cliente cliente) {
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.listItem = new ArrayList<ItemCarrito>();
		this.setCliente(cliente);
	}

	//Metodos
	public boolean agregarItem(Producto p, int c) throws Exception {
		
		int id = 1;
		
		if (traerItemProducto(p) == null) {
			if(!listItem.isEmpty())
				id = listItem.get(listItem.size()-1).getIdItem()+1;
			ItemCarrito item = new ItemCarrito(id, p, c);
			listItem.add(item);
		}else {
			traerItemProducto(p).setCantidad(traerItemProducto(p).getCantidad()+c);
		}
		
		return true;
	}

	public ItemCarrito traerItemProducto(Producto p) {
		
		int i =0;
		ItemCarrito item = null;
		
		while(i < listItem.size() && item == null) {
			if(listItem.get(i).getProducto().equals(p))
				item = listItem.get(i);
			i++;
		}
		
		return item;
	}
	
	public boolean eliminarItem(Producto p, int c) throws Exception {
			
		if(traerItemProducto(p) == null) 
			throw new Exception("No se encontro el Producto: "+p.getProducto());
		
		if(c>= traerItemProducto(p).getCantidad()) 
			listItem.remove(traerItemProducto(p));
		else 
			traerItemProducto(p).setCantidad(traerItemProducto(p).getCantidad()-c);
		
		return true;
	}
	
	public float calcularTotal() {
		
		float t = 0;
		
		for (int i = 0; i < listItem.size(); i++) {
			t += listItem.get(i).calcularSubTotal();
		}
		
		return t;
	}
	
	
	
	//Accesores
	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getListItem() {
		return listItem;
	}

	public void setListItem(List<ItemCarrito> listItem) {
		this.listItem = listItem;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "[IdCarrito: "+idCarrito +", Fecha: "+fecha+", Hora: "+hora+","+cliente+"Items: "+listItem+"]\n";
	}
	

	public boolean equals(Carrito c) {
		int cont=0;
		
		for (int i = 0; i < listItem.size(); i++) {
			if(listItem.get(i).equals(c.getListItem().get(i))) {
				cont +=1;
			}
		}
		
		return idCarrito == c.getIdCarrito() && fecha.equals(c.getFecha()) && hora.equals(c.getHora()) && cont ==listItem.size()
				&& cliente.equals(c.getCliente());
	}
	
}
