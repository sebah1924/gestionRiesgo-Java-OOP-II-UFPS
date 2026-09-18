/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

public class AyudaHumanitaria {

    int numeroKits;
    int numeroRaciones;
    int numeroPersonasAtendidas;

    public String entregarAyuda() {
        return "Se entregaron " + numeroKits
                + " kits y " + numeroRaciones
                + " raciones de alimentos a "
                + numeroPersonasAtendidas
                + " personas afectadas.";
    }

    public int getNumeroKits() {
        return numeroKits;
    }

    public int getNumeroRaciones() {
        return numeroRaciones;
    }

    public int getNumeroPersonasAtendidas() {
        return numeroPersonasAtendidas;
    }

    public void setNumeroKits(int numeroKits) {
        this.numeroKits = numeroKits;
    }

    public void setNumeroRaciones(int numeroRaciones) {
        this.numeroRaciones = numeroRaciones;
    }
    
    
    

    public void setNumeroPersonasAtendidas(int numeroPersonasAtendidas) {
        this.numeroPersonasAtendidas = numeroPersonasAtendidas;
    }
}
