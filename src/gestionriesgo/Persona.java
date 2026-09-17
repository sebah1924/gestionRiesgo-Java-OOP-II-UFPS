/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public abstract class Persona {

    protected String nombre;
    protected String documento;
    protected int edad;
    protected String telefono;

    public Persona(String nombre, String documento, int edad, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
    }
}
