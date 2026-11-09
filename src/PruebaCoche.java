public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180.0);

        System.out.println("--- Prueba de Coche ---");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Velocidad Inicial: " + miCoche.getVelocidadMaxima() + " km/h");

        // Prueba de aceleración válida e inválida
        miCoche.acelerar(20.0);
        miCoche.acelerar(-10.0);

        /*
         3. DEMOSTRACIÓN DE ERROR DE COMPILACIÓN:
         Si descomentas las siguientes líneas, Java mostrará un error de compilación
         porque los atributos son privados y no pueden accederse directamente fuera de la clase Coche.
        */
        // miCoche.marca = "Nissan";            // Error: marca has private access in Coche
        // miCoche.velocidadMaxima = 250.0;     // Error: velocidadMaxima has private access in Coche
    }
}