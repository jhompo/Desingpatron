package patrones.abstractfactory.model;

import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.interfac.IAnimal;
import patrones.abstractfactory.interfac.IColor;

public class NullFactory implements IAnimal,IColor {


    @Override
    public String create() {
        return null;
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
