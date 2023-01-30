package patrones.singleton;

import patrones.singleton.model.Conexion;

import javax.swing.*;

public class Singletonmain {

    private static JTextArea salida = new JTextArea();
    private Singletonmain(){}
    public static void ejecutar(){
        Conexion con = Conexion.getInstance();
        salida.setText(con.Conectar());
        salida.append(con.Desconectar());

        salida.setSize(800, 800);
        JOptionPane.showMessageDialog(null,salida,"SINGLETON",JOptionPane.INFORMATION_MESSAGE);
    }

}
