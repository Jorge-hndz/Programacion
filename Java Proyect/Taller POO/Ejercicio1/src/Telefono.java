public class Telefono {
    private String lugar;
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String ram;
    private String procesador;
    private String tamañoPantalla;

    public Telefono() {
    }

    public Telefono(String lugar, String marca, String modelo, String almacenamiento, String ram, String procesador, String tamañoPantalla) {
        this.lugar = lugar;
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public void mostrarInfo(){
        System.out.println("El telefono se encuentra en: " + getLugar() + "\n" +
                "La marca del telefono es: " + getMarca() + "\n" +
                "El modelo del telefono es: " + getModelo() + "\n" +
                "La capacidad de almacenamiento del telefono es: " + getAlmacenamiento() + "\n" +
                "La memoria RAM del telefono es: " + getRam() + "\n" +
                "El procesador del telefono es: " + getProcesador() + "\n" +
                "El tamaño de la pantalla del telefono es: " + getTamañoPantalla() + "\n");
    }
}
