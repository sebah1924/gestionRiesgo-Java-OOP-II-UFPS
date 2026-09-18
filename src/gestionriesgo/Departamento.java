/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Departamento extends EntidadTerritorial {
    Gobernador gobernador;

    public Departamento(String nombre, String identificacion, double presupuesto, long poblacion,
            Gobernador gobernador) {
        super(nombre, identificacion, presupuesto, poblacion, null);
    }

    public void setGobernador(Gobernador gobernador) {
        super.setMandatario(gobernador);
    }
    
    
}
