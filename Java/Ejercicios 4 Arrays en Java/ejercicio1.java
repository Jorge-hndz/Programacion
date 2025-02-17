public class ejercicio1 {
    public static void main(String[] args) {
        String mostrarArray = "Array: ";
        int[] array = new int[10];
        for (int i = 0; i < array.length;i++){
            array[i] = 7;
        }
        for (int i = 0; i < array.length;i++){
            mostrarArray += array[i];
        }

        System.out.println(mostrarArray);
    }
}
