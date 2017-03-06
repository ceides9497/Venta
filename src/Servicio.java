
public class Servicio extends Producto {	
	private double cantidadHoras;
	
	public Servicio(double precio,double cantidad) {
		super(precio);
		cantidadHoras = cantidad;
	}

	@Override
	public double total() {
		double ganancia;
		ganancia = precio * cantidadHoras * 0.2;
		return ganancia;	
	}

}
