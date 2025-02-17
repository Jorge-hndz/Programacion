/*
    Ejercicio1

    -Escribe un programa Java para calcular los salarios semanales de empleados a los que se les paga 15 euros por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
    -El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro si se quiere seguir. El salario que se le debe pagar se calcula utilizando un método especializado llamado calcularSalario().
    -El método  calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
    -Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    30/12/2024
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Introduce la cantidad de horas semanales trabajadas y te dare el salario: ");
        x = teclado.nextInt();
        calcularSalario(x);
        System.out.println();
        System.out.print("Quieres calcular otro salario(1.Si 2.No): ");
        y = teclado.nextInt();

        while (y == 1) {
            System.out.print("Introduce la cantidad de horas semanales trabajadas y te dare el salario: ");
            x = teclado.nextInt();
            calcularSalario(x);
            System.out.println();
            System.out.print("Quieres calcular otro salario(1.Si 2.No): ");
            y = teclado.nextInt();
        }  
        teclado.close();
    }
    public static void calcularSalario(int x){
        int total;
        if (x <= 35) {
            total = x * 15;
            System.out.printf("\nTu salario sera de %d euros",total);
        }
        if (x > 35) {
            x = x - 35;
            total = x * 22;
            total = total + 525;
            System.out.printf("\nTu salario sera de %d euros",total);
        }
    }
}