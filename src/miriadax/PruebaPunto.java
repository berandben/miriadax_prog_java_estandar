package miriadax;

/**
 *
 * @author Ber&ben
 */
public class PruebaPunto {

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
        System.out.println("\nSe generará/n " + aleatorio + " punto/s \n");

        /*Creo un array de la clase Punto con tantas posiciones
        como el valor de aleatorio*/
        Punto [] puntoArray = new Punto[aleatorio];

        /*Con un bucle for recorro el largo del array
        y genero un valor entre 0 y 100 que introduzco en las
        coordenadas coordX y coorY, que después paso por el constructor
        para crear los objetos en las posiciones del array
        Por último imprimo todos los puntos creados*/
        for (int i = 0; i < puntoArray.length; i++) {

            int coordX = Punto.generaAleatorio(0, 100);
            int coordY = Punto.generaAleatorio(0, 100);
            puntoArray[i] = new Punto(coordX, coordY);
            puntoArray[i].pintar();

        }

    }

}
