/*
	Ejercicio3
	Escribe una clase java que pida que introduzcas un número entero entre 0 y 20, y muestre en pantalla una secuencia de números hasta el introducido (incluido), repitiendo cada número tantas veces como el valor que representa. 
	28/11/2024
	Jorge Hernandez Aparicio de 1ºDam
*/
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero del 1 al 20:");
		int num = teclado.nextInt();

		for(int i = 1; i <= num; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print(i);
			}
			System.out.println();
		} 

		teclado.close();
	}
}