public class ejercicio11 {
    public static void main(String[] args) {
        int lado = 4;

        int [][] matriz = secuenciaNaturalIntC(lado);
        mostrarMatriz(matriz);

    }
    public static int[][] secuenciaNaturalIntA(int lado){
        int [][] matriz = new int[4][4];
        int x = 1;
        for (int i = 0; i < lado;i++){
            for (int j = 0; j < lado;j++) {
                matriz[j][i] = x++;
            }
        }
        return matriz;
    }

    public static int[][] secuenciaNaturalIntB(int lado){
        int [][] matriz = new int[4][4];
        int x = 1;
        for (int i = 0; i < lado;i++){
            if (i % 2 == 0) {
                for (int j = 0; j < lado;j++) {
                    matriz[j][i] = x++;
                }
            } else {
                for (int z = 3; z >= 0;z--) {
                    matriz[z][i] = x++;
                }
            }

        }
        return matriz;
    }

    public static int[][] secuenciaNaturalIntC(int lado){
        int [][] matriz = new int[4][4];
        int valor = 1,i,j,pasada;

        for(pasada=0;pasada<matriz.length;pasada++){
            for(i=matriz.length-1-pasada,j=0;i<matriz.length;i++,j++){
                matriz[i][j]=valor;
                valor++;
            }
        }

        for(pasada=matriz.length-1;pasada>0;pasada--){
            for(i=matriz.length-pasada,j=0;i<matriz.length;i++,j++){
                matriz[j][i]=valor;
                valor++;
            }
        }

        return matriz;
    }


    public static int mostrarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }

}
