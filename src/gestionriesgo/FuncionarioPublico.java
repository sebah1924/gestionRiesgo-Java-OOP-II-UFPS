/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionriesgo;

/**
 *
 * @author sebah
 */
public abstract class FuncionarioPublico extends Persona {


protected String cargo;
protected String identificacionFuncionario;

public FuncionarioPublico(String nombre, String documento, int edad,
                          String telefono, String cargo,
                          String identificacionFuncionario) {

    super(nombre, documento, edad, telefono);

    this.cargo = cargo;
    this.identificacionFuncionario = identificacionFuncionario;
}


}

