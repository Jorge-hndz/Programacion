import java.util.Scanner;
public class taller1 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num1;
	int num2;

	System.out.println("Introduce un primer numero: ");
	num1 = teclado.nextInt();
	System.out.println("Introduce un segundo numero: ");
	num2 = teclado.nextInt();

	if(num1 == num2) {
		System.out.println("Ambos numeros son iguales");
	}
	if(num1 > num2) {
		System.out.printf("\nEl mayor es %d", num1);
	}
	if(num2 > num1) {
		System.out.printf("\nEl mayor es %d", num2);
	}

	teclado.close();
}
}
