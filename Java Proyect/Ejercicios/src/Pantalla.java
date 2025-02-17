
public class Pantalla {
	private Double tamaño;
	private String fabricante;
	
	public Pantalla(Double tamaño, String fabricante) {
		super();
		this.tamaño = tamaño;
		this.fabricante = fabricante;
	}
	public Double getTamaño() {
		return tamaño;
	}
	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
