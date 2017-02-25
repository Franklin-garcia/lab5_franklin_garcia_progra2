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
public class carreteras {
    protected int numero;
    protected int kilometros;
    protected String inicio, c_final;

    public carreteras() {
        super();
    }

    public carreteras(int numero, int kilometros, String inicio, String c_final) {
        this.numero = numero;
        this.kilometros = kilometros;
        this.inicio = inicio;
        this.c_final = c_final;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getC_final() {
        return c_final;
    }

    public void setC_final(String c_final) {
        this.c_final = c_final;
    }

    @Override
    public String toString() {
        return Integer.toString(numero);
    }

    
}
