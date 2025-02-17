public class ejercicio18 {
    public static void main(String[] args) {
        int[] vector = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int valor = 13;

        int indice = buscarBinariaRec(vector, valor);
        if (indice != -1) {
            System.out.println("El valor " + valor + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el vector.");
        }
    }
    public static int buscarBinariaRec(int[] vector, int valor) {
        return buscarBinariaRec(vector, valor, 0, vector.length - 1);
    }

    private static int buscarBinariaRec(int[] vector, int valor, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        }

        int medio = inicio + (fin - inicio) / 2;

        if (vector[medio] == valor) {
            return medio; // Se encontró el valor
        } else if (vector[medio] < valor) {
            return buscarBinariaRec(vector, valor, medio + 1, fin);
        } else {
            return buscarBinariaRec(vector, valor, inicio, medio - 1);
        }
    }    
}
