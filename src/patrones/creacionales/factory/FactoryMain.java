package patrones.creacionales.factory;

import patrones.Feature;
import patrones.creacionales.factory.model.FactoryDB;
import patrones.creacionales.factory.interfac.IConexion;

public class FactoryMain extends Feature {

    public void ejecutar(){
        this.SelectOption = 1;

        FactoryDB fabrica = new FactoryDB();
        IConexion producto = fabrica.getInstancia("Dynamo");
        salida.setText(producto.Conectar());
        salida.append(producto.Desconectar());

        producto = fabrica.getInstancia("Mysql");
        salida.append("\n\n"+producto.Conectar());
        salida.append(producto.Desconectar());

        Show("FACTORY METHOD");
    }

}
