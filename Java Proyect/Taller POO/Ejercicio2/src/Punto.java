import java.math.MathContext;

import static java.lang.Math.*;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void cuandrante(){
        if (x > 0 && y > 0){
            System.out.println("Las cordenadas "+"x="+x+" y="+y+" se encuentran en el Cuandrante 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("Las cordenadas "+"x="+x+" y="+y+" se encuentran en el Cuandrante 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("Las cordenadas "+"x="+x+" y="+y+" se encuentran en el Cuandrante 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("Las cordenadas "+"x="+x+" y="+y+" se encuentran en el Cuandrante 4.");
        }
    }

    public void distancia(){
        double distancia = sqrt((pow((0 - x), 2) + (pow((0 - y), 2))));
        System.out.println("La distancia entre el punto"+" x= "+x+" y el punto y="+y+" hasta el origen es: "+distancia);
    }
    
}
