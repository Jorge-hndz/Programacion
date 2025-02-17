import java.util.Scanner;

public class triangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.print("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce el tercer valor: ");
		num3 = teclado.nextInt();

		if ((num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1)) {
			System.out.print("Estos datos podrian corresponder a un triangulo");
		} else {
				System.out.print("Estos datos no podrian corresponder a un triangulo");
		}

		teclado.close();
	}
}