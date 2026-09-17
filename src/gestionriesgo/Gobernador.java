/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Gobernador extends FuncionarioPublico {
    Departamento departamento;

    public Gobernador(String nombre, String documento, int edad,
                      String telefono, String identificacionFuncionario, Departamento departamento) {
    
         
        
        super(nombre, documento, edad, telefono,
              "Gobernador", identificacionFuncionario, departamento);
        
        this.departamento=departamento;
    }

    public void coordinarDepartamento() {
       
    }

    public void declararCalamidad() {
      
    }
}