/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_franklin_garcia_progra2;

/**
 *
 * @author Franklin Garcia
 */
public class casa extends lugar {

    public casa() {
        super();
    }

    public casa(String nombre, String direccion, String entradas, String salida, int seguridad) {
        super(nombre, direccion, entradas, salida, seguridad);
    }

    @Override
    public String toString() {
        return nombre;
    }
   
}
