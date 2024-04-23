package patrones.creacionales.abstractfactory.model.animal;

import patrones.creacionales.abstractfactory.interfac.IAnimal;

public class Dog implements IAnimal {

    @Override
    public String create() {
        return "DOG\n";
    }

    @Override
    public String sound() {
        return "GUAU\n";
    }
}
