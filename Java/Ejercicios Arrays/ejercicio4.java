/*
	Ejercicio4.java
	• Realizar un programa que utilice un estructura array de enteros de 10 posiciones
	• Leer 10 enteros por teclado e introducirlos en el array uno a uno
	• Recorrer el array y mostrar el entero más pequeño y el entero más grande
	2/12/2024
	Jorge Hernandez Aparicio
*/
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] miarray = new int[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Introduce un numero: ");
			miarray[i] = teclado.nextInt();
		}

		int menor = miarray[0];
		int mayor = miarray[0];

		for(int i=1; i<10;i++){
			if(miarray[i] > mayor){
				mayor = miarray[i];
			}
			if(miarray[i] < menor){
				menor = miarray[i];
			}
		}
		System.out.printf("\nEl numero mayor es: %d",mayor);
		System.out.printf("\nEl numero menor es: %d",menor);

		teclado.close();
	}
}