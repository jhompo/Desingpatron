package patrones.abstractfactory;

import patrones.Feature;
import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.interfac.IAnimal;
import patrones.abstractfactory.interfac.IColor;
import patrones.abstractfactory.model.Factory;

public class AbstractFactoryMain extends Feature {

    public void ejecutar(){
        this.SelectOption = 2;

        Factory fabrics = new Factory();
        AbstractFactory obj = fabrics.getInstance("Animal");
        IAnimal anim = obj.createAnimal("Cat");
        salida.append( "ANIMAL:"+anim.create());
        salida.append( anim.sound());

        obj = fabrics.getInstance("Color");
        IColor color = obj.createColor("Black");
        salida.append("\nCOLOR:" +color.getColor());

        Show("ABSTRACT FACTORY");
    }

}
