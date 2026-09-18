/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

import java.time.LocalDate;

/**
 *
 * @author sebah
 */
public class Desastre {
    TipoDesastre tipo;
    boolean emergenciaActiva;
    Departamento departamento;
    Municipio  municipio;
    LocalDate fecha;
     int numeroVictimas;

    public void setEmergenciaActiva(boolean emergenciaActiva) {
        this.emergenciaActiva = emergenciaActiva;
        
        
    }
     
   @Override
public String toString() {
    String estado = emergenciaActiva ? "activa" : "inactiva";
    
    return "La emergencia en " + getMunicipio().getNombre() + ", " + getDepartamento().getNombre()
         + " del " + getFecha() + " ha dejado " + getNumeroVictimas() + " víctimas. Actualmente se encuentra " + estado + ".";
}

    public TipoDesastre getTipo() {
        return tipo;
    }

    public boolean isEmergenciaActiva() {
        return emergenciaActiva;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroVictimas() {
        return numeroVictimas;
    }

    public void setTipo(TipoDesastre tipo) {
        this.tipo = tipo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNumeroVictimas(int numeroVictimas) {
        this.numeroVictimas = numeroVictimas;
    }
    
    
   
   
    
}
