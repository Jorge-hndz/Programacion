import java.util.Scanner;
public class taller2 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int total_suma = 0;
	int total_mult = 1;

	for(int i = 1; i <= 10; i++){
		total_suma = total_suma + i;
	}
	for(int i = 1; i <= 10; i++){
		total_mult = total_mult * i;
	}
	System.out.printf("\nEl total de la suma es %d", total_suma);
	System.out.printf("\nEl total de la multiplicacion es %d", total_mult);

	teclado.close();
	}
}