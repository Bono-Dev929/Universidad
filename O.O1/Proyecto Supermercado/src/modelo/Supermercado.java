package modelo;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	//atributos
	private List<Producto> gondola;

	//constructor
	public Supermercado() {
		this.gondola = new ArrayList<Producto>();
	}
	
	public boolean agregarProducto(String prod, float precio) throws Exception {
		
		int id = 1;
		
		for (Producto producto : gondola) 
			if(producto.getProducto().equals(prod))
				throw new Exception("El producto "+prod+" ya existe en la gondola");
			
		
		
		if(gondola.size() !=0) 
			id = gondola.get(gondola.size()-1).getIdProducto()+1;	
		
		Producto p = new Producto(id, prod, precio);
		gondola.add(p);
		
		return true;
	}
	
	public Producto traerProducto(int idProducto) {
		Producto p = null;
		int i=0;
		
		while(i<gondola.size()) {
			if (gondola.get(i).getIdProducto() == idProducto) {
				p = gondola.get(i);
				i = gondola.size();
			}
			i+=1;
		}
		
		return p;
	}
	
	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception{
		
		if (traerProducto(idProducto) == null) {
			throw new Exception("El producto que quiere modificar no existe");
		}
		
		traerProducto(idProducto).setProducto(producto);
		traerProducto(idProducto).setPrecio(precio);
		
		return true;
	}
	
	public boolean eliminarProducto(int id) {
		
		if (traerProducto(id) == null) {
			throw new Exception("El producto que quiere modificar no existe");
		}
		
		gondola.remove(id);
		
		return true;
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}
	
	@Override
	public String toString() {
		String tostring="Productos en gondola:\n";
		
		for (int i = 0; i < gondola.size(); i++) {
			tostring += gondola.get(i)+"\n";
		}
		return tostring;
	}
	

	public boolean equals(Supermercado g) {
		
		int cont = 0 ;
		
		for (int i = 0; i < gondola.size(); i++) {
			if (gondola.get(i).equals(g.getGondola().get(i))) {
				cont +=1;
			}
		}
		
		return cont == gondola.size();
	}
	
	
	
}
