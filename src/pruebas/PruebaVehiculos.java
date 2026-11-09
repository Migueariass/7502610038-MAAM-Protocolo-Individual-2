package taller5.pruebas;

import taller5.vehiculos.Moto;
import taller5.vehiculos.Vehiculo;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Moto moto = new Moto("Enduro");
        moto.mostrarTipo();

        // ERRORES DE COMPILACIÓN (Descomentar para probar en clase):
        // System.out.println(moto.tipo);
        // Vehiculo v = new Vehiculo("Camión");
    }
}