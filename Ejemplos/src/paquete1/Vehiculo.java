/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String n, String m, double val) {
        tipo = n;
        matricula = m;
        valor = val;
    }

    public void establecerTipo(String m) {
        tipo = m;
    }

    public void establecerMatricula(String m) {
        matricula = m;
    }

    public void establecerValor(double m) {
        valor = m;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }

}
