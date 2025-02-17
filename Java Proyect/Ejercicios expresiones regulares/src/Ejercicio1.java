import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre de usuario: ");
        String nombre = teclado.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_#$%=+-]{2,19}$";

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(nombre);

        if (patron.matcher(nombre).matches()) {
            System.out.println("El nombre es valido");
        } else {
            System.out.println("El nombre no es valido");
        }
    }
}