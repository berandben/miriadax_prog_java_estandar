package miriadax;

/**
 *
 * @author Ber&ben
 */
public class Punto {

    /*declaro los 2 atributos (X,Y)
    y un atributo estático llamado aleatorio
    para el método generaAleatorio*/
    private int x;
    private int y;
    private static int aleatorio;

    //constructor sin parámetros
    public Punto() {

        this.x = 3;
        this.y = 8;

    }

    //constructor con 2 enteros
    public Punto(int x, int y) {

        this.x = x;
        this.y = y;

    }

    //constructor con otro punto existente
    public Punto(Punto obj) {
        this.x = obj.x;
        this.y = obj.y;

    }
    
      //Metódos set para X e Y
    public void setX(int x) {

        this.x = x;

    }

    public void setY(int y) {

        this.y = y;
    }

    //Métodos get para X e Y
    public int getX() {

        return this.x;

    }

    public int getY() {

        return this.y;
    }


    //método pintar que muestra las coordenadas
    public void pintar() {

        System.out.println("La coordenada X vale " + getX() + " y la "
                + "coordenada Y vale " + getY());

    }

    /*método estático que genera un número aleatorio según el mínimo 
    y máximo introducido como parámetro*/
    public static int generaAleatorio(int minimo, int maximo) {

        aleatorio = (int) (Math.round(Math.random() * (minimo - maximo) + maximo));

        return aleatorio;
    }

  
}
