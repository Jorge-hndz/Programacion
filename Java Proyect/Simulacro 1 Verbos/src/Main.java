import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fraseCambiada = "";

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        String[] cadenas = frase.split(" ");

        for (String str : cadenas){
            if (str.matches("^[a-zA-Z]*(ar|er|ir)$")){
                fraseCambiada += "(VERBO) ";
            } else {
                fraseCambiada += str + " ";
            }
        }
        System.out.println(fraseCambiada);

    }
}