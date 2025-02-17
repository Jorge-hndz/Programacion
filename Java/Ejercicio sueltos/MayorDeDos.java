import java.util.Scanner;
import java.lang.Math;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String input1, input2;
        Integer num1 = null, num2 = null;
        Integer max;

        System.out.print("Introduce un primer numero: ");
        input1 = teclado.nextLine();
        num1 = Integer.parseInt(input1);
        System.out.print("Introduce un segundo numero: ");
        input2 = teclado.nextLine();
        num2 = Integer.parseInt(input2);

        max = Math.max(num1, num2);
        System.out.println("El numero mayor es: " + max);
        teclado.close();
    }
}
