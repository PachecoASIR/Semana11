package Ejercicio2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Agenda {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;

        Perfil usuarios [] = new Perfil[2];

        try{

        for(int i=0; i<usuarios.length;i++) {

            System.out.println("Ingresa tu nombre: ");
            nombre = entrada.nextLine();

            System.out.println("Ingresa tu apellido: ");
            apellido = entrada.nextLine();

            System.out.println("Ingresa tu edad: ");
            edad = entrada.nextInt();
            entrada.nextLine();

            usuarios [i] = new Perfil(nombre,apellido,edad);
            }
        }
        catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            }

       for(int i=0; i<usuarios.length;i++){
            System.out.println("Nombre: " + usuarios[i].getNombre());
            System.out.println("Apellido: " + usuarios[i].getApellido());
            System.out.println("Edad: "+ usuarios[i].getEdad());
            System.out.println("---------------------------------------------------------");  
        }
    }
}