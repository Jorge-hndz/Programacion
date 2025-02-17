/*
	Ejercicio2
	Escribe una clase java que calcula y escriba la suma y el producto de los 10 primeros números naturales. 
	28/11/2024
	Jorge Hernandez Aparicio de 1ºDam
*/
public class Ejercicio2 {
	public static void main(String[] args) {
		int total_suma = 0;
		int total_mult = 1;

		for(int i = 1; i <= 10; i++) {
			total_suma = total_suma + i;
		}
                
		for(int x = 1; x <= 10; x++) {
			total_mult = total_mult * x;
		}

		System.out.println(total_suma);
		System.out.println(total_mult);
	}
}