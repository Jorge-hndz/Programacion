public class automovil {
	
	private String marca;
	private String modelo;
	private String color = "blanco";
	private int cilindrada;
	
	public automovil() {
		super();
	}
	

	public automovil(String marca, String modelo, String color, int cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void establecerMarca(String mar) {
		this.marca=mar;
	}
	
	public void establecerModelo(String mod) {
		this.modelo=mod;
	}
	
	public void establecerColor(String col) {
		this.color=col;
	}
	
	public void establecerCilindrada(int cil) {
		this.cilindrada=cil;
	}
	
	public String detalle() {
		
		
		String texto= "";
		
		texto = "Auto - Marca: " + this.marca + "\nAuto - Modelo:" + this.modelo + "\nAuto - color: " + this.color + "\nAuto - cilindrada: "+ this.cilindrada;
		return texto;
	}
	
	public String acelerar(int velocidad) {
		
		return "El coche " + this.marca + " está acelerando a " + velocidad;
		
	}
	
	public String frenar(int tiempo) {
		
		return "El coche " + this.marca + " a tardado " + tiempo + " segundos en frenar";
		
	}
}





