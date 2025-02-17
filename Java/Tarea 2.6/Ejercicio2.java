import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int total;

        System.out.println("Introduce el lado de un cuadrado: ");
        lado = teclado.nextInt();

        total = lado * lado;
        System.out.println("El area del cuadrado es: " + total);

        teclado.close();
    }
}