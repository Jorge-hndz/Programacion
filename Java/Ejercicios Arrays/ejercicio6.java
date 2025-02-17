/*
	Ejercicio6.java
	• Realizar un programa que utilice un estructura array de enteros de 10 posiciones
	• Leer 10 enteros por teclado e introducirlos en el array uno a uno
	• Recorrer el array y mostrar los enteros pares y sus posiciones por un lado y los enteros impares
      y sus posiciones por otro lado
	2/12/2024
	Jorge Hernandez Aparicio
*/
import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] miarray = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Introduce un numero: ");
			miarray[i] = teclado.nextInt();
		}

		System.out.println("Elementos pares");
		System.out.println("----------------------------------------");
		for(int i=0; i < 10;i++){
			if(miarray[i] %2 == 0){
				System.out.printf("\nEl numero %d en la posicion %d es par.",miarray[i],i);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Elementos impares");
		System.out.println("----------------------------------------");
		for(int i=0; i < 10;i++){
			if(miarray[i] %2 != 0){
				System.out.printf("\nEl numero %d en la posicion %d es impar.",miarray[i],i);
			}
		}
		
		teclado.close();
	}
}