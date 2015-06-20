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
public enum Clientes {
    profesor("profesor"),
    abogado("abogado"),
    ingeniero("ingeniero"),
    doctor("doctor"),
    Psicologo("Psicologo"),
    empresario("empresario"),
    administrador("administrador"),
    contador("contador");

   
    
    private final String nombre;

    private Clientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
