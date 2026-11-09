package taller6.banco;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000.0);

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);

    }
}