package Fox;

public class Camara extends Producto {
	private String tipo;
	private Integer resolucion;
	private Integer pixels;
	
	public Camara(String tipo) {
		this.tipo=tipo;
	}
	public Integer getPixels() {
		return pixels;
	}
	public void setPixels(Integer pixels) {
		this.pixels = pixels;
	}
	public Integer getResolucion() {
		return resolucion;
	}
	public void setResolucion(Integer resolucion) {
		this.resolucion = resolucion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
