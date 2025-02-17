import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> coordenadasFile = new ArrayList<String>();
        ArrayList <Coordenada> coordenadasLista = new ArrayList<>();
        double distanciaTotal = 0;

        try {
            File myObj = new File("./assets/coordenadas.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] coordenadaActual=data.split(",");

                double x = Double.parseDouble(coordenadaActual[0]);
                double y = Double.parseDouble(coordenadaActual[1]);

                coordenadasLista.add(new Coordenada(x,y));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for(int i = 0; i<coordenadasLista.size()-1;i++){
            double distancia = sqrt(pow((coordenadasLista.get(i+1).getX()-coordenadasLista.get(i).getX()),2.0)+pow((coordenadasLista.get(i+1).getY()-coordenadasLista.get(i).getY()),2.0));
            distanciaTotal = distanciaTotal + distancia;

            System.out.println("La distancia entre el punto: " + coordenadasLista.get(i).toString() + "y el punto: " + coordenadasLista.get(i+1).toString() + "--->" + distancia);

        }
        System.out.println("La distancia total es: " + distanciaTotal);
    }
}