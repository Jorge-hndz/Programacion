/*
    Ejercicio6

    -Escribe un método que se llame rombo() que reciba un número entero como parámetro y muestre por pantalla  un rombo de asteriscos.
    -Hay que tener en cuenta que el número de filas -para un rombo- debe ser impar por cuestiones de simetría.
    -Prueba el método pedido desde main().
    -Deben seguirse los principios y estilo del código limpio.

    Autor: Jorge Hernandez
    02/01/2025
*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número impar y te daré un rombo con dicha altura: ");
        int num = teclado.nextInt();

        if (num % 2 == 0 || num <= 0) {
            System.out.println("El número introducido no es válido. Debe ser un número impar positivo.");
        } else {
            rombo(num);
        }

        teclado.close();
    }

    public static void rombo(int num){
        int mitad = num / 2;
        int espacios = mitad;
        int rellenos = 1;
        
        for (int x = 0; x <= mitad; x++) {
            for (int i = 0; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < rellenos; i++) {
                System.out.print("*");
            }
            
            espacios = espacios - 1;
            rellenos = rellenos + 2;
        
            System.out.println();
        }

        espacios = 1;
        rellenos = num - 2;
        for (int x = 0; x <= mitad; x++) {
            for (int i = 0; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < rellenos; i++) {
                System.out.print("*");
            }
            espacios = espacios + 1;
            rellenos = rellenos - 2;
            System.out.println();
        }
        
        
    }
}


