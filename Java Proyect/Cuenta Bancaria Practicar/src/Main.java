import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(52023874, 10000);
        Cuenta cuenta2 = new Cuenta(56053894, 150040);

        cuenta1.ingresar(100);
        cuenta2.ingresar(10000000);

        cuenta1.retirar(10000);
        cuenta2.retirar(10150039);

        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();


    }
}