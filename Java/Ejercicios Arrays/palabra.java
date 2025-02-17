import java.util.Scanner;

public class palabra {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int c = 0;

		System.out.println("Introduce una palabra: ");
		String palabra = teclado.nextLine();

		char[] caracteres=new char[palabra.length()];

		for (int i=0; i<palabra.length(); i++){
			c = c+1;
			caracteres[i]=palabra.charAt(i);
			System.out.println(caracteres[i]);
		}
		System.out.printf("\nLa cantidad de caracteres es: %d",c);
		teclado.close();
	}
}