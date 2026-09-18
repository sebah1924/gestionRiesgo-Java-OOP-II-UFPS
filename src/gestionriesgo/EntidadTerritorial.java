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
    protected FuncionarioPublico mandatario;

    public EntidadTerritorial(String nombre, String identificacion,
                              double presupuesto, long poblacion,FuncionarioPublico mandatario ) {

        super(nombre, identificacion, presupuesto);
 
        this.poblacion = poblacion;
        this.mandatario=mandatario;
    }
     public void setMandatario(FuncionarioPublico mandatario) {
        this.mandatario = mandatario;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public FuncionarioPublico getMandatario() {
        return mandatario;
    }
    
     
    
}
