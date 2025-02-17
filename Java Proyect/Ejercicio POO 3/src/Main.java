import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Modulo> listaModulos = new ArrayList<Modulo>();

        try {
            File myObjMod = new File("assets/modulos.txt");
            Scanner myReader = new Scanner(myObjMod);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] lineaModulo = data.split("&");

                listaModulos.add(new Modulo(parseInt(lineaModulo[0]),lineaModulo[1],parseInt(lineaModulo[2]),parseInt(lineaModulo[3]),lineaModulo[4],buscarAlumnosEnModulo(Integer.parseInt(lineaModulo[0]))));

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        imprimirListaModulos(listaModulos);
    }
    public static ArrayList<Alumno> buscarAlumnosEnModulo(int modulo){

        ArrayList<Alumno> alumnosEnModulo=new ArrayList<>();

        try {
            File myObj = new File("assets/modulo_alumno.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] linea = data.split(",");
                    if (Integer.parseInt(linea[0]) == modulo){
                        Alumno alumnoActual=recuperarAlumno(Integer.parseInt(linea[1]));
                        alumnosEnModulo.add(alumnoActual);

                    }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return alumnosEnModulo;
    }
    public static Alumno recuperarAlumno(int idAlumno){
        Alumno alumnoActual=null;

        try {
            File myObjAlum = new File("assets/alumnos.txt");
            Scanner myReader = new Scanner(myObjAlum);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] lineaAlumno = data.split("&");
                if (Integer.parseInt(lineaAlumno[0]) == idAlumno){
                    alumnoActual = new Alumno(Integer.parseInt(lineaAlumno[0]),lineaAlumno[1],lineaAlumno[2],lineaAlumno[3],lineaAlumno[4],lineaAlumno[5],lineaAlumno[6]);

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return alumnoActual;
    }

    public static void imprimirListaModulos(ArrayList<Modulo> listaModulos){

        for (int i=0; i < listaModulos.size();i++){

            System.out.println("\tAlumnos en modulo: ");

            for (int j=0;j<listaModulos.get(i).getAlumnos().size();j++){
                Alumno alumnoActual = listaModulos.get(i).getAlumnos().get(j);

                System.out.println("\t" + alumnoActual.toString());
            }

        }
    }
}