/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Object.Persona;

/**
 *
 * @author clavs
 */
public class PersonaService {
    
    public void mostrarNombre(){
        System.out.println();
    }
    
    public void crearPersona(){
        Persona persona1 = new Persona();
        persona1.setNombre("Joaquin Rego");
        System.out.println(persona1.getNombre());
    }
    
}
