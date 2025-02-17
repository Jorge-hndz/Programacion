public class split {
    public static void main(String[] args) {
        String text = "Introduccion a la programacion, con Java, en la Universidad de los Andes";
        String[] fragmentos = text.split(",");
        for (int i = 0; i < fragmentos.length; i++) {
            System.out.println(fragmentos[i]);
        }
    }
}