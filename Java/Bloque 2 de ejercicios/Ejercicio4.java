/*
    Ejercicio4

    -Escribe un método llamado fibonacci() que reciba un entero, compruebe que es válido y devuelva el valor que le corresponde en la sucesión de Fibonacci.
    -Prueba el método pedido desde main().
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    30/12/2024
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.print("Introduce un numero y te dare su equivalente en la cadena de fibonacci: ");
        num = teclado.nextInt();

        fibonacci(num);
        
        teclado.close();
    }
    public static void fibonacci(int num){

        if (num == 0) {
            System.out.println("El termino de la sucesión vale: 0");
            return;
        }
        if (num >= 1){

            int total = 0;
            int x = 0;
            int y = 1;
        
            for(int i=0; i <= num-1; i++){
                total = y + x;
                y = x;
                x = total;
            }
        System.out.printf("El termino de la sucesión vale: " + total);

        } else {
            System.out.println("El numero introducido no es valido");
        }
        
    }
}