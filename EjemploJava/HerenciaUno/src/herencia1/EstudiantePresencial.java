package herencia1;

public class EstudiantePresencial extends Estudiante {

    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\nApellido: %s\n"
                + "Identificacion: %s\nEdad: %d\nNumero De Creditos: %d\n"
                + "Costo De Creditos: %.2f\nMatricula Presencial: %.1f\n",
                obtenerNombresEstudiante(),
                apellidosEstudiante,
                obtenerIdentificacionEstudiante(),
                obtenerEdadEstudiante(),
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        return reporte;
    }
}