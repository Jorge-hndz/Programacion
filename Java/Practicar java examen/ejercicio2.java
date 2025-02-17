import java.util.Scanner;
public class ejercicio2{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total = 1;

		for (int i = 0; i <= 10 ; i ++ ) {
			total = total * 2;
			System.out.println(total);
		}

	}
}