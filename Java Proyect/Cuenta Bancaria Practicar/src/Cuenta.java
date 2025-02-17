public class Cuenta {
    private static int contador = 10000;
    private long numeroCuenta;
    private long dni;
    private long saldo;

    public Cuenta(int numeroCuenta, int dni, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta(int dni, int saldo) {
        this.numeroCuenta = contador++;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void ingresar(int cantidad){
        saldo = saldo + cantidad;
        System.out.println("Cantidad ingresada correctamente, saldo actual: " + saldo);
    }

    public void retirar(int cantidad){
        if (cantidad < saldo){
            saldo = saldo - cantidad;
        }
        System.out.println("Cantidad retirada correctamente, saldo actual: " + saldo);
    }

    public void mostrarDatos(){
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El dni de la cuenta es: " + dni);
        System.out.println("El saldo de la cuenta es: " + saldo);

    }
}
