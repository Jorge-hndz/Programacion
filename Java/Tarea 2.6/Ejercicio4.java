import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;
        double long_circunferencia;
        double area;
        double vol;

        System.out.println("Introduce la longitud de un radio: ");
        num = teclado.nextInt();

        long_circunferencia = 2 * Math.PI * num;
        area = Math.PI * (num * num);
        vol = (4.0 / 3.0) * Math.PI * (num * num * num);

        System.out.println("La longitud de la circulo es " + long_circunferencia);
        System.out.println("El area del circulo es " + area);
        System.out.println("El volumen del circulo es " + vol);

        teclado.close();
    }
}