package miriadax;
/**
 *
 * @author Ber&ben
 */

public class PruebaPunto1 {

    public static void main(String[] args) {

        //genero un número aleatorio entre 1 y 20
        int aleatorio = Punto.generaAleatorio(1, 20);

        //Creo e imprimo un punto con el constructor sin parámetros
        Punto punto1 = new Punto();
        punto1.pintar();

        //Creo e imprimo un punto con valores introducidos como parámetros
        Punto punto2 = new Punto(5, 2);
        punto2.pintar();

        //Creo e imprimo un punto con los valores del objeto anterior
        Punto punto3 = new Punto(punto2);
        punto3.pintar();

        //Muestro el número de puntos que se van a generar
        System.out.println("\nSe generaran " + aleatorio + " puntos \n");

        /*Creo un array multidimensional, donde las filas serán el número
        aleatorio y las columnas serán 2 (X,Y)*/
        int[][] arrayPuntos = new int[aleatorio][2];

        /*Con un bucle for anidado recorro cada fila
        con (arrayPuntos.length) y cada columna
        con (arrayPuntos.[0].lenght-1)*/
        for (int i = 0; i < arrayPuntos.length; i++) {

            for (int j = 0; j < arrayPuntos[0].length; j++) {
                //En cada posición introduzco un número aleatorio de 0 a 100
                arrayPuntos[i][j] = Punto.generaAleatorio(0, 100);
                /*Con un condicional imprimo los puntos generados insertando un salto 
                de línea cuando se acabe se recorrer la fila*/
                if (j == (arrayPuntos[0].length) - 1) {

                    System.out.println("Y = " + arrayPuntos[i][j]);

                } else {

                    System.out.print(" Punto " + (i + 1) + " ==> X = " + arrayPuntos[i][j] + " ");
                }

            }

        }

    }

}
