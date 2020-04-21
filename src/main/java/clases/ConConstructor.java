package clases;

import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {

        Scanner sc = new Scanner(System.in);
        String nombre = "";

        System.out.print("cual es tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("tu nombre es: " + nombre);
    }

}
