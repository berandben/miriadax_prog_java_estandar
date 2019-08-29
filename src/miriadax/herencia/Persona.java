/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miriadax.herencia;

import java.util.Objects;

/**
 *
 * @author Ber&ben
 */
public class Persona {
    
    //declaración de atributos
    private String nombre;
    private byte edad;
    private char sexo;
    private String dni;
    private boolean bCasado;
    

    
    //constructor sin parámetros
    public Persona(){
        
        this.nombre="Paco";
        this.edad=(byte)60;
        this.sexo='H';
        this.dni="1234567998";
        this.bCasado=true;
    
    }
    
   
   
    
    //constructor de objeto
    public Persona(Persona persona){
    
        this.nombre=persona.nombre;
        this.edad=persona.edad;
        this.sexo=persona.sexo;
        this.dni=persona.dni;
        this.bCasado=persona.bCasado;
     
    }
   
  


    //constructor con parámetros
    /*he tenido que declar edad como int y después castearlo a byte para que no
    se perdiera información*/
    public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.bCasado = bCasado;
    }
    
    //sobreescribo el método toString
    @Override
    public String toString(){
    
        return "Nombre "+ nombre + " Edad " + edad + " Sexo " + sexo + " Dni " + dni + " Casado: " + bCasado;
    
    }

    //sobreescribo el método hashCode (generado por NetBeans)
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + this.sexo;
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + (this.bCasado ? 1 : 0);
        
        return hash;
    }
    
    //sobreescribo el método equals (generado por NetBeans)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.bCasado != other.bCasado) {
            return false;
        }

        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    
    
    //método pintar que imprime  los valores
    public void pintar(){
    
        System.out.println("Nombre "+ nombre + " Edad " + edad + " Sexo " + sexo + " Dni " + dni + " Casado: " + bCasado);
    
    
    }    
   
    
    //setters y getters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isbCasado() {
        return bCasado;
    }

    public void setbCasado(boolean bCasado) {
        this.bCasado = bCasado;
    }
    
}
