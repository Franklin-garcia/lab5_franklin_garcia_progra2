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
public class restaurantes  extends lugar{
protected  String categoria;
protected int calificacion;
    public restaurantes() {
        super();
    }

    public restaurantes(String categoria, int calificacion, String nombre, String direccion, String entradas, String salida, int seguridad) {
        super(nombre, direccion, entradas, salida, seguridad);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
