import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String input1;
        Integer num1;

        System.out.print("Introduce un numero: ");
        input1 = teclado.nextLine();
        num1 = Integer.parseInt(input1);

        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es par.");
        } else {
            System.out.println("El numero " + num1 + " es impar.");
        }
        teclado.close();
    }
}