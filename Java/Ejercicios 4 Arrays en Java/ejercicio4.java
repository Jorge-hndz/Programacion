public class ejercicio4 {
    public static void main(String[] args) {
        int[] vectorA = {1, 2, 3, 4, 5};
        int[] vectorB = {1, 2, 3, 4, 5};

        if (vectoresIntIguales(vectorA, vectorB)==true){
            System.out.println("Vector A y B son iguales");
        } else if (vectoresIntIguales(vectorA, vectorB)==false){
            System.out.println("Vector A y B no son iguales");
        }

    }
        
    public static boolean vectoresIntIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }
    
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
    
        return true;
    }
}

