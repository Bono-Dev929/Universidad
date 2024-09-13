package test;

import java.time.LocalDate;
import java.time.LocalTime;
import modelo.*;

public class Test1 {

	public static void main(String[] args) throws Exception {
/*
		Cliente cl = new Cliente(1, "nombre", 1, "direccion");
		
		Producto p1 = new Producto(0, "Detergente", 4500f);
		Producto p2 = new Producto(1, "Alfajor", 600f);
		Producto p3 = new Producto(2, "Lavandina", 2000f);///2 Lavandina 2000f
		Producto p4 = new Producto(3, "OFF", 850f);
		Producto p5 = new Producto(4, "VillaVicencio", 1000f);
		Producto p6 = new Producto(5, "Harina 0000", 1250f);
		Producto p7 = new Producto(6, "Caramelo Masticable", 90f);
		
		try {
			ItemCarrito i1 = new ItemCarrito(0, p1, 0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			ItemCarrito i4 = new ItemCarrito(0, p4, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ItemCarrito i2 = new ItemCarrito(0, p2, 1);
		ItemCarrito i3 = new ItemCarrito(0, p3, 2);
		
		ItemCarrito i5 = new ItemCarrito(0, p5, 4);
		ItemCarrito i6 = new ItemCarrito(0, p6, 3);
		ItemCarrito i7 = new ItemCarrito(0, p7, 10);
		
		Supermercado gondola = new Supermercado();
		Supermercado gondola2 = new Supermercado();
		
		try {
			
			System.out.println(gondola.agregarProducto("Detergente", 4500f));
			System.out.println(gondola.agregarProducto("Alfajor", 600f));
			System.out.println(gondola.agregarProducto("Lavandina", 2000f));
			System.out.println(gondola.agregarProducto("Lavandina", 2000f));			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			
			System.out.println(gondola2.agregarProducto("Detergente", 4500f));
			System.out.println(gondola2.agregarProducto("Alfajor", 600f));
			System.out.println(gondola2.agregarProducto("Lavandina", 2000f));		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(gondola.equals(gondola2));
		
		System.out.println(gondola.traerProducto(1));
		
		try {
			
			System.out.println(gondola.modificarProducto(3, "Coca-Cola", 2315f));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(gondola.toString());
		
		Carrito c  = new Carrito(0, LocalDate.now(), LocalTime.now(), cl);
		
		try {
			c.agregarItem(p1, 0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			c.agregarItem(p2, 1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		try {
			c.agregarItem(p3, 2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		try {
			c.agregarItem(p4, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		try {
			c.agregarItem(p5, 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
			
		try {
			c.agregarItem(p6, 3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		try {
			c.agregarItem(p7, 10);//
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(c.toString());
		
		//System.out.println("Total: "+i1.getProducto().getProducto()+" x "+i1.getCantidad()+": "+i1.calcularSubTotal());
		System.out.println("Total: "+i2.getProducto().getProducto()+" x "+i2.getCantidad()+": "+i2.calcularSubTotal());
		System.out.println("Total: "+i3.getProducto().getProducto()+" x "+i3.getCantidad()+": "+i3.calcularSubTotal());
		//System.out.println("Total: "+i4.getProducto().getProducto()+" x "+i4.getCantidad()+": "+i4.calcularSubTotal());
		System.out.println("Total: "+i5.getProducto().getProducto()+" x "+i5.getCantidad()+": "+i5.calcularSubTotal());
		System.out.println("Total: "+i6.getProducto().getProducto()+" x "+i6.getCantidad()+": "+i6.calcularSubTotal());
		System.out.println("Total: "+i7.getProducto().getProducto()+" x "+i7.getCantidad()+": "+i7.calcularSubTotal());
		
		System.out.println("Suma total:"+c.calcularTotal());*/
	}

}
