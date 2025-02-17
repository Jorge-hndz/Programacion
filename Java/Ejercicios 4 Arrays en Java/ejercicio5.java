public class ejercicio5 {
    public static void main(String[] args) {
        char[] vectorA = {'a', 'b', 'c'};
        char[] vectorB = {'a', 'b', 'd'};

        System.out.println("Resultado de comparar vectorA y vectorB: " + compararVectoresChar(vectorA, vectorB));
    }
    
    public static int compararVectoresChar(char[] vector1, char[] vector2) {
        int longitudMinima = Math.min(vector1.length, vector2.length);

        for (int i = 0; i < longitudMinima; i++) {
            if (vector1[i] < vector2[i]) {
                return -1;
            } else if (vector1[i] > vector2[i]) {
                return 1;
            }
        }

        if (vector1.length < vector2.length) {
            return -1;
        } else if (vector1.length > vector2.length) {
            return 1;
        }

        return 0;
    }
}
