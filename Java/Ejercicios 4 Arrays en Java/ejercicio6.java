import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números tendrá el vector? ");
        int n = teclado.nextInt();

        int[] vector = new int[n];
        System.out.println("Introduce los números del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = teclado.nextInt();
        }

        int maxConsecutivos = contarIntConsecutivos(vector);
        System.out.println("El número máximo de consecutivos es: " + maxConsecutivos);

        teclado.close();
    }

    public static int contarIntConsecutivos(int[] vector) {
        if (vector.length <= 1) {
            return 0;
        }

        int maxConsecutivos = 0;
        int contador = 1;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] == vector[i - 1] + 1) {
                contador++;
            } else {
                if (contador > maxConsecutivos) {
                    maxConsecutivos = contador;
                }
                contador = 1;
            }
        }

        if (contador > maxConsecutivos) {
            maxConsecutivos = contador;
        }

        if (maxConsecutivos == 1) {
            return 0;
        }

        return maxConsecutivos;
    }
}
