import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class VentaTest {	
	private static final double _DELTA = 0.001;
	Producto articulo1 = new Articulo(3.5, 2);	
	Producto articulo2 = new Articulo(2.00, 7);	
	Producto articulo3 = new Articulo(4.8, 3);	
	Producto servicio1 = new Servicio(10.5, 3.5);
	Producto servicio2 = new Servicio(33.1, 6.00);
	Producto servicio3 = new Servicio(5.99, 6.45);
	public static ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
	@Test
	public void testRecibegananciaServicio(){
		double resp;
		resp = servicio1.total();
		assertEquals(7.35,resp,_DELTA);
	}
	
	@Test
	public void testRecibegananciaArticulo(){
		double resp;
		resp = articulo1.total();
		assertEquals(7.00,resp,_DELTA);
	}
	
	@Test
	public void ventaConListaDeProductos(){
		double ganancia = 0;
		productos.add(articulo1);
		productos.add(articulo2);
		productos.add(articulo3);
		productos.add(servicio1);
		productos.add(servicio2);
		productos.add(servicio3);
		
		for(Producto producto : productos){
			ganancia = ganancia + producto.total();
		}
		
		assertEquals(90.1971,ganancia,_DELTA);
		
	}

}
