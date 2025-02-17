
public class cuadrado{
	public static void main(String[] args) {
	
	for (int x = 0; x < 8; x++)

		if(x % 2 == 0){
			for (int i = 0; i < 8; i++) {
  				System.out.print("* ");
			}
		System.out.println();
		} else {
			for (int i = 0; i < 8; i++) {
  			System.out.print(" *");
  			}
  		System.out.println();
		}
	}
}
