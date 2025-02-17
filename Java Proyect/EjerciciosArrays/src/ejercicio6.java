public class ejercicio6 {
    public static void main(String[] args) {
    int[] nums = {1,2,3,7,4,5,6,7};
        System.out.println("El numero maximo de consecutivos es: " + maximoIntConsecutivos(nums));

    }

    public static int maximoIntConsecutivos(int[] nums){

        int consecutivos = 1;
        int maxConsecutivos = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                maxConsecutivos++;
            } else {
                if(maxConsecutivos > consecutivos) {
                    consecutivos = maxConsecutivos;
                }
                maxConsecutivos=1;
            }
        }
        if (maxConsecutivos > consecutivos) {
            consecutivos = maxConsecutivos;
        }
        return consecutivos;
        }

    }