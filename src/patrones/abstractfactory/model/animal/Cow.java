package patrones.abstractfactory.model.animal;

import patrones.abstractfactory.interfac.IAnimal;
import patrones.factory.interfac.IConexion;

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
