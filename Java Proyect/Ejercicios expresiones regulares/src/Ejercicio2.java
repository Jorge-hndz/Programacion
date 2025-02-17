import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Validar DNI");
        System.out.println("2. Validar NIE");
        System.out.println("0. Salir");

        int num = teclado.nextInt();

        if (num == 0) {
            System.exit(0);
        } else if (num == 1) {
            System.out.println("Introduce un DNI: ");
            String dni = teclado.nextLine();
            teclado.nextLine();
            validarDNI(dni);
        } else if (num == 2) {
            System.out.println("Introduce un NIE: ");
            String nie = teclado.nextLine();
            teclado.nextLine();
            validarNIE(nie);
        }

    }

    public static void validarDNI(String dni) {
        String regexDNI= "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
        Pattern patron = Pattern.compile(regexDNI);
        Matcher concordancias = patron.matcher(dni);

        if (patron.matcher(dni).matches()) {
            System.out.println("El DNI es valido");
        } else {
            System.out.println("El DNI no es valido");
        }
    }

    public static void validarNIE(String nie){
        String regexNIE= "^[XYZ][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKE]$";
        Pattern patron = Pattern.compile(regexNIE);
        Matcher concordancias = patron.matcher(nie);

        if (patron.matcher(nie).matches()) {
            System.out.println("El NIE es valido");
        } else {
            System.out.println("El NIE no es valido");
        }
    }
}
