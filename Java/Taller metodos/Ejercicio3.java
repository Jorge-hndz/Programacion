/*
    Ejercicio3

    -Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.
    -Hay que tener en cuenta que:
        -El método recibe un número para el tamaño del lado y un carácter para utilizarlo en el contorno del cuadrado.
        -El algoritmo utilizado debe formatear todo sobre una sola cadena de texto que será devuelta.
    Prueba exhaustivamente el método pedido desde main().
    Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    19/12/2024
*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String elemento;
        int size;

        System.out.println("Introduce el elemento que deseas usar: ");
        elemento = teclado.nextLine();
        System.out.println("Introduce el tamaño de el cuadrado: ");
        size = teclado.nextInt();

        System.out.println(muestraCuadrado(elemento, size));

        teclado.close();
    }
    public static String muestraCuadrado(String elemento,int size ){
        String mi_cadena = "";

        for(int i = 1; i <= size; i++){
            mi_cadena = mi_cadena + elemento;
        }
        mi_cadena = mi_cadena + "\n";

        for(int x = 1; x <= size-2; x++){
            mi_cadena = mi_cadena + elemento;
            for(int y = 1; y <= size-2; y++){
                mi_cadena = mi_cadena + " ";
            }
            mi_cadena = mi_cadena + elemento;
            mi_cadena = mi_cadena + "\n";
        }
        for(int i = 1; i <= size; i++){
            mi_cadena = mi_cadena + elemento;
        }
        return mi_cadena; 
    }
}
