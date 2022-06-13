/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear un objeto de tipo Estudiante Presencial con datos por teclado

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();

        System.out.println("Ingrese el nombre Del Estudiante");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del estudiante");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la identificacion del estudiante");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de creditos del estudiante");
        int numeroCreditos = sc.nextInt();
        System.out.println("Ingrese el costo de los creditos del estudiante");
        double costoCreditos = sc.nextDouble();

        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(numeroCreditos);
        estudiante.establecerCostoCredito(costoCreditos);
        estudiante.calcularMatriculaPresencial();
        
        System.out.println("--------------------------------------------------");
        System.out.printf("%s\n", estudiante);

    }
}
