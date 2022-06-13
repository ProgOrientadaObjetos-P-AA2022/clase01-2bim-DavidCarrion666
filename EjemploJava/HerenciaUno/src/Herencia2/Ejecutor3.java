/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion;

        System.out.println("A continuacion se va a elegir un tipo de Estudiante");
        System.out.println("Ingrese 1 para crear un estudiante a distancia, "
                + "Ingrese 2 para crear un estudiante Presencial");
        opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1 || opcion == 2) {

            System.out.println("Ingrese el nombre Del Estudiante");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la identificacion del estudiante");
            String identificacion = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            int edad = sc.nextInt();
            System.out.println("---------------------------------------------");

            switch (opcion) {
                case 1:
                    estudianteDistancia(nombre, apellido, identificacion, edad);
                    break;
                case 2:
                    estudiantePresencial(nombre, apellido, identificacion, edad);
                    break;
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }

    public static void estudianteDistancia(String nombre, String apellido,
            String identificacion, int edad) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudianteDistancia estudiante = new EstudianteDistancia();

        System.out.println("Ingrese el numero de asignaturas");
        int numeroAsignaturas = sc.nextInt();
        System.out.println("Ingrese el costo de las asignaturas");
        double costoAsignaturas = sc.nextDouble();

        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroAsginaturas(numeroAsignaturas);
        estudiante.establecerCostoAsignatura(costoAsignaturas);
        estudiante.calcularMatriculaDistancia();

        System.out.println("--------------------------------------------------");
        System.out.printf("%s\n", estudiante);
    }

    public static void estudiantePresencial(String nombre, String apellido,
            String identificacion, int edad) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();

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
