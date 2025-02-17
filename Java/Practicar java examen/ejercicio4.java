import java.util.Scanner;
public class ejercicio4{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;

		System.out.println("Introduce un primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce un tercero numero: ");
		num3 = teclado.nextInt();

		if(num1 == num2 && num2 == num3){
			System.out.println("Podria ser un triangulo");
		} else {
			System.out.println("No podria ser un triangulo");
		}


	}
}