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
public class Cliente {
    String profesor;
    String abogado;
    String ingeniero;
    String doctor;
    String Psicologo;
    String empresario;
    String administrador;
    String contador;

    public Cliente(String profesor, String abogado, String ingeniero, String doctor, String Psicologo, String empresario, String administrador, String contador) {
        this.profesor = profesor;
        this.abogado = abogado;
        this.ingeniero = ingeniero;
        this.doctor = doctor;
        this.Psicologo = Psicologo;
        this.empresario = empresario;
        this.administrador = administrador;
        this.contador = contador;
    }

    
    
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setAbogado(String abogado) {
        this.abogado = abogado;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setPsicologo(String Psicologo) {
        this.Psicologo = Psicologo;
    }

    public void setEmpresario(String empresario) {
        this.empresario = empresario;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    
    
    public String getProfesor() {
        return profesor;
    }

    public String getAbogado() {
        return abogado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getPsicologo() {
        return Psicologo;
    }

    public String getEmpresario() {
        return empresario;
    }

    public String getAdministrador() {
        return administrador;
    }

    public String getContador() {
        return contador;
    }
    
    
}
