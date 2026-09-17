/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Municipio extends EntidadTerritorial {

    public Municipio(String nombre, String identificacion, double presupuesto, long poblacion, Alcalde alcalde) {
        super(nombre, identificacion, presupuesto, poblacion, null);
    }
    
    public void setAlcalde(Alcalde a) {
        super.setMandatario(a);
    }
    
}
