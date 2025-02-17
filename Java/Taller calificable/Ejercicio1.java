/*
	Ejercicio1
	Escribe una clase java que lee dos números y nos dice cuál de ellos es mayor o si son iguales.
	28/11/2024
	Jorge Hernandez Aparicio de 1ºDam
*/
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un primer numero: ");
		int num1 = teclado.nextInt();

		System.out.print("Introduce un segundo numero: ");
		int num2 = teclado.nextInt();

		if(num1 == num2) {
			System.out.print("Los 2 numeros son iguales");
		}

		if(num1 > num2) {
			System.out.print("El mayor es: " + num1);
		} 
		if (num2 > num1) {
			System.out.print("El mayor es: " + num2);

		teclado.close();
		}
	}
}