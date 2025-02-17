import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		for(int j = 0; j <= 3; j++){
			for(int i=0; i <= 7; i++){
				System.out.print("* ");	
			}
			System.out.println();
			for(int i=0; i <= 7; i++){
				System.out.print(" *");	
			}
			System.out.println();
		}
		
	}
}