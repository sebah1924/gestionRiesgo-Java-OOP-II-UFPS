/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public class Alcalde extends FuncionarioPublico {

public Alcalde(String nombre, String documento, int edad,
               String telefono, String identificacionFuncionario) {

    super(nombre, documento, edad, telefono,
          "Alcalde", identificacionFuncionario);
}
    public void coordinarEmergencia() {
        // Pendiente
    }

    public void declararCalamidad() {
        // Pendiente
    }
}