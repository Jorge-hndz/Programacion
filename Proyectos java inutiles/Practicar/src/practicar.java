import java.util.Scanner;

public class practicar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de términos
        System.out.print("Ingrese el número de términos para la secuencia de Fibonacci: ");
        int n = scanner.nextInt();
        
        // Cerrar el scanner
        scanner.close();
        
        // Variables para almacenar los dos primeros términos
        int a = 0, b = 1;
        
        System.out.println("Secuencia de Fibonacci hasta " + n + " términos:");
        
        // Imprimir la secuencia de Fibonacci
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            // Calcular el siguiente término
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
