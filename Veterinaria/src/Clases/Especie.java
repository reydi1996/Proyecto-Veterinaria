/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author  ROLANDO_GUADALUPE
 */
public enum Especie {
     aves(""),
     Mamiferos("");
     
     private final String Nombre;
     
     private Especie (String Nombre){
         this.Nombre = Nombre;
     }

    public String getNombre() {
        return Nombre;
    }
     
     
     
     
    }
