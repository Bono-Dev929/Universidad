package modelo;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {
	private List<Cliente> clientes;
	private List<Repartidor> repartidores;
	private List<Pedido> pedidos;
	public Sistema() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.repartidores = new ArrayList<Repartidor>();
		this.pedidos = new ArrayList<Pedido>();
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Repartidor> getRepartidores() {
		return repartidores;
	}
	public void setRepartidores(List<Repartidor> repartidores) {
		this.repartidores = repartidores;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	@Override
	public String toString() {
		return "Sistema [clientes=" + clientes + ",\n repartidores=" + repartidores + ",\n pedidos=" + pedidos + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(clientes, pedidos, repartidores);
	}
	
	public boolean equals(Sistema s) {
		return repartidores.equals(s.getRepartidores()) && clientes.equals(s.getClientes()) && pedidos.equals(s.getPedidos()) ;
	}
	
	
	//-------CASO USO 1------------------------
	public Cliente traerCliente(int dni) {
		Cliente c = null;
		int i =0;
		while(i<clientes.size() && c == null) {
			if(clientes.get(i).getDni() == dni)c = clientes.get(i);
			i++;
		}
		return c;
	}
	//----------CASO USO 2--------------------
	public boolean agregarCliente(int dni, String nombre, String apellido, boolean esPlus, String direccion) throws Exception {
		if(traerCliente(dni)!= null)throw new Exception("El cliente ya existe");
		return clientes.add(new Cliente(dni, nombre, apellido, esPlus, direccion));
	}
	//------------------caso uso 3-----------------------
	public boolean agregarRepartidor(int codigo ){
		return repartidores.add(new Repartidor(codigo));
	}
	
	//----------CASO USO 4--------------
	public Repartidor traerRepartidor(int codigo) {
		Repartidor r = null;
		int i =0;
		while(i<repartidores.size() && r == null) {
			if(repartidores.get(i).getCodigo() == codigo)r = repartidores.get(i);
			i++;
		}
		return r;
	}
	//----------CASO USO 5--------------------
	public Pedido traerPedido(int idPedido) {
		Pedido p = null;
		int i =0;
		while(i < pedidos.size() && p == null) {
			if(pedidos.get(i).getIdPedido() == idPedido)p = pedidos.get(i);
			i++;
		}
		return p;
	}
	//-----------CASO USO 6
	public boolean agregarPedidoRestaurante(LocalDate fecha, LocalTime hora, String tienda,Cliente cliente, int tiempoPreparacion){
		return pedidos.add(new PedidoRestaurante(pedidos.isEmpty() ? 1 : pedidos.get(pedidos.size()-1).getIdPedido()+1
				, fecha, hora, tienda, cliente,  tiempoPreparacion));
	}
	
	//--------CASO USO 7------------------------
	public boolean agregarPedidoSupermercado(LocalDate fecha, LocalTime hora, String tienda,Cliente cliente,int cantProductos, boolean hayProductosFrescos) {
		return pedidos.add(new PedidoSupermercado(pedidos.isEmpty() ? 1 : pedidos.get(pedidos.size()-1).getIdPedido()+1
				, fecha, hora, tienda, cliente,cantProductos, hayProductosFrescos));
	}
	//-------CASO USO 11-----------------
	public List<Pedido> traerPedidosNoEntregados(LocalDate fecha){
		List<Pedido> aux = new ArrayList<Pedido>();
		for (Pedido pedido : pedidos) {
			if(pedido.getFecha().equals(fecha) && !pedido.isEntregado())aux.add(pedido);
		}
		return aux;
	}
	
	//---CASO USO 12-----------------
	public List<Pedido> traerEntregasAtrasadas(){
		List<Pedido> aux = new ArrayList<Pedido>();
		
		for (Pedido pedido : traerPedidosNoEntregados(LocalDate.of(2024, 11, 07))) {
			if(pedido.horaEstimadaEntrega().isBefore(LocalTime.of(20, 0)))
				aux.add(pedido);
		}
		return aux;
	}
}
