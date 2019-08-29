/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miriadax;

/**
 *
 * @author Ber&ben
 */
public class NumeroAleatorio
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

        //Genero un número de veces a iterar
        int aleatorio = (int) (Math.round(Math.random() * (1 - 20) + 20));
        //Imprimo ese número
        System.out.println("Se generarán " + aleatorio + " número/s");

        //Creo un bucle para generar tantos números como se indicó anteriormente
        for (int i = 1; i <= aleatorio; i++) {

            int numero = (int) (Math.round(Math.random() * (18 - 65) + 65));
            System.out.println("Número " + i + " " + numero);
        }

    }

}
