public class Main {
    public static void main(String[] args) {
       Cuenta cuenta1 = new Cuenta(52934576,5805.50);
       Cuenta cuenta2 = new Cuenta(42234166,2304.30);
       Cuenta cuenta3 = new Cuenta(52023675,1000.00);

       System.out.println("Cuenta 1:");
       cuenta1.ingresar(30);
       cuenta1.retirar(30);
       cuenta1.mostrarDatos();

       System.out.println("Cuenta 2:");
       cuenta2.ingresar(50);
       cuenta2.retirar(20);
       cuenta2.mostrarDatos();

       System.out.println("Cuenta 3:");
       cuenta3.ingresar(100);
       cuenta3.mostrarDatos();

       System.out.println("Cuenta 1:");
       cuenta1.mostrarDatos();

       System.out.println("Cuenta 2:");
       cuenta2.mostrarDatos();

       System.out.println("Cuenta 3:");
       cuenta3.mostrarDatos();

    }
}