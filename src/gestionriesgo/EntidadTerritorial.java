/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public abstract class EntidadTerritorial extends Entidad {

    protected long poblacion;

    public EntidadTerritorial(String nombre, String identificacion,
                              double presupuesto, long poblacion) {

        super(nombre, identificacion, presupuesto);

        this.poblacion = poblacion;
    }
}
