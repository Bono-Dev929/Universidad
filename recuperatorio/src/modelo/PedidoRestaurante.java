package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class PedidoRestaurante extends Pedido{
	private int tienpoPreparacion;

	public PedidoRestaurante(int idPedido, LocalDate fecha,LocalTime hora, String tienda, Cliente cliente, int tienpoPreparacion) {
		super(idPedido, fecha, hora, tienda, cliente);
		this.tienpoPreparacion = tienpoPreparacion;
	}

	public int getTienpoPreparacion() {
		return tienpoPreparacion;
	}

	public void setTienpoPreparacion(int tienpoPreparacion) {
		this.tienpoPreparacion = tienpoPreparacion;
	}

	@Override
	public String toString() {
		return "PedidoRestaurante ["+super.toString()+", tienpoPreparacion=" + tienpoPreparacion + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tienpoPreparacion);
		return result;
	}

	
	public boolean equals(PedidoRestaurante pr) {
		return idPedido ==pr.getIdPedido();
	}
	//----CASO USO 8-----------
	public LocalTime horaEstimadaEntrega() {
		int tiempoPrep=tienpoPreparacion+15;
		if(cliente.isEsPlus())tiempoPrep  -= 5; 
		return hora.plusMinutes(tiempoPrep);//.plusMinutes(15);
	};
	
}
