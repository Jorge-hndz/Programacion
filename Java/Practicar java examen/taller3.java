import java.util.Scanner;
public class taller3{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 20: ");
		int num = teclado.nextInt();

		for (int i = 1; i <= num ; i++ ) {
			System.out.println();
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			
		}
	}
}