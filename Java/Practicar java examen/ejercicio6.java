import java.util.Scanner;
public class ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int num1;
		int num2;
		int num3;
		int num4;

		System.out.println("Introduce a continuacion un entero de 4 digitos");
		num = teclado.nextInt();

		num1 = num / 1000;
		
		num2 = (num % 1000) / 100;
		
		num3 = (num % 100) / 10;
		
		num4 = num % 10;
		

		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		int total = ((num3 * 1000) + (num4 * 100) + (num1 * 10) + (num2));
		System.out.println("La contraseña cifrada es: " + total);
	}
}