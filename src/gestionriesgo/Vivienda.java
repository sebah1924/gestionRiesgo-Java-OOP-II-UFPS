/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Vivienda extends Edificacion  {
   int habitantes;

    public Vivienda(int habitantes, int numeroPisos, int anioConstruccion, boolean cumpleNSR10, String direccion, EstadoInfraestructura estado) {
        super(numeroPisos, anioConstruccion, cumpleNSR10, direccion, estado);
        this.habitantes = habitantes;
    }
   
           
    
    
    
    
}
