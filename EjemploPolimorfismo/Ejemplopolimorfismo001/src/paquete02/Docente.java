/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

public abstract class Docente {
    private String nombre;
    private double sueldo;
    
    public Docente(String n){
        nombre = n;
    }
    
    public void establecerDocente(String n){
        nombre = n;
    }
    
    public String obtenerDocente(){
        return nombre;
    }
    
    /*public abstract void establecerSueldo(double d){
        sueldo = d;
    }
    
    // Aparece un error en el método abstracto, ya que
    // no puede ser implementado, únicamente se puede declarar*/
    
    public abstract void establecerSueldo(double d);
    
    // Se declara la clase abstracta y ya desaparecerá el error
}
