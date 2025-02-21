public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = "comer";
        System.out.println("Validacion de "+ texto +" es: "+ validarMatricula_Exp1(texto));

    }

    public static boolean validarNumeroEntero_Exp(String texto){
        return texto.matches("^-?[0-9]+$");
    }
    public static boolean validarNumeroEnteroPositivo_Exp(String texto){

        return texto.matches("^[0-9]+$");
    }
    public static boolean validarNumeroEnteroNegativo_Exp(String texto){
        return texto.matches("^-[0-9]+$");
    }
    public static boolean validarDni_Exp(String texto){
        return texto.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }
    public static boolean validarIp_Exp(String texto){
        return texto.matches("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }
    public static boolean validarMatricula_Exp(String texto){
        return texto.matches("^[0-9]{4}[B-Z && [^AEIÑQOU]]{3}$");
    }
    public static boolean validarMatricula_Exp1(String texto){
        return texto.matches("^[a-zA-Z]{1,}(ar|er|ir)$");
    }

}