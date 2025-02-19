public class Main {
    public static void main(String[] args) {
    Telefono telefono1 = new Telefono("El corte ingles","Samsung","S25","512 GB","8 GB","Qualcom 8","8 Pulgadas");
    Carta carta1 = new Carta("Oficina de correos","Juan Perez Aguilar","Calle Teniente Sevilla, Nº4","SEUR","25/02/2025");
    Libro libro1 = new Libro("La casa del Libro","Los Futbolisimos","Ciencia Ficcion","Santillana",256);

    System.out.println("Informacion del telefono: ");
    telefono1.mostrarInfo();

    System.out.println("Informacion de la carta: ");
    carta1.mostrarInfo();

    System.out.println("Informacion del libro: ");
    libro1.mostrarInfo();
    }
}