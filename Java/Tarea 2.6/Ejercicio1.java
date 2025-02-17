import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Hola, como te llamas: ");
        nombre = teclado.nextLine();
        System.out.println("Buenos dias " + nombre);
        
        teclado.close();
    }
}