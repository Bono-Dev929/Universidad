package test;

import java.time.LocalDate;

import modelo.Sistema;

public class TestTema1 {

	public static void main(String[] args) {
		
		Sistema s = new Sistema();
		
		System.out.println("Test 1--------------------------------");
		System.out.println("Agragar Categorias y mostrar");
		s.agregarCategoria("Bebidas");
		s.agregarCategoria("Almacen");
		s.agregarCategoria("Decoracion");
		System.out.println(s.getCategorias().toString());
		System.out.println();
		
		
		System.out.println("Test 2---------------------------------");
		System.out.println("Agregar Productos y mostrar");
		try {
			s.agregarProductoPerecedero(1001, "Leche",900.00f, s.traerCategoria("Bebidas"), LocalDate.of(2024, 10, 20), true);
			s.agregarProductoPerecedero(1002, "Gaseosa", 1000.0f, s.traerCategoria("Almacen"), LocalDate.of(2024, 11, 20),false);
			s.agregarProductoPerecedero(2001, "Fideos", 1000.0f, s.traerCategoria("Almacen"), LocalDate.of(2025, 1, 1), false);
			s.agregarProductoPerecedero(3001, "Pintura", 8000.0f, s.traerCategoria("Decoracion"), LocalDate.of(2024, 10, 18), false);
			s.agregarProductoNoPerecedero(3002, "Pincel", 250.f, s.traerCategoria("Decoracion"), 6, 10);
			s.agregarProductoNoPerecedero(3003, "Espatula", 600.f, s.traerCategoria("Decoracion"), 12, 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(s.getProductos());
		}
		System.out.println();
		
		System.out.println("Test 3-------------------------");
		System.out.println("Agregar movimientos y mostrar");
		try {
			s.agregarMovimientoInventario(s.traerProducto(1001), LocalDate.of(2024, 10, 10), 50);
			s.agregarMovimientoInventario(s.traerProducto(1002), LocalDate.of(2024, 10, 10), 30);
			s.agregarMovimientoInventario(s.traerProducto(2001), LocalDate.of(2024, 10, 10), 80);
			s.agregarMovimientoInventario(s.traerProducto(3001), LocalDate.of(2024, 10, 10), 40);
			s.agregarMovimientoInventario(s.traerProducto(3002), LocalDate.of(2024, 10, 10), 11);
			s.agregarMovimientoInventario(s.traerProducto(3003), LocalDate.of(2024, 10, 10), 40);
			System.out.println("compras");
			s.agregarMovimientoInventario(s.traerProducto(1001), LocalDate.of(2024, 10, 11), -10);
			s.agregarMovimientoInventario(s.traerProducto(1002), LocalDate.of(2024, 10, 11), -4);
			s.agregarMovimientoInventario(s.traerProducto(3002), LocalDate.of(2024, 10, 11), -3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(s.getMovimientos());
		}
		System.out.println();
		
		System.out.println("Test 4 -----------------------------------");
		System.out.println("Ventas de Productos refrigerados");
		System.out.println(s.traerVentasProductosRefrigerados(LocalDate.of(2024, 10, 11)));
		System.out.println("\n");
		
		System.out.println("Test 5 ----------------------");
		System.out.println("Productos a reabastecer de la categoria Decoracion");
		System.out.println(s.traerProductosAReabastecer(s.traerCategoria("Decoracion")));
		System.out.println();
		
		System.out.println("Test 6 ------------------");
		System.out.println("intentar agregar un producto que ya existe");
		try {
			s.agregarProductoPerecedero(1001, "Leche", 900.0f, s.traerCategoria("Bebidas"), LocalDate.of(2024, 10, 20), true);
		} catch (Exception e) {
			System.out.println(e.getMessage()+"No se puede agregar");
		}
		
		System.out.println("Test 7 -----------------------");
		System.out.println("Intentar ejecuitar una venta cuya cantidad supera al stock");
		try {
			s.agregarMovimientoInventario(s.traerProducto(3003), LocalDate.of(2024, 10, 11), -50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
