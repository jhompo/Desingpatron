package patrones.estructurales.adapter;

public class Main {
    public static void main(String[] args){

        Transferencia t1 = new AdapterNequi();
        t1.insertCard();
        t1.transaccion();

    }
}
