import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        boolean valorOk = false; //Variable de control para evitar introducir valores no solicitados
        while (!valorOk) {
            try {
                valorOk = true;
            System.out.println("Introduce un valor entero");
                valor = entrada.nextInt();
            } 
            catch (InputMismatchException ex) {
                valorOk = false;
                ex.printStackTrace();
            System.out.println(ex.getMessage());
                entrada.next(); //Para "limpiar" la entrada, ya que el valor introducido sigue "almacenado" en ella
            }
        }
        System.out.println("El valor introducido y sin errores es " + valor);
    }
}