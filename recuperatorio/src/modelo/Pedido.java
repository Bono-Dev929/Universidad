package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public abstract class Pedido {
	protected int idPedido;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected String tienda;
	protected Cliente cliente;
	protected Repartidor repartidor;
	protected boolean entregado;
	public Pedido(int idPedido, LocalDate fecha,LocalTime hora, String tienda, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.hora = hora;
		this.tienda = tienda;
		this.cliente = cliente;
		this.repartidor = null;
		this.entregado = false;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
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
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Repartidor getRepartidor() {
		return repartidor;
	}
	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	@Override
	public String toString() {
		return "idPedido=" + idPedido + ", fecha=" + fecha + ", hora="+ hora +", tienda=" + tienda + ", cliente=" + cliente
				+ ", repartidor=" + repartidor + ", entregado=" + entregado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, entregado, fecha, idPedido, repartidor, tienda);
	}
	
	public boolean equals(Pedido p) {
		return idPedido == p.getIdPedido();
	}
	//----CASO USO 8-----------
	public abstract LocalTime horaEstimadaEntrega();
	
	//---------CASO USO 9-------------------
	public void asignarRepartidor(Repartidor r) throws Exception {
		if(r.isOcupado())throw new Exception("El repartidor esta ocupado");
		r.setOcupado(true);
		setRepartidor(r);
	}
	//--------CASO USO 10--------------
	public void marcarEntrega() {
		repartidor.setOcupado(false);
		setEntregado(true);
		
	}
}
