import java.util.ArrayList;

public class Modulo {
    private int id;
    private String nombreModulo;
    private int curso;
    private int horas;
    private String profesor;
    private ArrayList<Alumno> alumnos;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public Modulo(int id, String nombreModulo, int curso, int horas, String profesor, ArrayList<Alumno> alumnos) {
        this.id = id;
        this.nombreModulo = nombreModulo;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Modulo(int numModulo, String nombreModulo, int curso, int horas, String profesor) {
        this.id = numModulo;
        this.nombreModulo = nombreModulo;
        this.curso = curso;
        this.horas = horas;
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombreModulo='" + nombreModulo + '\'' +
                ", curso='" + curso + '\'' +
                ", horas='" + horas + '\'' +
                ", profesor='" + profesor + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
