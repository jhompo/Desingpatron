package patrones.estructurales.adapter;

import patrones.estructurales.adapter.models.Nequi;

public class AdapterNequi implements Transferencia{
    Nequi entityNequi = new Nequi();

    @Override
    public void insertCard() {
        entityNequi.insertPhoneNumber();
    }

    @Override
    public void transaccion() {
        entityNequi.traslado();
    }


}
