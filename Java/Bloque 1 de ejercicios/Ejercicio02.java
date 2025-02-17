	// Multiplo1.java
	// Fecha: 16/12/2024
	// Autor/a:Jorge Hernandez Aparicio

	import java.util.Scanner;
	public class Ejercicio02 {
		public static void main(String argumentos[]) {
			Scanner teclado = new Scanner(System.in);

			final int TOPE = 16  ; 
			mostrarMultiplos2(TOPE);

			teclado.close();
		}
		public static void mostrarMultiplos2(int tope){
			// Declaración de variables
			int mult  ;							// Almacena el múltiplo calculado
			int cont  ;							// Contador utilizado en el cálculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t Múltiplos de 2\n");
			while (mult < tope)					// Bucle de cálculo y visualización
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
		}

	}