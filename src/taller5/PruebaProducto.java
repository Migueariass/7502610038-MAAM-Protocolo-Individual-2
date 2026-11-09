package taller5.paquete_producto;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado Mecánico", 45.0, 15);
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Precio: $" + p.precio);
        System.out.println("Stock: " + p.stock);
        p.mostrarInfo();
    }
}