package patrones.creacionales.singleton;

import patrones.Feature;
import patrones.creacionales.singleton.model.Conexion;

public class SingletonMain extends Feature {

    //@Override
    public void ejecutar(){
        this.SelectOption = 0;

        Conexion con = Conexion.getInstance();
        salida.setText(con.Conectar());
        salida.append(con.Desconectar());

        Show("SINGLETON");
    }

}
