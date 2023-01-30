package patrones.abstractfactory.model.animal;

import patrones.abstractfactory.interfac.IAnimal;
import patrones.factory.interfac.IConexion;

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
