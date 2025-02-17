/*
	Ejercicio9.java
	• Realizar un programa que utilice un estructura array de enteros positivos de 10 posiciones
    • Leer 10 enteros por teclado e introducirlos en el array uno a uno
    • Solicitar al usuario enteros positivos (hasta que introduzca un 0) para buscarlos dentro del
    array
    • Para cada entero positivo el programa deberá imprimir si ese entero está o no en el array y en
    qué posiciones está (deberá imprimir todas las posiciones en las que está)
    • El programa finalizará cuando se introduzca un 0
	4/12/24
	Jorge Hernández Aparicio
*/
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] array = new int[10];
    int num;
    boolean encotrado = false;

    for(int i = 0; i < 10; i++){
    	System.out.print("Introduce numeros: ");
    	array[i] = teclado.nextInt();
    }

    for(int j = 1;j != 0; j++) {
        System.out.print("Introduce numeros para buscar si esta en los anteriores: ");
        num = teclado.nextInt();

        for(int i = 0; i < 10; i++){
            if(array[i] == num){
                System.out.printf("\nEl numero %d esta en la posicion %d del array.",array[i],i);
                 encotrado = true;
            }
            if (encotrado != true) {
            System.out.printf("\nEl numero %d no esta en el array.",num);
            }
        }
    }
    
    teclado.close();
    }
}
