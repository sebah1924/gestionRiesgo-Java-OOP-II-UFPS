/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public abstract class Entidad {

    protected String nombre;
    protected String identificacion;
    protected double presupuesto;

    public Entidad(String nombre, String identificacion, double presupuesto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.presupuesto = presupuesto;
    }
}
