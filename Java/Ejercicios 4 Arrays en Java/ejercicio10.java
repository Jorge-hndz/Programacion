public class ejercicio10 {
    public static void main(String[] args) {
        int[] vector = {4, 3, 1, 4, 2, 5, 8};
        int[] secuencia = {4, 2, 5};

        int indice = buscarSecuenciaInt(vector, secuencia);
        System.out.println("La secuencia comienza en el índice: " + indice);
    }
    
    public static int buscarSecuenciaInt(int[] vector, int[] secuencia) {
        if (secuencia.length == 0 || vector.length < secuencia.length) {
            return -1;
        }

        for (int i = 0; i <= vector.length - secuencia.length; i++) {
            if (vector[i] == secuencia[0]) {
                boolean coincide = true;
                for (int j = 1; j < secuencia.length; j++) {
                    if (vector[i + j] != secuencia[j]) {
                        coincide = false;
                        break;
                    }
                }
                if (coincide) {
                    return i;
                }
            }
        }

        return -1;
    }
}
