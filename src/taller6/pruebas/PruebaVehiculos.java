package taller6.pruebas;

import taller6.vehiculos.Moto;
import taller6.vehiculos.Vehiculo;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Terrestre", "Yamaha");
        Moto moto = new Moto("Deportiva", "Kawasaki", 600);

        moto.mostrarDetalles();

    }
}