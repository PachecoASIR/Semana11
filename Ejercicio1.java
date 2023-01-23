import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int edad = 0;
                try {
                    System.out.println("Introduce tu nombre:");
                    nombre = entrada.next();
                    }
                catch (InputMismatchException ex) {
                    ex.printStackTrace();
                    System.out.println(ex.getMessage());
                    }
                try {
                    System.out.println("Introduce tu apellido:");
                    apellido = entrada.next();
                }
                catch (InputMismatchException ex) {
                    ex.printStackTrace();
                    System.out.println(ex.getMessage());
                    }
                try {
                    System.out.println("Introduce tu edad:");
                    edad = entrada.nextInt();
                }
                catch (InputMismatchException ex) {
                    ex.printStackTrace();
                    System.out.println(ex.getMessage());
                    }
                finally {
                    System.out.println("Tu nombre es " + nombre);
                    System.out.println("Tu apellido es " + apellido);
                    System.out.println("Tu edad es " + edad);
                }
            }
        }