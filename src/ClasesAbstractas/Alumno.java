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
public class Alumno extends Persona{
    
    
    public Alumno(String nom, String carr){
        super(nom);
        carrera=carr;
    }

    public String dameDescripcion(){
        return  "Carrera: "+carrera;
    }
    
    
    private String carrera;
}
