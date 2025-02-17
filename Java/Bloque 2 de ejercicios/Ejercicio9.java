/*
    Ejercicio9

    - Escribe un programa que calcule las soluciones de una ecuación de segundo grado de la forma ax2 + bx + c = 0.
    - Se utilizará una variable de clase como variable global para el discriminante; de esta forma estará accesible por los dos métodos: main() y evaluarDiscriminante().
    - Deben seguirse los principios y estilo del código limpio.
    Autor: Jorge Hernandez
    03/01/2025
*/
import java.util.Scanner;

public class Ejercicio9 {
    static double discriminante;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el coeficiente a:");
        double a = teclado.nextDouble();

        System.out.println("Introduce el coeficiente b:");
        double b = teclado.nextDouble();

        System.out.println("Introduce el coeficiente c:");
        double c = teclado.nextDouble();

        int resultado = evaluarDiscriminante(a, b, c);

        if (resultado == 1) {
            System.out.println("La ecuación es degenerada.");
        } else if (resultado == 2) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Dos raíces reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (resultado == 3) {
            double x = -b / (2 * a);
            System.out.println("Una raíz real:");
            System.out.println("x = " + x);
        } else if (resultado == 4) {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Dos raíces complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

        teclado.close();
    }

    public static int evaluarDiscriminante(double a, double b, double c) {
        discriminante = (b * b) - (4 * a * c);
        if (a == 0) {
            return 1;
        } else if (discriminante > 0) {
            return 2;
        } else if (discriminante == 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
