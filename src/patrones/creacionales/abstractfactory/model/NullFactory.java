package patrones.creacionales.abstractfactory.model;

import patrones.creacionales.abstractfactory.interfac.IAnimal;
import patrones.creacionales.abstractfactory.interfac.IColor;

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
