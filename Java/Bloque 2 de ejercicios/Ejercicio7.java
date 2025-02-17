/*
    Ejercicio7

    -Escribe un método que se llame banner() que muestra tus iniciales en la pantalla.
    -Prueba los posibles métodos pedidos desde main().
    -Deben seguirse los principios y estilo del código limpio.

    Autor: Jorge Hernandez
    02/01/2025
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        banner();
    }

    public static void banner() {
        String inicial1 = generarH();
        String inicial2 = generarT();
        String inicial3 = generarA();

        String[] lineas1 = inicial1.split("\n");
        String[] lineas2 = inicial2.split("\n");
        String[] lineas3 = inicial3.split("\n");

        for (int i = 0; i < lineas1.length; i++) {
            System.out.println(lineas1[i] + "   " + lineas2[i] + "   " + lineas3[i]);
        }
    }

    public static String generarH() {
        return """
               H     H
               H     H
               H     H
               HHHHHHH
               H     H
               H     H
               H     H
               """;
    }

    public static String generarT() {
        return """
               TTTTTTT
                  T
                  T
                  T
                  T
                  T
                  T
               """;
    }

    public static String generarA() {
        return """
               A
              A A
             A   A
            AAAAAAA
            A     A
            A     A
            A     A
            """;
    }
}
