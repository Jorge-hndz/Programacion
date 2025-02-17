import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Float num1;
        Float num2;
        Float suma;
        Float resta;
        Float div;
        Float mult;

        System.out.println("Introduce un primer numero: ");
        num1 = teclado.nextFloat();

        System.out.println("Introduce un segundo numero: ");
        num2 = teclado.nextFloat();

        System.out.println("---------------------------");
        suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
        resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resta);
        mult = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mult);
        div = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + div);
        
        teclado.close();
    }
}
