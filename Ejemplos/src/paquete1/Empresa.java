/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;
    private double costoBienesInmueblesAutos;
    private Vehiculo[] autos;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void estableceVehiculos(Vehiculo[] m) {
        autos = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();

        }
        costoBienesInmuebles = suma;

    }

    public void establecerCostoBienesInmueblesAutos() {
        double suma = 0;
        for (int i = 0; i < autos.length; i++) {
            suma = suma + autos[i].obtenerValor();

        }
        costoBienesInmueblesAutos = suma;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculo[] obtenerVehiculo() {
        return autos;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoBienesInmueblesAutos() {
        return costoBienesInmueblesAutos;
    }

    @Override
    public String toString() {

        String reporte = String.format("%s\nLista De Edificios\n",
                obtenerNombre());

        for (int i = 0; i < obtenerEdificios().length; i++) {
            reporte = String.format("%s%d. %s(%.1f)\n",
                    reporte,
                    i + 1,
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        reporte = String.format("%sCosto De Los Bienes Inmuebles: %.2f\n",
                reporte,
                costoBienesInmuebles);
        
        reporte = String.format("%s\nLista De Autos\n",
                reporte);
        
        for (int i = 0; i < obtenerVehiculo().length; i++) {
            reporte = String.format("%s%d. %s - %s(%.1f)\n",
                    reporte,
                    i + 1,
                    obtenerVehiculo()[i].obtenerTipo(),
                    obtenerVehiculo()[i].obtenerMatricula(),
                    obtenerVehiculo()[i].obtenerValor());
        }

        return reporte;

    }
}
