package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Sistema {

	private List<Evento> lstEventos;
	private List<Ubicacion> lstUbicaciones;
	private List<Venta> lstVentas;
	public Sistema() {
		super();
		this.lstEventos = new ArrayList<Evento>();
		this.lstUbicaciones = new ArrayList<Ubicacion>();
		this.lstVentas = new ArrayList<Venta>();
	}
	public List<Evento> getLstEventos() {
		return lstEventos;
	}
	public void setLstEventos(List<Evento> lstEventos) {
		this.lstEventos = lstEventos;
	}
	public List<Ubicacion> getLstUbicaciones() {
		return lstUbicaciones;
	}
	public void setLstUbicaciones(List<Ubicacion> lstUbicaciones) {
		this.lstUbicaciones = lstUbicaciones;
	}
	public List<Venta> getLstVentas() {
		return lstVentas;
	}
	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}
	@Override
	public String toString() {
		return "Sistema [lstEventos=" + lstEventos + ", \nlstUbicaciones=" + lstUbicaciones + ", \nlstVentas=" + lstVentas
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(lstEventos, lstUbicaciones, lstVentas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sistema other = (Sistema) obj;
		return Objects.equals(lstEventos, other.lstEventos) && Objects.equals(lstUbicaciones, other.lstUbicaciones)
				&& Objects.equals(lstVentas, other.lstVentas);
	}
	//-----------CASO USO 1---------------------
	public boolean agregarUbicacion(String nombre, String direccion, int capacidadmaxima) {
		return lstUbicaciones.add(new Ubicacion(nombre, direccion, capacidadmaxima));
	}
	
	//-------------CASO USO 2----------------
	public Ubicacion traerUbicacion(String nombre) {
		int i = 0;
		Ubicacion u = null;
		while (i<lstUbicaciones.size() && u ==null) {
			if (lstUbicaciones.get(i).getNombre().equals(nombre)) u = lstUbicaciones.get(i);
			i++;
		}
		return u;
	}
	
	//------------CASO USO 3----------------
	public Evento traerEvento(int codigo) {
		int i =0;
		Evento e = null;
		while (i<lstEventos.size() && e==null) {
			if(lstEventos.get(i).getCodigo() == codigo) e = lstEventos.get(i);
			i++;
		}
		return e;
	}
	
	//------------CASO USO 4 ----------------
	public boolean agregarConcierto(int codigo, String nombre, LocalDate fecha, LocalTime hora, Ubicacion ubicacion, float precioEntrada, int diasAntesVentaOnline, int duracionAproximada) throws Exception {
		if (traerEvento(codigo) != null) throw new Exception("El evento ya existe");
		return lstEventos.add(new Concierto(lstEventos.isEmpty() ? 1 : lstEventos.get(lstEventos.size()-1).getIdEvento()+1
				, codigo, nombre, fecha, hora, ubicacion, precioEntrada, diasAntesVentaOnline, duracionAproximada));
	}
	//------------CASO USO 5 ----------------
	public boolean agregarObraTeatro(int codigo, String nombre, LocalDate fecha, LocalTime hora, Ubicacion ubicacion, float precioEntrada, String director, String resumen) throws Exception {
		if (traerEvento(codigo) != null) throw new Exception("El evento ya existe");
		return lstEventos.add(new ObrasTeatro(lstEventos.isEmpty() ? 1 : lstEventos.get(lstEventos.size()-1).getIdEvento()+1
				, codigo, nombre, fecha, hora, ubicacion, precioEntrada, director, resumen));
	}
	
	//--------CASO USO 7 ------------
	public boolean agregarVenta(LocalDate fecha, Evento e, int cantidad, boolean online) throws Exception {
		if(!e.permiteVentaOnline(fecha) && online == true)throw new Exception("El evento no permite venta online en la fecha deseada");
		return lstVentas.add(new Venta(fecha, e, cantidad, online));
	}
	
	//-------CASO USO 8-----------------
	public List<Evento> traerEventos(LocalDate fDesde, LocalDate fHasta){
		List<Evento> lstAux = new ArrayList<Evento>();
		for (Evento evento : lstEventos) {
			if (evento.getFecha().isAfter(fDesde) || evento.getFecha().isEqual(fDesde) && evento.getFecha().isBefore(fHasta) || evento.getFecha().isEqual(fHasta))
				lstAux.add(evento);
		}
		return lstAux;
	}
	//--------CASO USO 9----------
	public List<Evento> traerConciertos(LocalDate fecha, int minutosMinimos){
		List<Evento> lstAux = new ArrayList<Evento>();
		for (Evento evento : traerEventos(fecha, fecha)) {
			if (evento instanceof Concierto) {
				Concierto concierto = (Concierto)evento;
				if (concierto.getDuracionAproximada()>minutosMinimos) {
					lstAux.add(concierto);
				}
			}	
		}
		return lstAux;
	}
	
	//-------CASO USO 10-------------------
	public float traerRecaudacionEvento(Evento e) {
		float recaudacion = 0;
		for (Venta v : lstVentas) {
			if(v.getEvento().equals(e)) {
				recaudacion += e.getPrecioEntrada()*v.getCantidad();
			}
		}
		return recaudacion;
	}

	//-------CASO USO 11----------
	public List<Evento> traerEventosCompraOnline(){
		List<Evento> lstAux = new ArrayList<Evento>();
		for (Evento evento : lstEventos) {
			if (evento.permiteVentaOnline(LocalDate.of(2024, 12, 5))) {
				lstAux.add(evento);
			}
		}
		return lstAux;
	}













}









