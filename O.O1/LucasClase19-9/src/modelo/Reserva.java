package modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Reserva {

	private int idReserva;
	private Cliente cliente;
	private LocalDate fechaReserva;
	private Mesa mesa;
	private int comensales;
	private List<ProductoPedido> lstProductosPedidos;
	
	public Reserva(int idReserva, Cliente cliente, LocalDate fechaReserva, Mesa mesa, int comensales) throws Exception {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.fechaReserva = fechaReserva;
		this.mesa = mesa;
		setComensales(comensales);
		this.lstProductosPedidos = new ArrayList<ProductoPedido>();
	}

	private boolean validarComensales(int cantComensales)  {
		
		return mesa.getCapacidad()<comensales;
	}
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public int getComensales() {
		return comensales;
	}
	public void setComensales(int comensales) throws Exception {
		if(!validarComensales(comensales)) throw new Exception("Los comensales supera");
		this.comensales = comensales;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", cliente=" + cliente + ", fechaReserva=" + fechaReserva + ", mesa="
				+ mesa + ", comensales=" + comensales + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, comensales, fechaReserva, idReserva, mesa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(cliente, other.cliente) && comensales == other.comensales
				&& Objects.equals(fechaReserva, other.fechaReserva) && idReserva == other.idReserva
				&& Objects.equals(mesa, other.mesa);
	}

	public List<ProductoPedido> getLstProductosPedidos() {
		return lstProductosPedidos;
	}

	public void setLstProductosPedidos(List<ProductoPedido> lstProductosPedidos) {
		this.lstProductosPedidos = lstProductosPedidos;
	}
	
	
	
	
	
}
