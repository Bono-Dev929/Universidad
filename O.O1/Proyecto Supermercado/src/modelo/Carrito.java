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
	
	//Constructor
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora) {
		super();
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.listItem = new ArrayList<ItemCarrito>();
	}

	//Metodos
	
	public boolean agregarItem(Producto p, int c) throws Exception {
		
		ItemCarrito item = new ItemCarrito(0, p, c);
		boolean v = false;
		int i = 0;
		
		if(c<1) {
			throw new Exception("Cantidad nula, el producto "+p.getProducto()+" no se agrega.");
		}
		
		if(listItem.size() == 0) {
			listItem.add(item);
			v = true;
		}else {
			while (i < listItem.size()) {
				if(listItem.get(i).getProducto().equals(p)) {
					listItem.get(i).setCantidad(listItem.get(i).getCantidad()+c);
					v = true;
					i = listItem.size();//break;
				}
				i+=1;
			}
		}
		if (!v) {
			item.setIdItem(listItem.get(listItem.size()-1).getIdItem()+1);
			listItem.add(item);
		}
		
		return true;
	}
	
	public boolean eliminarItem(Producto p, int c) throws Exception {
		
		int i=0, j = -1;
		
		while (i<listItem.size()) {
			if (listItem.get(i).getProducto().equals(p)) {
				j=i;
				i=listItem.size();
			}
			i+=1;
		}
		
		if(j<0) {
			throw new Exception("No se encontro el Producto: "+p.getProducto());
		}else {
			if(c>= listItem.get(j).getCantidad()) {
				listItem.remove(j);
			}else {
				listItem.get(j).setCantidad(listItem.get(j).getCantidad()-c);
			}
		}
		
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
	
	@Override
	public String toString() {
		String aux = "";
		
		for (int i = 0; i < listItem.size(); i++) {
			aux += listItem.get(i)+"\n";
		}
		
		return "[IdCarrito: "+idCarrito +", Fecha: "+fecha+", Hora: "+hora+", Items:\n"+aux+"]";
	}
	

	public boolean equals(Carrito c) {
		int cont=0;
		
		for (int i = 0; i < listItem.size(); i++) {
			if(listItem.get(i).equals(c.getListItem().get(i))) {
				cont +=1;
			}
		}
		
		return idCarrito == c.getIdCarrito() && fecha.equals(c.getFecha()) && hora.equals(c.getHora()) && cont ==listItem.size();
	}
}
