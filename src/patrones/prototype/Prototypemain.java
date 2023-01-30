package patrones.prototype;

import patrones.prototype.interfac.IProducto;
import patrones.prototype.model.Tv;
import patrones.singleton.model.Conexion;

import javax.swing.*;

public class Prototypemain {

    private static JTextArea salida = new JTextArea();
    private Prototypemain(){}
    public static void ejecutar(){
        Tv productTV1  = new Tv();
        productTV1.setSerial("serial1111");

        /**se puede clonar tantos producto se necesiten,
        solo modificamos el serial por que los otros
        atributos serian lo mismo*/
        Tv prductTV2  =    (Tv) productTV1.clonar();
        prductTV2.setSerial("serial2222");

        salida.setText(productTV1.show());
        salida.append("\n\n"+prductTV2.show());

        salida.setSize(800, 800);
        JOptionPane.showMessageDialog(null,salida,"SINGLETON",JOptionPane.INFORMATION_MESSAGE);
    }
}
