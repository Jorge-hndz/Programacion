
public class Estudiante {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int curso;
	private String grado;
	private String universidad;
	private String eMail;
	private int numTelefono;
	
	private static int numEstudiantes = 0; 
	
	public Estudiante(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		numEstudiantes++;
	}

	public Estudiante() {
		super();
		numEstudiantes++;
	}

	public Estudiante(String nombre, String apellido1, String apellido2, int curso, String grado, String universidad,
			String eMail, int numTelefono) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.curso = curso;
		this.grado = grado;
		this.universidad = universidad;
		this.eMail = eMail;
		this.numTelefono = numTelefono;
		numEstudiantes++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public static int getNumEstudiantes() {
		return numEstudiantes;
	}

	public static void setNumEstudiantes(int numEstudiantes) {
		Estudiante.numEstudiantes = numEstudiantes;
	}

	public static int obtenerNumEstudiantes() {
		return numEstudiantes;
	}
	
	public String infoEstudiante() {
		return "Nombre: " + this.nombre + 
			   "\nApellidos: " + this.apellido1 + " " + this.apellido2 +
			   "\nGrado y Curso: " + this.grado + " " + this.curso;
	}
}
