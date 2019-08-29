/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miriadax.herencia;

import java.util.ArrayList;

/**
 *
 * @author Ber&ben
 */
public class ProgramaPersona {

    public static void main(String[] args) {

        ArrayList<Persona> arraydepersona = new ArrayList<Persona>();

    

        for (int i = 0; i < 20; i++) {

          int aleatorio = (int) Math.round(Math.random() * (1 - 4) + 4);

            if (aleatorio == 2 || aleatorio == 4) {

                arraydepersona.add(new Obrero());

          } else if (aleatorio == 1 || aleatorio == 3) {

               arraydepersona.add(new Tecnico());

           }
        }

    arraydepersona.trimToSize();

    System.out.println(arraydepersona.size());

    for(int i = 0;i<arraydepersona.size ();i++){
    
        System.out.println(i + " " + arraydepersona.get(i));

    }

}

}
