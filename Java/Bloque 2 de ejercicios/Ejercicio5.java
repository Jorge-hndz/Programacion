/*
    Ejercicio5

    -Escribe un método que se llame triangulo() que reciba un número entero como parámetro y muestre por pantalla una pirámide de asteriscos.
    -Prueba el método pedido desde main().
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    30/12/2024
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero y te dare un triangulo con dicha altura: ");
        num = teclado.nextInt();
        triangulo(num);

        teclado.close();
    }
    public static void triangulo(int num){
        num = num - 1;
        int espacios = num;
        int rellenos = 0;
        for(int x = 0; x <= num;x++){
            for(int i = 0; i <= espacios; i++){
                System.out.print(" ");
            }
            for(int i = 0; i <= rellenos; i++){
                System.out.print("*");
            }

            espacios = espacios - 1;
            rellenos = rellenos + 1;

            for(int z = 1; z <= x;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


