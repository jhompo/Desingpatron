package patrones.abstractfactory.model.animal;

import patrones.abstractfactory.interfac.IAnimal;
import patrones.factory.interfac.IConexion;

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
