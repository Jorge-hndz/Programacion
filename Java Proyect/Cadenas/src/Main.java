import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class Main {
        static String vector[] = {
                "Ahora", "es", "el ", "momento", "de", "actuar"
        };

        public static void main(String args[])  {
            for (int j = 0; j < vector.length; j++) {
                for (int i = j + 1; i < vector.length; i++) {
                    if (vector[i].compareTo(vector[j]) < 0) {
                        String aux = vector[j];
                        vector[j] = vector[i];
                        vector[i] = aux;
                    }
                }
                System.out.println(vector[j]);
            }
        }
    }
