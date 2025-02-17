package Practicar;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce si quieres que la suma de los pares o los impares");
        System.out.println("1.Pares");
        System.out.println("2.Impares");
        int x = teclado.nextInt();

        mostrarSuma(x);

        teclado.close();
    }
    public static void mostrarSuma(int x){
        
        int inicio = 100;
        int fin = 200;
        int total_pares = 0;
        int total_impares = 0;

        if (x == 1) {
            for(int i = inicio; i <= fin; i = i + 2){
                total_pares = total_pares + i;
            }
            System.out.println(total_pares);
        }
        if (x == 2) {
            inicio = inicio + 1;
            for(int i = inicio; i <= fin; i = i + 2){
                total_impares = total_impares + i;
            }
            System.out.println(total_impares);
        }
    }
    
}
