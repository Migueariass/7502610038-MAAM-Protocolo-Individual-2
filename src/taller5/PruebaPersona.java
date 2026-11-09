package taller5;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 20);

        System.out.println("Edad (acceso directo default): " + p.edad);
        System.out.println("Nombre (acceso por getter): " + p.getNombre());

        // ERROR DE COMPILACIÓN (Descomentar para probar en clase):
        // System.out.println(p.nombre);
    }
}