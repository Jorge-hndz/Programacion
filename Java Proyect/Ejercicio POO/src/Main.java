import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre;
        String Apellidos;
        int NRE;
        String Email;
        String Direccion;
        int opcion=1;

        System.out.print("Introduce el numero total de Alumnos que quieres crear: ");
        int num = teclado.nextInt();
        teclado.nextLine();

        Alumno[] arrayAlumnos = new Alumno[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el nombre del alumno: ");
            Nombre = teclado.nextLine();

            System.out.println("Introduce los apellidos del alumno: ");
            Apellidos = teclado.nextLine();

            System.out.println("Introduce el NRE del alumno: ");
            NRE = teclado.nextInt();

            teclado.nextLine();
            System.out.println("Introduce el Email del alumno: ");
            Email = teclado.nextLine();

            System.out.println("Introduce la direccion del alumno: ");
            Direccion = teclado.nextLine();

            arrayAlumnos[i] = new Alumno(Nombre,Apellidos,NRE,Email,Direccion);
        }


        while (opcion != 0){
            System.out.println("------------------------------------------");
            System.out.println("Alumnos: ");
            for(int i = 0;i<num;i++){
                System.out.println((i+1) + ". " + arrayAlumnos[i].getNombre());
            }
            System.out.println("0. Salir");
            System.out.print("Seleccione un alumno para ver su informacion: ");
            opcion = teclado.nextInt();

            if (opcion > 0 && opcion <= num){
                    System.out.printf("Informacion del alumno %d\n", opcion);
                    System.out.println(arrayAlumnos[opcion-1].info());
            } else if (opcion == 0) {
                System.out.println("Saliendo del programa");
            } else {
                System.out.println("No existe un alumno para esa opcion del menu.");
            }

        }
        teclado.close();
    }
}