	// Multiplo1.java
	// Fecha: 18/12/2024
	// Autor/a:Jorge Hernandez Aparicio

	import java.util.Scanner;
	public class Ejercicio05 {
		public static void main(String argumentos[]) {
			mostrarMultiplos2(pedirTope());

		}
		public static int pedirTope(){
			Scanner teclado = new Scanner(System.in);
			int valor = 0;
			System.out.print("Introduce un numero y te mostrare los multiplos de 2 hasta ese numero: ");
			valor = teclado.nextInt();

			teclado.close();
			return valor;
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