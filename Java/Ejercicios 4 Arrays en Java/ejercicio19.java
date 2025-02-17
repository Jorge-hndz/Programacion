import java.util.ArrayList;
import java.util.List;

public class ejercicio19 {
    public static void main(String[] args) {
        int limite = 50;
        List<Integer> primos = obtenerPrimos(limite);
        System.out.println("Números primos hasta " + limite + ": " + primos);
    }
    public static List<Integer> obtenerPrimos(int limiteSuperior) {
        boolean[] esCompuesto = new boolean[limiteSuperior + 1];
        List<Integer> primos = new ArrayList<>();

        for (int numero = 2; numero <= limiteSuperior; numero++) {
            if (!esCompuesto[numero]) {
                primos.add(numero);
                for (int multiplo = 2 * numero; multiplo <= limiteSuperior; multiplo += numero) {
                    esCompuesto[multiplo] = true;
                }
            }
        }

        return primos;
    }
}
