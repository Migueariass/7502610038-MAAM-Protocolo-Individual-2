package taller5.vehiculos;

public class Moto extends Vehiculo {
    public Moto(String tipo) {
        super(tipo);
    }

    public void mostrarTipo() {
        System.out.println("Tipo de Moto: " + tipo);
    }
}