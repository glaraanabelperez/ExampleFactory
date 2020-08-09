package Fox;

public class FactoryF {
	public FactoryF() {}
	Producto producto = null;

	public Producto createProducto(String tipo) {
		///TODO como parametro le van a pasar todo todo todo del producto....
		switch(tipo) {
		  case "Camara":
			  FactoryCamara bc=new FactoryCamara();
			  producto=bc.createProduct(tipo);
		    break;
		  case "Notebooks":
		    // code block
		    break;
		  default:
		    // code block
		}
		return producto;
	}	
		
}
