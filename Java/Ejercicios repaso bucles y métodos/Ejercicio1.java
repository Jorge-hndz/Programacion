import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        mostrarSuma();

    }
    static void mostrarSuma() {
        Scanner teclado = new Scanner(System.in);
        int inicio = 0;
        int fin = 0;
        int total = 0;
        int x = 0;



        System.out.printf("\nIntroduce si la suma de los numeros del %d al %d quieres que sea par o impar", inicio, fin);
        System.out.println();
        System.out.println("Introduce el numero de inicio");
        inicio = teclado.nextInt();
        System.out.println("Introduce el numero de fin");
        fin = teclado.nextInt();
        System.out.println("1. Impar");
        System.out.println("2. Par");
        x = teclado.nextInt();
        

        if(x == 1){
            if(inicio %2 == 0){
                inicio = inicio + 1;
            }
            for (int i = inicio; i <= fin;i = i + 2) {
                total = total + i;
            }
        }
        if(x == 2){
            if(inicio %2 != 0){
                inicio = inicio + 1;
            }
            for (int i = inicio; i <= fin;i = i+2) {
                total = total + i;
            }
        }
        if(x != 1 && x != 2){
            System.out.println("El numero introducido no es valido");

        }
        
        System.out.println(total);
        
        teclado.close();
    }
    
}