package patrones.estructurales.adapter.models;

import patrones.estructurales.adapter.Transferencia;

public class Bancolombia implements Transferencia {
    @Override
    public void insertCard() {
        System.out.printf("tarjeta Bancolombia");
    }

    @Override
    public void transaccion() {
        System.out.println("Transaccion Bancolombia");
    }
}
