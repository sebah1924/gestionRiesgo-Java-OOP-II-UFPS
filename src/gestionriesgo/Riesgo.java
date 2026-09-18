/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Riesgo {

    int nivelProbabilidad;
    int impacto;

    public Riesgo(int nivelProbabilidad, int impacto) {
        this.nivelProbabilidad = nivelProbabilidad;
        this.impacto = impacto;
    }

    public int calcularNivelRiesgo() {
        return nivelProbabilidad * impacto;
    }
}