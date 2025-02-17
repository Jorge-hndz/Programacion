/*
    -Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros. Devuelve cuantos valores -entre sus elementos- están ordenados. Si  todos los elementos son diferentes devuelve 0.
    -Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 3.
    -Prueba el método pedido desde main().
    -Recorriendo los datos de izquierda a derecha, empezando por el segundo elemento hay que comprobar si es secuencia del anterior. Se puede utilizar un contador iniciado en 1 que se incrementa al comprobarse que un elemento es consecutivo -en orden- con el anterior. Cada vez que se inicia nueva secuencia hay que guardar el valor del contador en una variable auxiliar con el máximo alcanzado.
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
*/
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números tendrá el vector? ");
        int n = teclado.nextInt();

        int[] vector = new int[n];
        System.out.println("Introduce los números del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = teclado.nextInt();
        }

        int maxConsecutivos = contarIntConsecutivos(vector);
        System.out.println("El número máximo de consecutivos es: " + maxConsecutivos);

        teclado.close();
    }

    public static int contarIntConsecutivos(int[] vector) {
        if (vector.length <= 1) {
            return 0;
        }

        int maxConsecutivos = 0;
        int contador = 1;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] == vector[i - 1] + 1) {
                contador++;
            } else {
                if (contador > maxConsecutivos) {
                    maxConsecutivos = contador;
                }
                contador = 1;
            }
        }

        if (contador > maxConsecutivos) {
            maxConsecutivos = contador;
        }

        if (maxConsecutivos == 1) {
            return 0;
        }

        return maxConsecutivos;
    }
}
