/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia;

import Service.PersonaService;

/**
 *
 * @author clavs
 */
public class EjercicioGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService persServicios = new PersonaService();
        
        persServicios.crearPersona();
        
    }
    
}
