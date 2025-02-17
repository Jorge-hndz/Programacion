public class Alumno {
    private String Nombre;
    private String Apellidos;
    private int NRE;
    private String Email;
    private String Direccion;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int NRE, String email, String direccion) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.NRE = NRE;
        Email = email;
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getNRE() {
        return NRE;
    }

    public void setNRE(int NRE) {
        this.NRE = NRE;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void info(){
        System.out.println("Nombre: "+ this.Nombre +"\n"+
                "Apellidos: "+ this.Apellidos +"\n"+
                "NRE: "+ this.NRE +"\n"+
                "Email: "+ this.Email +"\n"+
                "Direccion: "+ this.Direccion);
    }
}
