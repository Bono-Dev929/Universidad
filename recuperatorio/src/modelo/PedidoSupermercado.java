package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class PedidoSupermercado extends Pedido{
	private int cantidadProductos;
	private boolean hayProductosFrescos;
	
	public PedidoSupermercado(int idPedido, LocalDate fecha,LocalTime hora, String tienda, Cliente cliente, int cantidadProductos, boolean hayProductosFrescos) {
		super(idPedido, fecha, hora, tienda, cliente);
		this.cantidadProductos = cantidadProductos;
		this.hayProductosFrescos = hayProductosFrescos;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	public boolean isHayProductosFrescos() {
		return hayProductosFrescos;
	}
	public void setHayProductosFrescos(boolean hayProductosFrescos) {
		this.hayProductosFrescos = hayProductosFrescos;
	}
	@Override
	public String toString() {
		return "PedidoSupermercado ["+super.toString()+", cantidadProductos=" + cantidadProductos + ", hayProductosFrescos="
				+ hayProductosFrescos + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantidadProductos, hayProductosFrescos);
		return result;
	}
	
	public boolean equals(PedidoSupermercado ps) {
		return idPedido == ps.getIdPedido();	
	}
	//----CASO USO 8-----------
	public LocalTime horaEstimadaEntrega() {
		int tiempoPrep = 8*cantidadProductos;
		if(isHayProductosFrescos())tiempoPrep -= 5;
		if(cliente.isEsPlus())tiempoPrep  -= 5; 
		return hora.plusMinutes(tiempoPrep);
	};
}
