
public class TelefonoMovil {
	private String modelo;
	private String fabricante;
	private Double precio;
	private Estudiante propietario;
	private Bateria bateria;
	private Pantalla pantalla;
	
	public TelefonoMovil(String modelo, String fabricante, Double precio, Estudiante propietario, Bateria bateria,
			Pantalla pantalla) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
		this.propietario = propietario;
		this.bateria = bateria;
		this.pantalla = pantalla;
	}
	
	@Override
	public String toString() {
		return "TelefonoMovil [modelo=" + modelo + ", fabricante=" + fabricante + ", precio=" + precio
				+ ", propietario=" + propietario + ", bateria=" + bateria + ", pantalla=" + pantalla + "]";
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Estudiante getPropietario() {
		return propietario;
	}
	public void setPropietario(Estudiante propietario) {
		this.propietario = propietario;
	}
	public Bateria getBateria() {
		return bateria;
	}
	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	public Pantalla getPantalla() {
		return pantalla;
	}
	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
	
	
}

