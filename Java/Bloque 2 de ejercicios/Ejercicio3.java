/*
    Ejercicio3

    -Escribe un programa que muestre el factorial de un número leído por teclado.
    -Para el cálculo del factorial utiliza un método llamado factorial() que recibe el número para el cálculo y devuelve el resultado.
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    30/12/2024
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.print("Introduce un numero y te dare su factorial: ");
        num = teclado.nextInt();

        factorial(num);
        
        teclado.close();
    }
    public static void factorial(int num){
        
        int total = 1;

        for (int i = 1; i <= num; i++){
            total = total * i;
        }
        System.out.printf("\nEl resultado del factorial es: %d",total);
        
    }
}