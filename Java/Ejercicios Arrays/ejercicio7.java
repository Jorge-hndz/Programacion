/*
	Ejercicio7.java
	• Realizar un programa que utilice un estructura array de enteros de 10 posiciones
	• Leer 10 enteros por teclado e introducirlos en el array uno a uno
	• Solicitar al usuario otro entero y el programa deberá imprimir si ese último entero está o no en
	el array y en qué posición (solo obtendrá la primera)
	4/12/24
	Jorge Hernández Aparicio
*/
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] array = new int[10];
    int num;
    boolean encotrado = false;

    for(int i = 0; i < 10; i++){
    	System.out.print("Introduce numeros: ");
    	array[i] = teclado.nextInt();
    }

    System.out.print("Introduce un numero para buscar si esta en los anteriores: ");
   	num = teclado.nextInt();

   	for(int i = 0; i < 10; i++){
    	if(array[i] == num){
    		System.out.printf("\nEl numero %d esta en la posicion %d del array.",array[i],i);
    		 encotrado = true;
    		 break;
    	}
    }
    if (encotrado != true) {
    	System.out.printf("\nEl numero %d no esta en el array.",num);
    }
    
    teclado.close();
    }
}
