package taller4;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos Pérez", 20, 4.5);

        System.out.println("--- Datos del taller4.Estudiante ---");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        System.out.println("\n--- Probando Validaciones ---");
        estudiante.setEdad(-5);          // Imprime mensaje de error
        estudiante.setNotaPromedio(6.0); // Imprime mensaje de error
        estudiante.setNotaPromedio(4.8); // Modificación válida

        System.out.println("\nNota actualizada: " + estudiante.getNotaPromedio());
    }
}