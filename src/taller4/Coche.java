package taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima > 0 ? velocidadMaxima : 0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Acelerando... Nueva velocidad máxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento debe ser un valor positivo.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}