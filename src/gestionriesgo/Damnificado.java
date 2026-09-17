/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Damnificado extends Persona {

    private String direccion;
    private EstadoDamnificado estado;

    public Damnificado(String nombre, String documento, int edad,
                     String telefono, String direccion) {

        super(nombre, documento, edad, telefono);

        this.direccion = direccion;
        this.estado = EstadoDamnificado.NORMAL;
    }
}
