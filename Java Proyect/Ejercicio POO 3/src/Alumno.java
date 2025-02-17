public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String direccion;
    private String telefono;

    public Alumno(int numAlumno, String nombre, String apellidos, String correo, String dni, String direccion, String telefono) {
        this.id = numAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numAlumno=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
