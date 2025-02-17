
public class Pruebas {
	
	public static void main(String[] args) {
        
        System.out.println(Utils.tipoTriangulo(3, 3, 3)); 
        System.out.println(Utils.tipoTriangulo(5, 5, 8)); 
        System.out.println(Utils.tipoTriangulo(3, 4, 5)); 
        System.out.println(Utils.tipoTriangulo(1, 2, 3)); 
        
        System.out.println(Utils.masFrecuenteInt(new int[]{4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3})); 

        System.out.println(Utils.buscarInt(new int[]{10, 20, 30, 40, 50}, 30)); 
        System.out.println(Utils.buscarInt(new int[]{10, 20, 30, 40, 50}, 60)); 
    }
}

