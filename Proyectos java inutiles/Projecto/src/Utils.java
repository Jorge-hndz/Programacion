public class Utils {
    public static String tipoTriangulo(int a, int b, int c) {
        if (!esTriangulo(a, b, c)) {
            return "ERROR";
        }

        if (a == b && b == c) {
            return "EQUILATERO";
        } else if (a == b || b == c || a == c) {
            return "ISOSCELES";
        } else {
            return "ESCALENO";
        }
    }

    public static boolean esTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static int masFrecuenteInt(int[] numeros) {
        int maxFrecuencia = 0;
        int masFrecuente = -1;
        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                masFrecuente = numeros[i];
            }
        }
        return masFrecuente;
    }

    public static int buscarInt(int[] numeros, int num) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
