import java.io.File;
import java.util.Scanner;

public class Sesion {

  public static boolean login(String username, String password) {
    if (username.trim().isEmpty() || password.trim().isEmpty()) {
      return false;
    }

    try {
      File myObj = new File("./assets/usuarios.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        String line = myReader.nextLine();
        String[] fields = line.split("#");

        if (fields[0].equals(username) && fields[1].equals(password)) {
          myReader.close();
          return true;
        }
      }
      myReader.close();
    } catch (Exception e) {
      System.out.println("Error al abrir el archivo: " + e.getMessage());
    }
    return false;
  }

  public static void main(String[] args) {

  }
}
