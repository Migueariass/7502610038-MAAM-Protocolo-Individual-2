package taller6.empleados;

class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana Pérez", 2500.0);
        Gerente ger = new Gerente("Carlos Gómez", 5000.0, "Tecnología");

        emp.mostrarInformacion();
        ger.mostrarInformacion();
    }
}