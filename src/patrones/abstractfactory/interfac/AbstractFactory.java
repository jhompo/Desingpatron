package patrones.abstractfactory.interfac;

import patrones.abstractfactory.model.AnimalFactory;
import patrones.abstractfactory.model.ColorFactory;

public interface AbstractFactory {
    IAnimal  createAnimal(String option);
    IColor createColor(String option);

}
