/*
    Ejercicio2

    -Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado calcularMostrarTabla().
    -El método calcularMostrarTabla() recibe el número del que calculará la tabla y la visualiza por pantalla con el formato adecuado.
    -La tabla mostrará productos hasta el 15. 
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    30/12/2024
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.print("Introduce un numero y te dare su tabla de multiplicar hasta el 15: ");
        num = teclado.nextInt();

        calcularMostrarTabla(num);
        
        teclado.close();
    }
    public static void calcularMostrarTabla(int num){
        
        int total = 0;

        for (int i = 1; i <= 15; i++){
            total = i * num;
            System.out.printf("\n %d X %d = %d", i, num, total);
        }
        
    }
}