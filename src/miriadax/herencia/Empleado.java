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
public class Empleado extends Persona {

    //declaro los atributos
    private String idpersonal;
    private float sueldo;

    //constructor sin parámetros
    public Empleado() {
        super();
        this.idpersonal = "15";
        this.sueldo = 2500;

    }

    //constructor de objeto
    public Empleado(Empleado emp) {
        super(emp);
        //super.setNombre(emp.getNombre());
        // super.setEdad(emp.getEdad());
        // super.setDni(emp.getDni());
        //  super.setSexo(emp.getSexo());
        // super.setbCasado(emp.isbCasado());
        this.idpersonal = emp.idpersonal;
        this.sueldo = emp.sueldo;
    }

    //constructor de objeto + datos de Empleado
    public Empleado(Persona persona, String idpersonal, double sueldo) {
        super(persona);
        this.idpersonal = idpersonal;
        this.sueldo = (float) sueldo;

    }

    //constructor con todos los parámetros
    public Empleado(String idpersonal, double sueldo, String nombre, byte edad, char sexo, String dni, boolean bCasado) {
        super(nombre, edad, sexo, dni, bCasado);
        this.idpersonal = idpersonal;
        this.sueldo = (float) sueldo;
    }

    //sobreescribo el método toString
    @Override
    public String toString() {

        return super.toString() + "El id personal es  " + idpersonal + " y"
                + " el sueldo es " + sueldo;

    }

    //sobreescribo el método pintar
    @Override
    public void pintar() {

        super.pintar();
        System.out.println(" El id personal es  " + idpersonal + " y"
                + " el sueldo es " + sueldo);

    }

    //setters y getters de los atributos
    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
