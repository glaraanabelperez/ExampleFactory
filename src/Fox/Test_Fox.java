package Fox;

public class Test_Fox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DirectorF director=new DirectorF();
		
		Producto p=director.getFp().createProducto("Camara");
		FactoryF producto1=new FactoryF();
		producto1.createProducto("Camara");
		
		System.out.println(producto1);
	}

}
