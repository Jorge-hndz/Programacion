public class Carta {
    private String lugar;
    private String destinatario;
    private String direccion;
    private String compañiaTransporte;
    private String fecha;

    public Carta() {
    }

    public Carta(String lugar, String destinatario, String direccion, String compañiaTransporte, String fecha) {
        this.lugar = lugar;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.compañiaTransporte = compañiaTransporte;
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCompañiaTransporte() {
        return compañiaTransporte;
    }

    public void setCompañiaTransporte(String compañiaTransporte) {
        this.compañiaTransporte = compañiaTransporte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void mostrarInfo(){
        System.out.println("La carta se encuentra en: " + getLugar() + "\n" +
                "El destinatario de la carta es: " + getDestinatario() + "\n" +
                "La direccion de entrega de la carta es: " + getDireccion() + "\n" +
                "la compañia de transporte que entregara la carta es: " + getCompañiaTransporte() + "\n" +
                "La fecha de entrega de la carta es: " + getFecha() + "\n");
    }
}
