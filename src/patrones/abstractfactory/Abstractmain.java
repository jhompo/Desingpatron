package patrones.abstractfactory;

import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.interfac.IAnimal;
import patrones.abstractfactory.interfac.IColor;
import patrones.abstractfactory.model.AnimalFactory;
import patrones.abstractfactory.model.ColorFactory;
import patrones.abstractfactory.model.Factory;
import patrones.abstractfactory.model.NullFactory;
import patrones.factory.interfac.IConexion;
import patrones.factory.model.FactoryDB;

import javax.swing.*;

public class Abstractmain {

    private static JTextArea salida = new JTextArea();
    private Abstractmain(){}
    public static void ejecutar(){

        Factory fabrics = new Factory();
        AbstractFactory obj = fabrics.getInstance("Animal");
        IAnimal anim = obj.createAnimal("Cat");
        salida.append( "ANIMAL:"+anim.create());
        salida.append( anim.sound());

        obj = fabrics.getInstance("Color");
        IColor color = obj.createColor("Black");
        salida.append("\nCOLOR:" +color.getColor());

        salida.setSize(800, 800);
        JOptionPane.showMessageDialog(null,salida,"ABSTRACT FACTORY",JOptionPane.INFORMATION_MESSAGE);

    }

}
