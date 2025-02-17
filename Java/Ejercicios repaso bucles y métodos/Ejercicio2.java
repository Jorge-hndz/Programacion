import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1;
        double num2;
        String op;
    
        System.out.println("Introduce el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce ahora la operacion que deseas hacer(+, -, *, /)");
        op = teclado.nextLine();

        switch (op) {
            case "+":
            Suma(num1, num2);
            break;
            case "-":
            Resta(num1, num2);
            break;
            case "*":
            Mult(num1, num2);
            break;
            case "/":
            Div(num1, num2);
            break;
        }
        teclado.close();
    }
    static void Suma(double num1, double num2){
        double total = num1 + num2;
        System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, total);
    }
    static void Resta(double num1, double num2){
        double total = num1 - num2;
        System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, total);
    }
    static void Mult(double num1, double num2){
        double total = num1 * num2;
        System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, total);
    }
    static void Div(double num1, double num2){
        double total = num1 / num2;
        System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, total);
    }

}
