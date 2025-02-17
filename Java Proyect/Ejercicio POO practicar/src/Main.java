import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos que quieres crear: ");
        int num = Integer.parseInt(teclado.nextLine());
        Alumno[] arrayAlumnos = new Alumno[num];

        for (int i = 0; i < arrayAlumnos.length;i++){
            System.out.println("Informacion del Alumno "+(i+1));
            System.out.println("---------------------------");
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = teclado.nextLine();
            System.out.println("Introduce los apellidos del alumno: ");
            String apellidos = teclado.nextLine();
            System.out.println("Introduce el NRE del alumno: ");
            int nre = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el email del alumno: ");
            String email = teclado.nextLine();
            System.out.println("Introduce la direccion del alumno: ");
            String direccion = teclado.nextLine();

            arrayAlumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);

        }

        for (int j = 0; j < arrayAlumnos.length;j++){
            System.out.println("Alumno "+(j+1));
            arrayAlumnos[j].info();
        }

    }
}