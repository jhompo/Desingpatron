package patrones.creacionales.abstractfactory.model.animal;

import patrones.creacionales.abstractfactory.interfac.IAnimal;

public class Cow implements IAnimal {

    @Override
    public String create() {
        return "COW\n";
    }

    @Override
    public String sound() {
        return "MUUUUUUU\n";
    }
}
