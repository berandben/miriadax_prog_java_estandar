package miriadax.arrayencapsulado;

import java.util.Arrays;

/**
 *
 * @author Ber&ben
 */
public class TestArrayEncapsulado {


    public static void main(String[] args) {
        // TODO code application logic here

        //Creo un objeto de la clase ArrayEncapsulado
        ArrayEncapsulado objarray = new ArrayEncapsulado();

        //Relleno el array con el número 7
        objarray.rellenar(7);
        //Visualizo el array
        objarray.visualizar();
        //Visualizo el array con el método toString
        System.out.println(objarray.toString());
        //Visualizo el array usando el getter
        System.out.println(Arrays.toString(objarray.getMiarray()));
        //Visualizo el array con un bucle
        for (int i = 0; i < objarray.getMiarray().length; i++) {

            System.out.print(objarray.getMiarray()[i]+ " ");

        }
        System.out.println("\n\nNuevo Array Aleatorio \n");

        //Relleno el array con números aleatorios
        objarray.rellenar();
        //Ordeno el array
        objarray.ordenar();
        //Visualizo de nuevo el array
        objarray.visualizar();

    }

}
