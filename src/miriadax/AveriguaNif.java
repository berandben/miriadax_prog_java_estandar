package miriadax;

import java.util.Scanner;

public class AveriguaNif {

    public static void main(String[] args) {

        //Declaro las variables necesarias
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int dni = 0;
        int posicion;
        boolean repetir = false;

        //Pido por teclado un número de DNI
        do {

            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Introduzca un número de DNI");

                dni = sc.nextInt();
                repetir = false;

            } catch (Exception e) {
                System.out.println("Dato incorrecto");
                repetir = true;

            }
        } while ((dni < 1000000 || dni > 99999999) || repetir);

        //Calculo la posición correspondiente
        posicion = dni % 23;

        //Imprimo el NIF      
        System.out.println("El DNI solicitado es " + dni + letras[posicion]);

    }

}
