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
public class lugar {
   // un nombre, dirección, nivel de seguridad(valor numérico), varias carreteras de entrada y una sola carretera de salida;
    protected String nombre,direccion,entradas,salida;
    protected int seguridad;

    public lugar() {
    }

    public lugar(String nombre, String direccion, String entradas, String salida, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.entradas = entradas;
        this.salida = salida;
        this.seguridad = seguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
