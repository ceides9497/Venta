
public class Articulo extends Producto {
	private int cantidad;
	
	public Articulo(double precio,int cantidad) {
		super(precio);
		this.cantidad = cantidad;
	}
	
	@Override
	public double total() {
		double ganancia;
		ganancia = precio * cantidad;
		return ganancia;		
	}


}
