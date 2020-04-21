package clases;

import java.util.Scanner;

public class SinConstructor {

    private Scanner sc = new Scanner(System.in);
    String nombre = "";

    public void pedirNombre() {
        System.out.print("Cual es tu nombre: ");
        nombre = sc.nextLine();
    }

    public void Imprimir() {
        System.out.println("Tu nombre es: " + nombre);
    }

}
