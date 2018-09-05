/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

/**
 *
 * @author Antonella
 */
public abstract class Persona {
    public Persona(String nom){
        this.nombre=nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String dameDescripcion();
    
    
    private String nombre;
}




