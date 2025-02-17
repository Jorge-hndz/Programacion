public class Cuenta {
    private static long contadorCuenta=100000;
    private long numCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
        this.numCuenta = ++contadorCuenta;
        this.dni = 0;
        this.saldo = 0;
    }

    public Cuenta(long dni, double saldo) {
        this.numCuenta = ++contadorCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            System.out.println("Se a realizado el ingreso correctamente el saldo actual es: " + saldo);
        } else {
            System.out.println("la cantidad a ingresar no es valida");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo = saldo + cantidad;
            System.out.println("Se a realizado la retirada correctamente el saldo actual es: " + saldo);
        } else {
            System.out.println("la cantidad a retirar no es valida");
        }
    }

    public void mostrarDatos(){
        System.out.println("Numero de cuenta: " + numCuenta);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo actual: " + saldo);


    }

}
