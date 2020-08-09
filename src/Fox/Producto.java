package Fox;

public class Producto {
	private static int idSiguiente=1; 
	private int id;
	private String categoria="";
	private String marca="";
	private int precioFinal=0;
	private int precioBase=0;
	private int stockAdmin=0;
	private String stockClient="";
	protected Producto productoP;
	//los dos cambian pero la static es accedia sin instanciar el objeto.Final no podria cambiar.
	
	Producto(){
		id=idSiguiente;
		idSiguiente++;
	}
	
	public Producto get_producto_producto() {
		return productoP;
	}
	public int getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getStockAdmin() {
		return stockAdmin;
	}

	public void setStockAdmin(int stockAdmin) {
		this.stockAdmin = stockAdmin;
	}

	public String getStockClient() {
		return stockClient;
	}

	public void setStockClient(String stockClient) {
		this.stockClient = stockClient;
	}
////////////////////////////////FICHA TECNICA
	
	
	
}