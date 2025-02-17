public class ejercicio2 {
    public static void main(String[] args) {
        String mostrarArray = "Array: ";
        int[] array = new int[20];

        for (int i = 0; i < array.length;i++){
            array[i] = i * 5;
        }
        for (int i = 0; i < array.length;i++){
            mostrarArray += array[i] + ",";
        }

        System.out.println(mostrarArray);
    }
}
