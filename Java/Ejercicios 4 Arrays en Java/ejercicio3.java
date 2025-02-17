public class ejercicio3 {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 8, 6, 5, 4, 5, 3};
        int num = 5;
        int resultado = frecuenciaNumero(array, num);
        System.out.println("La frecuencia del número " + num + " es: " + resultado);
    }
    public static int frecuenciaNumero(int[] array, int num) {
        int frecuencia = 0;
        for (int elemento : array) {
            if (elemento == num) {
                frecuencia++;
            }
        }
        return frecuencia;
    }
}
