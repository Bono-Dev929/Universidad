package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Sistema {

	private List<Usuario> lstUsuarios;
	private List<Tarjeta> lstTarjetas;
	public Sistema() {
		super();
		this.lstUsuarios = new ArrayList<Usuario>();
		this.lstTarjetas = new ArrayList<Tarjeta>();
	}
	public List<Usuario> getLstUsuarios() {
		return lstUsuarios;
	}
	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}
	public List<Tarjeta> getLstTarjetas() {
		return lstTarjetas;
	}
	public void setLstTarjetas(List<Tarjeta> lstTarjetas) {
		this.lstTarjetas = lstTarjetas;
	}
	@Override
	public String toString() {
		return "Sistema [lstUsuarios=" + lstUsuarios + ", lstTarjetas=" + lstTarjetas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(lstTarjetas, lstUsuarios);
	}
	
	public boolean equals(Sistema s) {
		return lstTarjetas.equals(s.getLstTarjetas()) && lstUsuarios.equals(s.getLstUsuarios());
	}
	
	//--------------- CASO DE USO 1------------------------------
	public Usuario traerUsuario(long dni) {
		
		Usuario u = null;
		int i =0;
		
		while (i<lstUsuarios.size() && u == null) {
			if (lstUsuarios.get(i).getDni() == dni) u = lstUsuarios.get(i);
			i++;
		}
		
		return u;
	}
	
	//--------------- CASO DE USO 2 ------------------------------
	public boolean agregarUsuario(long dni, String apellido, String nombre) throws Exception {
		
		if (traerUsuario(dni) != null) throw new Exception("El usuario ya existe");
		
		int id = lstUsuarios.isEmpty() ? 1 : lstUsuarios.get(lstUsuarios.size()-1).getIdUsuario()+1;
		
		return lstUsuarios.add(new Usuario(id, dni, apellido, nombre));
	}
	
	//--------------- CASO DE USO 3------------------------------
	public boolean agregarTarjeta(String codigo, Usuario usuario) throws Exception {

		return lstTarjetas.add(new Tarjeta(codigo, usuario, 0));
	}
	
	//--------------- CASO DE USO 4------------------------------
	public Tarjeta traerTarjeta(String codigo) {
		
		Tarjeta t = null;
		int i = 0 ;
		
		while (i<lstTarjetas.size() && t== null) {
			if(lstTarjetas.get(i).getCodigo().equals(codigo)) t = lstTarjetas.get(i);
			i++;
		}
		
		return t;
	}
	
	//--------------- CASO DE USO 9 ------------------------------
	public List<Usuario> traerUsuarioSinSaldo(){
		List<Usuario> lstAux = new ArrayList<Usuario>();
		
		for (Tarjeta t : lstTarjetas) 
			if (t.getSaldoActual() <=0) lstAux.add(t.getUsuario());
		
		
		return lstAux;
	}
	
	
}
