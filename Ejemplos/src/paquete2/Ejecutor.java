/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/*import paquete1.*;*/
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(10000);
        Edificio edf2 = new Edificio("Edificio Sur");
        edf2.establecerCostos(20000);
        Edificio edf3 = new Edificio("Edificio Norte");
        edf3.establecerCostos(30000);
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(20000);
        Edificio[] edificios = {edf1, edf2, edf3, edf4};
        
        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        Vehiculo[] autos = {v1, v2, v3, v4, v5};
        

 
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa De Hojas");
        miempresa.establecerEdificios(edificios);
        miempresa.estableceVehiculos(autos);
        miempresa.establecerCostoBienesInmueblesAutos();
        miempresa.establecerCostoBienesInmuebles();
        

        
        System.out.println(miempresa);

    }
}
