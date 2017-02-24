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
public class canchas extends lugar{
   protected String categoria;
   protected String estado;

    public canchas() {
        super();
    }

    public canchas(String categoria, String estado, String nombre, String direccion, String entradas, String salida, int seguridad) {
        super(nombre, direccion, entradas, salida, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
