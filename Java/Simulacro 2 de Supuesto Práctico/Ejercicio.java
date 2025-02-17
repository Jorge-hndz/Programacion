import java.util.Scanner;

public class Ejercicio {

    public static String caracter="*";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce a continuacion el numero de linea de altura para una figura: ");
        int num = teclado.nextInt();
        
        System.out.print(figura(num));

        teclado.close();
    }
    public static String figura(int num) {
        
        String cadena="";
        int margen = 0;
        int anchura = 0;

        if(num >= 3 && num <= 15) {

            if(num >= 3 && num <= 6){
                margen = 5;
            }
            if(num >= 7 && num <= 12){
                margen = 7;
            }
            if(num >= 13 && num <= 15){
                margen = 9;
            }

            if(num >= 3 && num <= 5){
                anchura = 3;
            }
            if(num >= 6 && num <= 8){
                anchura = 5;
            }
            if(num >= 9 && num <= 12){
                anchura = 7;
            }
            if(num >= 13 && num <= 15){
                anchura = 9;
            }

            for (int i = 1; i <= margen;i++){
                cadena = cadena + " ";
            }
            for (int z = 1; z <= anchura;z++){
                cadena = cadena + "*";
            }
            cadena = cadena + "\n";
            for (int y = 1; y <= num -2;y++){
                for (int i = 1; i <= margen;i++){
                    cadena = cadena + " ";
                }
                cadena = cadena + "*";
                for (int z = 1; z <= anchura - 2;z++){
                    cadena = cadena + " ";
                }                    
                    cadena = cadena + "*";
                    cadena = cadena + "\n";
            }
            for (int i = 1; i <= margen;i++){
                cadena = cadena + " ";
            }
            for (int z = 1; z <= anchura;z++){
                cadena = cadena + "*";
            }

        } else {
            System.out.println("El numero introducido no es valido");
        }
    
        return cadena;
    }
}
