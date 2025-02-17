import java.util.Scanner;

public class cifrado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero de 4 digitos: ");
		int num = teclado.nextInt();
		
		int dato1 = num / 1000;
		int dato2 = (num / 100) % 10;
		int dato3 = (num / 10) % 10;
		int dato4 = num % 10;
		
		dato1 = (dato1 + 7) % 10;
		dato2 = (dato2 + 7) % 10;
		dato3 = (dato3 + 7) % 10;
		dato4 = (dato4 + 7) % 10;

		int total = ((dato3 * 1000) + (dato4 * 100) + (dato1 * 10) + (dato2));
		System.out.println("La contraseña cifrada es: " + total);
		System.out.println(dato3 + dato4 + dato1 + dato2);
	}
}