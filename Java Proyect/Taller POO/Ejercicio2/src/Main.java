public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(5,4);
        Punto punto2 = new Punto(-3,7);
        Punto punto3 = new Punto(-1,-6);
        Punto punto4 = new Punto(3,-9);

        System.out.println("Cordenadas y su cuadrante \n"+
        "-------------------------");
        punto1.cuandrante();
        punto2.cuandrante();
        punto3.cuandrante();
        punto4.cuandrante();
        System.out.println();

        System.out.println("Distancia de cada punto hasta el origen \n"+
        "---------------------------------------");
        punto1.distancia();
        punto2.distancia();
        punto3.distancia();
        punto4.distancia();
        System.out.println();
    }
}