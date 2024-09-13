package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	//atributos
	private List<Producto> gondola;
	private List<Cliente> clientes;
	private List<Carrito> carritos;

	//constructor
	public Supermercado() {
		this.gondola = new ArrayList<Producto>();
		this.clientes = new ArrayList<Cliente>();
		this.carritos = new ArrayList<Carrito>();
	}
	
	//PRODUCTOS
	public boolean agregarProducto(String prod, float precio) throws Exception {
		
		int id = 1;
		
		for (Producto producto : gondola)
			if(producto.getProducto().equals(prod)/*producto.getPrecio() == precio*/) 
				throw new Exception("El producto "+prod+" ya existe en la gondola");
			
		
		
		if(gondola.size() !=0)
			id = gondola.get(gondola.size()-1).getIdProducto()+1;	
		
		Producto p = new Producto(id, prod, precio, null, null);
		gondola.add(p);
		
		return true;
	}
	
	public Producto traerProducto(int idProducto) {
		Producto p = null;
		int i=0;
		
		while(i<gondola.size() && p == null) {
			if (gondola.get(i).getIdProducto() == idProducto) 
				p = gondola.get(i);
			i+=1;
		}
		
		return p;
	}
	
	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception{
		
		if (traerProducto(idProducto) == null)
			throw new Exception("El producto que quiere modificar no existe");
		
		traerProducto(idProducto).setProducto(producto);
		traerProducto(idProducto).setPrecio(precio);
		
		return true;
	}
	
	public boolean eliminarProducto(int id) throws Exception {
		Producto pBuscado = traerProducto(id);
		if (pBuscado == null) {
			throw new Exception("El producto que quiere Eliminar no existe");}
		
		return gondola.remove(pBuscado);
	}
	
	
	//CLIENTES
	public boolean agregarCliente(String n, String d, long dni) throws Exception {
		
		int i = 0, id = 1;
		
		while (i<clientes.size()) {
			if(clientes.get(i).getDni() == dni)
				throw new Exception("El cliente con DNI "+dni+" ya existe");
			i++;
		}
		
		/*
		 if(traerCliente(dni) != null)
				throw new Exception("El cliente con DNI "+dni+" ya existe");
		*/
		
		if (clientes.size() !=0)
			id = clientes.get(clientes.size()-1).getIdCliente()+1;
		
		Cliente c = new Cliente(id, n, dni, d);
		clientes.add(c);
		
		
		return true;
	}
	
	public Cliente traerCliente(long dni) {
		
		Cliente c = null;
		int i=0;
		while(i<clientes.size()&& c == null) {
			if(clientes.get(i).getDni()==dni)
				c= clientes.get(i);
			i++;
		}
		return c;
	}
	
	public boolean eliminarCliente(long dni) throws Exception {
		
		int i =0, j=-1;
		
		if(traerCliente(dni) == null)
			throw new Exception("No se encontro el cliente con el DNI: "+dni);
		
		while(i<clientes.size() && j<0) {
			if (clientes.get(i).getDni()==dni) {
				j=i;
			}
			i++;
		}
		//traerCliente(dni).getIdCliente()-1
		clientes.remove(j);
		
		return true;
	}
	
	public boolean modificarCliente(long dni, String dir) throws Exception {
		
		if(traerCliente(dni) == null)
			throw new Exception("No existe cliente con DNI: "+dni);
	
		traerCliente(dni).setDireccion(dir);
		
		return true;
	}
	
	//CARRITOS
	public boolean agregarCarrito(long dni) throws Exception{
		
		int id = 1;
		
		if(traerCliente(dni)== null)
			throw new Exception("El cliente no existe");
		if(carritos.size()!=0)
			id= carritos.get(carritos.size()-1).getIdCarrito()+1;
		
		Carrito c = new Carrito(id, LocalDate.now(), LocalTime.now(), traerCliente(dni));
		carritos.add(c);
		return true;
	}
	
	public Carrito traerCarrito(int id){
		
		Carrito c = null;
		int i = 0;
		
		while(i<carritos.size() && c == null) {
			if (carritos.get(i).getIdCarrito() == id)
				c = carritos.get(i); 
			i++;
		}
		
		return c;
	}
	
	public List<Carrito> traerCarritos(long dni){
		
		List<Carrito> lsC = new ArrayList<Carrito>();
		
		for (Carrito carrito : carritos)
			if(carrito.getCliente().getDni() == dni)
				lsC.add(carrito);
		
		return lsC;
	}
	
	//modificar
	
	public boolean eliminarCarrito(int id) throws Exception {
		
		if (traerCarrito(id) == null) 
			throw new Exception("");
		
		carritos.remove(id-1);
		
		return true;
	}
	/*
	public boolean agregarItemACarrito(Carrito carrito, Producto p, int cantidad) {
		carrito.agregarItem(null, 0)
	}
	
	public boolean agregarItemACarrito(int idCarrito, Producto p, int cantidad) {
		traerCarrito(idCarrito).agregarItem(null, 0)
	}
	
	
	/*
	 * public boolean agregarItem(long dni, int idP, int c, int idC) throws
	 * Exception {
	 * 
	 * if (traerCliente(dni) == null || traerProducto(idP) == null ||
	 * traerCarritos(dni).get(idC) == null) throw new
	 * Exception("Cliente, IDProducto o IdCarrito Erroneos");
	 * 
	 * traerCarritos(dni).get(idC-1).agregarItem(traerProducto(idP), c);
	 * 
	 * return true; }
	 */
	
	public boolean eliminarItem(long dni, int idP, int c, int idC) {
		
		
		return true;
	}
	
	public List<Producto> getGondola(){
		return gondola;
	}
	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Carrito> getCarritos() {
		return carritos;
	}
	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}
	
	@Override
	public String toString() {
		return "Supermercado[\n"
				+ "Productos:\n"
				+gondola+"\n"
				+"Clientes:\n"
				+clientes+"\n"
				+"Carritos:\n"
				+carritos+"\n";
	}
	

	public boolean equals(Supermercado g) {
		
		int c1 = 0, c2 = 0, c3 = 0 ;
		
		for (int i = 0; i < gondola.size(); i++) 
			if (gondola.get(i).equals(g.getGondola().get(i))) 
				c1 +=1;
		
		for (int i = 0; i < clientes.size(); i++) 
			if (clientes.get(i).equals(g.getClientes().get(i))) 
				c2 +=1;
		
		for (int i = 0; i < carritos.size(); i++) 
			if (carritos.get(i).equals(g.getCarritos().get(i))) 
				c3 +=1;
		
		return c1 == gondola.size() && c2 == clientes.size() && c3 == carritos.size();
	}
	
	
	
}
