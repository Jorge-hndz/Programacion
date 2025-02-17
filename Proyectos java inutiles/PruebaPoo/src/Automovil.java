

public class Automovil{
	
	public String marca;
	public String modelo;
	public String color = "blanco";
	public int cilindrada;
	
	public void detalle() {
		
		System.out.println("Auto - Marca: " + this.marca);
		System.out.println("Auto - Modelo: " + this.modelo);
		System.out.println("Auto - Color: " + this.color);
		System.out.println("Auto - Cilindrada: " + this.cilindrada);
	}
}