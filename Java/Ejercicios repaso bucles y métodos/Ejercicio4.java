import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int min = 1;
        int max = 100;
        int adivinar = 50;
        boolean adivinado = false;

        System.out.println("Piensa a continuacion un numero y voy a intentar adivinarlo del 1 al 100");
        
        do {
            adivinar = (min + max) / 2;
            System.out.println("Es tu numero "+adivinar+"?");
            String respuesta = teclado.nextLine();

            if (respuesta.equals("+")) {
                min = adivinar + 1;
                
            } else if(respuesta.equals("-")) {
                max = adivinar - 1;
            } else if(respuesta.equals("=")) {
                System.out.println("He ganado");
                adivinado = true;
            }
        }

        while(adivinado != true);

        









        teclado.close();
    }
}
