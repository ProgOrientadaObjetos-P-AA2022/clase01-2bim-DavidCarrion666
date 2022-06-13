/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        // 1. Crear un objeto de nombre Estudiante Distancia
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("David Ernesto");
        estudiante.establecerApellidoEstudiante("Carrion Acosta");
        estudiante.establecerIdentificacionEstudiante("1105023517");
        estudiante.establecerEdadEstudiante(19);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("%s - (%.2f)\n", 
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
        */
        
        System.out.printf("%s\n", estudiante);
    }
    
}
