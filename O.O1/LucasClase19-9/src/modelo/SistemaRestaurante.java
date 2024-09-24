package modelo;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaRestaurante {

	private List<Cliente> lstClientes;
	private List<Mesa> lstMesas;
	private List<Reserva> lstReservas;
	
	public SistemaRestaurante() {
		super();
		this.lstClientes = new ArrayList<Cliente>();
		this.lstMesas = new ArrayList<Mesa>();
		this.lstReservas = new ArrayList<Reserva>();
	}
	
	//metodos
	public Cliente traerCliente(long dni) {
		
		int i = 0;
		Cliente c = null;
		
		
		while (i<lstClientes.size() && c == null) {
			if(lstClientes.get(i).getDni() == dni) c = lstClientes.get(i);
			i++;
		}
		
		return c;
	}
	
	public boolean agregarCliente(String nombre, String apellido, long dni, String telefono) throws Exception {
		
		int id = 1;
		
		if (traerCliente(dni) != null) throw new Exception("El cliente ya existe");
		
		if(!lstClientes.isEmpty()) id = lstClientes.get(lstClientes.size()-1).getIdCliente()+1;
		
		return lstClientes.add(new Cliente(id, nombre, apellido, dni, telefono));
	}
	
	public Mesa traerMesa(int nroMesa) {
		
		Mesa m = null;
		int i = 0;
		
		while(i<lstMesas.size() && m == null) {
			if(lstMesas.get(i).getNrMesa() == nroMesa) m = lstMesas.get(i);
			i++;
		}
		
		return m;
	}
	
	public boolean agregarMesa(int nro , int capacidad ) throws Exception{
	
		int id = 1;
		
		if (traerMesa(nro) != null) throw new Exception("La mesa ya existe");
		
		if (!lstMesas.isEmpty()) id = lstMesas.get(lstMesas.size()-1).getIdMesa()+1;
		
		return lstMesas.add(new Mesa(id, nro, capacidad));
	}
	
	public Reserva traerReserva(int nroMesa, LocalDate fechaRes) {
		
		Reserva r = null;
		int i =0;
		
		while(i< lstReservas.size() && r == null) {
			if (lstReservas.get(i).getMesa().getNrMesa() == nroMesa && lstReservas.get(i).getFechaReserva().equals(fechaRes)) r = lstReservas.get(i);
			i++;
		}
		
		return r;
	}
	
	public boolean agregarReserva(Cliente c, LocalDate fecha, Mesa mesa, int cantComensales) throws Exception {
		
		int id = 1;
		
		if(traerReserva(mesa.getNrMesa(),fecha) != null)throw new Exception("la mesa ya existe");
		
		if(!lstReservas.isEmpty())id = lstReservas.get(lstReservas.size()-1).getIdReserva()+1;
		
		return lstReservas.add(new Reserva(id, c, fecha, mesa, cantComensales));
	}
	
	//traer reservas entre fechas

	
        //traer mesas disponible para una fecha
	public List<Mesa> traerMesasParaFecha(LocalDate fecha){
		List<Mesa> lstaux= new ArrayList<Mesa>();
		for(Mesa m : lstMesas)
			if(traerReserva(m.getNrMesa(),fecha == null)
                             lstaux.add(m);
        return lstaux;
	}
	
	//accesores
	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	public List<Mesa> getLstMesas() {
		return lstMesas;
	}

	public void setLstMesas(List<Mesa> lstMesas) {
		this.lstMesas = lstMesas;
	}

	public List<Reserva> getLstReservas() {
		return lstReservas;
	}

	public void setLstReservas(List<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}

	@Override
	public String toString() {
		return "SistemaRestaurante [lstClientes=" + lstClientes + ", lstMesas=" + lstMesas + ", lstReservas="
				+ lstReservas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lstClientes, lstMesas, lstReservas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistemaRestaurante other = (SistemaRestaurante) obj;
		return Objects.equals(lstClientes, other.lstClientes) && Objects.equals(lstMesas, other.lstMesas)
				&& Objects.equals(lstReservas, other.lstReservas);
	}
	
	
	
	
	
}
