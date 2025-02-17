public class main {

	public static void main(String[] args) {
		
		automovil auto = new automovil();
		
		automovil auto3 = new automovil("KIA", "Stonic", "naranja", 1800);
		
		System.out.println(auto3.detalle());
		System.out.println(auto.acelerar(120));
		System.out.println(auto.frenar(10));
	
	}

}