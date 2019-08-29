/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miriadax.herencia;

/**
 *
 * @author Ber&ben
 */
public class PruebaPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creo objetos con el constructor vacío
        Persona persona1 = new Persona();
        Empleado empleado1 = new Empleado();

        //imprimo los resultados
        System.out.println("Imprimo el primer objeto Persona\n");

        persona1.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + persona1);

        System.out.println("\nImprimo el primer objeto Empleado\n");

        empleado1.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + empleado1);

        //creo objetos con todos los parámetros
        Persona persona2 = new Persona("Juan", (byte)8, 'M', "12345678Z", true);
        Empleado empleado2 = new Empleado("1", 1000.0, "Raquel", (byte)25, 'F', "45127896B", false);

       
        
        
        //imprimo los resultados
        System.out.println("------------");
        System.out.println("\nImprimo el segundo objeto Persona\n");

        persona2.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + persona2);

        System.out.println("\nImprimo el segundo objeto Empleado\n");

        empleado2.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + empleado2);

        //creo objetos con el constructor por objetos
        Persona persona3 = new Persona(persona2);
        Empleado empleado3 = new Empleado(empleado2);

        //imprimo los resultados
        System.out.println("------------");
        System.out.println("\nImprimo el tercer objeto Persona\n");

        persona3.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + persona3);

        System.out.println("\nImprimo el tercer objeto Empleado\n");

        empleado3.pintar();
        System.out.println("\n***Ahora usando to String*** \n" + empleado3);

        //comparo objetos de tipo Persona
        System.out.println("--------------------");
        if (persona2.equals(persona3)) {

            System.out.println("Son iguales ");
        } else {
            System.out.println("Son distintos");
        }

        //comparo objetos de tipo Empleado
        if (empleado1.equals(empleado3)) {
            System.out.println("Son iguales ");
        } else {
            System.out.println("Son distintos");

        }

    }

}
