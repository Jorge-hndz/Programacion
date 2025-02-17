import java.util.Scanner;

public class altura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] miarray = new int[5];
		int media = 0;

		for(int i = 0; i < 5; i++){
			System.out.println("Introduce las alturas de las personas en cm: ");
			miarray[i] = teclado.nextInt();
			media = media + miarray[i];
		}
		media = media / 5;
		System.out.println(media);

		for(int i = 0; i < 5; i++){
			if(miarray[i] > media){
				System.out.printf("\nLa altura %d en la posicion %d del array es mayor que la media",miarray[i],i);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------");
		for(int i = 0; i < 5; i++){
			if(miarray[i] < media){
				System.out.printf("\nLa altura %d en la posicion %d del array es menor que la media",miarray[i],i);
			}
		}
		
		teclado.close();
	}
}