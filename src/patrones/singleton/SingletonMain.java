package patrones.singleton;

import patrones.Patron;
import patrones.singleton.model.Conexion;

public class SingletonMain extends Patron {

    @Override
    public void ejecutar(){
        this.SelectOption = 0;

        Conexion con = Conexion.getInstance();
        salida.setText(con.Conectar());
        salida.append(con.Desconectar());

        Show("SINGLETON");
    }

}
