package patrones.factory;

import patrones.factory.model.FactoryDB;
import patrones.factory.interfac.IConexion;

import javax.swing.*;

public class Factorymain {

    private static JTextArea salida = new JTextArea();
    private Factorymain(){}
    public static void ejecutar(){

        FactoryDB fabrica = new FactoryDB();
        IConexion producto = fabrica.getInstancia("Dynamo");
        salida.setText(producto.Conectar());
        salida.append(producto.Desconectar());

        producto = fabrica.getInstancia("Mysql");
        salida.append("\n\n"+producto.Conectar());
        salida.append(producto.Desconectar());

        salida.setSize(800, 800);
        JOptionPane.showMessageDialog(null,salida,"FACTORY METHOD",JOptionPane.INFORMATION_MESSAGE);
    }

}
