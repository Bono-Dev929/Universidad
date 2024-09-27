package modelo;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Tarjeta {

	private String codigo;
	private Usuario usuario;
	private List<Viaje> lstViajes;
	private List<Carga> lstCargas;
	private double saldoActual;
	public Tarjeta(String codigo, Usuario usuario, double saldoActual) throws Exception {
		super();
		setCodigo(codigo);
		this.usuario = usuario;
		this.lstViajes = new ArrayList<Viaje>();
		this.lstCargas = new ArrayList<Carga>();
		this.saldoActual = saldoActual;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws Exception {
		if(codigo.length() < 6) throw new Exception("El codigo es invalido");
		this.codigo = codigo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Viaje> getLstViajes() {
		return lstViajes;
	}
	public void setLstViajes(List<Viaje> lstViajes) {
		this.lstViajes = lstViajes;
	}
	public List<Carga> getLstCargas() {
		return lstCargas;
	}
	public void setLstCargas(List<Carga> lstCargas) {
		this.lstCargas = lstCargas;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	@Override
	public String toString() {
		return "Tarjeta [codigo=" + codigo + ", " + usuario + ", lstViajes=" + lstViajes + ", lstCargas="
				+ lstCargas + ", saldoActual=" + saldoActual + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, lstCargas, lstViajes, saldoActual, usuario);
	}

	public boolean equals(Tarjeta t) {
		
		return codigo.equals(t.getCodigo()) && usuario.equals(t.getUsuario()) && lstCargas.equals(t.getLstCargas()) && lstViajes.equals(t.getLstViajes()) && saldoActual == t.getSaldoActual();
	}
	
	//--------------- CASO DE USO 5 ------------------------------
	public boolean agregarCarga(LocalDate fecha, double valor) {
		this.saldoActual += valor;
		
		return getLstCargas().add(new Carga(fecha, valor)) ;
	}
	
	//--------------- CASO DE USO 6 ------------------------------
	public List<Viaje> traerViajes(LocalDate fecha){
		List<Viaje> lstAuxList = new ArrayList<Viaje>();
		for (Viaje viaje : lstViajes) {
			if (viaje.getFecha().equals(fecha)) lstAuxList.add(viaje);
		}
		return lstAuxList;
	}
	
	//--------------- CASO DE USO 7------------------------------
	public void agregarViaje(String medioYlinea, double precio, LocalDate fecha) throws Exception {
		double descuento=0;
		
		if (traerViajes(fecha).size() == 2) { 
			descuento = precio *0.5;
		}
		if (traerViajes(fecha).size() == 1) {
			descuento = precio *0.25;
		}
		
		if (saldoActual<precio) throw new Exception("Saldo Insuficiente");
		
		saldoActual = saldoActual- precio;
		
		lstViajes.add(new Viaje(medioYlinea, precio, descuento, fecha));
	}
	
	//--------------- CASO DE USO 8 ------------------------------
	public double calcularGastoTarjetaEnDia(LocalDate fecha) {
		double totalGastado = 0;
		
		for (Viaje v : lstViajes) 
			if (v.getFecha().isEqual(fecha))totalGastado += v.getPrecio(); 
		
		return totalGastado;
	}
	
}
