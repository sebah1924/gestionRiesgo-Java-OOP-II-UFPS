/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */


public class EvaluacionDanos {

    int viviendasDestruidas;
    int viviendasAfectadas;
    int infraestructuraAfectada;

    public String evaluarDanos() {
        return "Se registraron " + viviendasDestruidas
                + " viviendas destruidas, "
                + viviendasAfectadas
                + " viviendas afectadas y "
                + infraestructuraAfectada
                + " infraestructuras afectadas.";
    }

    public int getViviendasDestruidas() {
        return viviendasDestruidas;
    }

    public int getViviendasAfectadas() {
        return viviendasAfectadas;
    }

    public int getInfraestructuraAfectada() {
        return infraestructuraAfectada;
    }

    public void setViviendasDestruidas(int viviendasDestruidas) {
        this.viviendasDestruidas = viviendasDestruidas;
    }

    public void setViviendasAfectadas(int viviendasAfectadas) {
        this.viviendasAfectadas = viviendasAfectadas;
    }

    public void setInfraestructuraAfectada(int infraestructuraAfectada) {
        this.infraestructuraAfectada = infraestructuraAfectada;
    }
}