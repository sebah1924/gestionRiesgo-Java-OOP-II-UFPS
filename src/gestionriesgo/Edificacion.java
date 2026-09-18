/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Edificacion extends Infraestructura {
int numeroPisos;
int anioConstruccion;
boolean cumpleNSR10;


    public Edificacion(int numeroPisos, int anioConstruccion, boolean cumpleNSR10, String  direccion, EstadoInfraestructura estado) {
        super(direccion, estado);
        this.numeroPisos = numeroPisos;
        this.anioConstruccion = anioConstruccion;
        this.cumpleNSR10 = cumpleNSR10;
    }
    

    }

    
    
    
    
    
    

