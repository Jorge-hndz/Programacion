/*
    Ejercicio8

    -Escribe un método que se llame trianguloTexto() que reciba un número entero como parámetro y devuelva una cadena de caracteres con el texto formateado de una pirámide de asteriscos.
    -Prueba el método pedido desde main().
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    02/01/2025
*/
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero y te dare un triangulo con dicha altura: ");
        num = teclado.nextInt();
        System.out.println(trianguloTexto(num));

        teclado.close();
    }
    public static String trianguloTexto(int num){
        String mi_cadena = "";
        num = num - 1;
        int espacios = num;
        int rellenos = 0;
        for(int x = 0; x <= num;x++){
            for(int i = 0; i <= espacios; i++){
                mi_cadena = mi_cadena + " ";
            }
            for(int i = 0; i <= rellenos; i++){
                mi_cadena = mi_cadena + "*";
            }

            espacios = espacios - 1;
            rellenos = rellenos + 1;

            for(int z = 1; z <= x;z++){
                mi_cadena = mi_cadena + "*";
            }
            mi_cadena = mi_cadena + "\n";
        }
        return mi_cadena; 
    }
}


