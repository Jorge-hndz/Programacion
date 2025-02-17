/*
	Ejercicio2.java
	• Realizar un programa que utilice un estructura array de enteros de 10 posiciones
	• Leer 10 enteros por teclado e introducirlos en el array uno a uno
	• Recorrer el array y mostrar cada entero con la posición con la que ocupa pero de forma inversa
	  en la que se introdujeron
	2/12/2024
	Jorge Hernandez Aparicio
*/
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] miarray = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Introduce un numero: ");
			miarray[i] = teclado.nextInt();
		}

		for(int i = 10; i > 0; i--){
			System.out.printf("\nEn la posicion del array %d esta el numero %d",i,miarray[i]);
		}

		teclado.close();
	}
}