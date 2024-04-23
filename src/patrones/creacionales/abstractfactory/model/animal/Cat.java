package patrones.creacionales.abstractfactory.model.animal;

import patrones.creacionales.abstractfactory.interfac.IAnimal;

public class Cat implements IAnimal {

    @Override
    public String create() {
        return "CAT\n";
    }

    @Override
    public String sound() {
        return "MIAU\n";
    }
}
