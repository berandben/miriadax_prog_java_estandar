package miriadax.arrayencapsulado;

import java.util.Arrays;

/**
 *
 * @author Ber&ben
 */
public class ArrayEncapsulado {

    //declaro un array con 6 posiciones
    private int[] miarray = new int[6];

    /**
     * Método para rellenar el array con un número pasado por parámetro
     *
     * @param i
     */
    public void rellenar(int i) {

        Arrays.fill(miarray, i);
    }

    /**
     * Método para rellenar el arrary con números aleatorios desde el 1 al 49,
     * no repetidos. El primer bucle rellena el array El segundo bucle (anidado)
     * comprueba si se repite algún número. Si esto ocurre devuelve true y se
     * vuelve a rellenar el array
     */
    public void rellenar() {

        boolean repetir = false;
        int aleatorio;

        for (int i = 0; i < miarray.length; i++) {

            do {

                aleatorio = (int) Math.round(Math.random() * (-1 - 49) + 49);

                repetir = false;

                for (int j = 0; j < miarray.length && !repetir; j++) {

                    if (aleatorio == miarray[j]) {
                        repetir = true;
                    } else {

                        repetir = false;
                    }

                }

            } while (repetir);

            miarray[i] = aleatorio;

        }

    }

    public void rellenar2() {

        boolean repetir;
        do {
            repetir = false;

            for (int i = 0; i < miarray.length; i++) {

                miarray[i] = (int) Math.round(Math.random() * (-1 - 49) + 49);
            }

            for (int i = 0; i < miarray.length - 1; i++) {

                for (int j = i + 1; j < miarray.length; j++) {

                    if (miarray[i] == miarray[j]) {
                        repetir = true;
                    }
                }
            }
        } while (repetir);
    }

    /**
     * Sobreescribe el método toString
     *
     * @return
     */
    @Override
    public String toString() {

        return Arrays.toString(miarray);

    }

    /**
     * Ordena el array de menor a mayor
     */
    public void ordenar() {

        Arrays.sort(miarray, 0, miarray.length);
    }

    /**
     * Getter Devuelve el array
     *
     * @return
     */
    public int[] getMiarray() {
        return miarray;
    }

    /**
     * Imprime por consola el contenido del array
     */
    public void visualizar() {

        System.out.println(Arrays.toString(miarray));

    }

}
