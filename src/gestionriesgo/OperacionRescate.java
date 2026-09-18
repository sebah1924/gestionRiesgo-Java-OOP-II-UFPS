/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

public class OperacionRescate {

    int numeroRescatistas;
    int personasRescatadas;
    int duracionHoras;
    boolean activa;

    public void iniciar() {
        activa = true;
    }

    public void finalizar() {
        activa = false;
    }

    public String ejecutarRescate() {
        String estado = activa ? "activa" : "finalizada";

        return "La operación de rescate está " + estado
                + ", cuenta con " + numeroRescatistas
                + " rescatistas y ha permitido rescatar a "
                + personasRescatadas + " personas.";
    }

    public int getNumeroRescatistas() {
        return numeroRescatistas;
    }

    public int getPersonasRescatadas() {
        return personasRescatadas;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setNumeroRescatistas(int numeroRescatistas) {
        this.numeroRescatistas = numeroRescatistas;
    }

    public void setPersonasRescatadas(int personasRescatadas) {
        this.personasRescatadas = personasRescatadas;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
}
