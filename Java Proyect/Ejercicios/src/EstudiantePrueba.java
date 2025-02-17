
public class EstudiantePrueba {

	private static Estudiante[] estudiantes;

	public static void crearEstudiantes() {

		estudiantes = new Estudiante[3];

		estudiantes[0] = new Estudiante();
		estudiantes[1] = new Estudiante("Andres","Perez","Casas");
		estudiantes[2] = new Estudiante("Pablo","Hernandez","Marcos");

	}

	public static void mostrarEstudiantes() {

		int contador=0;

		for(Estudiante estudiante:estudiantes) {

			System.out.println("INFORMACION DE ESTUDIANTE");
			System.out.println("---------------------------");
			System.out.println(estudiante.infoEstudiante());
			contador++;
		}
		
		/*
		public static void asignarTelefono() {
			
		}
		*/
	}

	public static void main(String[] args) {

		//crearEstudiantes();
		//mostrarEstudiantes();
		
		Estudiante estudiantes1 = new Estudiante("Andres","Perez","Casas",2,"DAM","Miguel Hernandez","andres@gmail.com",664292188);

		Bateria bateria1 = new Bateria ("ModeloBat",2.5); 
		Pantalla pantalla1 = new Pantalla (7.2,"Samsung");
		
		TelefonoMovil telefono1 = new TelefonoMovil("A27","Samsung",95.5,estudiantes1,bateria1,pantalla1);
		System.out.println("INFORMACION DE ESTUDIANTE");
		System.out.println("---------------------------");
		System.out.println(estudiantes1.infoEstudiante());
		
		TelefonoMovil telefono2 = new TelefonoMovil("A27","Samsung",95.5,estudiantes1,bateria1,pantalla1);
		
		Bateria bat2=new Bateria("Modelbat2");
		
		telefono2.setBateria(bat2);
		
		System.out.println(telefono2.toString());
	}
}
