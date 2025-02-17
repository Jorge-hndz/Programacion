public class ejercicio9 {
    public static void main(String[] args) {
        int[] vector = {5, 3, 3, 3, 5, 7, 8, 8, 3, 8, 9, 0, 2, 8, 8, 7, 5, 8};
        int resultado = masFrecuenteInt(vector);
        System.out.println("El elemento más frecuente es: " + resultado);
    }

    public static int masFrecuenteInt(int[] vector) {
        if (vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede estar vacío.");
        }

        int valorMasFrecuente = vector[0];
        int frecuenciaMaxima = 1;

        for (int i = 0; i < vector.length; i++) {
            int frecuenciaActual = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > frecuenciaMaxima) {
                frecuenciaMaxima = frecuenciaActual;
                valorMasFrecuente = vector[i];
            }
        }

        return valorMasFrecuente;
    }
}
