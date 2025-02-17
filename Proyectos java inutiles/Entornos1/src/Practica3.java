import java.util.Scanner;


public class Practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Parte1 entrada de datos
        System.out.println("Practica 3 Tema 1 Entorno de Desarrollo");
        System.out.println("Autor: Jorge Hernandez Aparicio");
        
        System.out.print("Escribe un texto: ");
        String text = teclado.nextLine();
        
        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = teclado.nextInt();
        
        System.out.print("Introduce un numero con decimales: ");
        double numDecimales = teclado.nextDouble();
        
        //Parte2 procesamiento de datos
        if(num1 < 0) {
        	num1 = num1 * -1;
        }
        if(num2 < 0) {
        	num2 = num2 * -1;
        }
        if(num3 < 0) {
        	num3 = num3 * -1;
        }

        int resultado = num2 * num3 + num1;
        
        double numArriba = Math.ceil(numDecimales);
        double numAbajo = Math.floor(numDecimales);

        //Parte 3 Salida de datos
        
        System.out.println("El texto es: " + text);
        System.out.println(num2 + " x " + num3 + " + " + num1 + " = " + resultado);
        
        System.out.println("El numero decimal es: " + numDecimales);
        System.out.println("El numero decimal arriba es: " + numArriba);
        System.out.println("El numero decimal abajo es: " + numAbajo);
        
    }
}