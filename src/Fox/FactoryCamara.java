package Fox;
public class FactoryCamara extends FactoryProduct {
	
	public FactoryCamara() {}
	
	public Producto createProduct(String tipo) {
		Producto producto=new Camara(tipo);
		return producto;
	}
	
	
	
}
