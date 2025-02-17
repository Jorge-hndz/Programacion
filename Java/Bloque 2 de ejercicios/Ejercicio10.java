/*
    Ejercicio10

    -Escribe un método que se llame rombo2() que reciba un número entero como parámetro y devuelva una cadena de caracteres con el texto formateado de un rombo de asteríscos.
    -Prueba el método pedido desde main().
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    03/01/2025
*/
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número impar y te daré un rombo con dicha altura: ");
        int num = teclado.nextInt();

        if (num % 2 == 0 || num <= 0) {
            System.out.println("El número introducido no es válido. Debe ser un número impar positivo.");
        } else {
            System.out.println(rombo2(num));
        }

        teclado.close();
    }

    public static String rombo2(int num){
        String mi_cadena = "";
        int mitad = num / 2;
        int espacios = mitad;
        int rellenos = 1;
        
        for (int x = 0; x <= mitad; x++) {
            for (int i = 0; i <= espacios; i++) {
                mi_cadena = mi_cadena + " ";
            }
            for (int i = 0; i < rellenos; i++) {
                mi_cadena = mi_cadena + "*";
            }
            
            espacios = espacios - 1;
            rellenos = rellenos + 2;
        
            mi_cadena = mi_cadena + "\n";
        }

        espacios = 1;
        rellenos = num - 2;
        for (int x = 0; x <= mitad; x++) {
            for (int i = 0; i <= espacios; i++) {
                mi_cadena = mi_cadena + " ";
            }
            for (int i = 0; i < rellenos; i++) {
                mi_cadena = mi_cadena + "*";
            }
            espacios = espacios + 1;
            rellenos = rellenos - 2;
            mi_cadena = mi_cadena + "\n";
        }
        return mi_cadena; 
        
    }
}


