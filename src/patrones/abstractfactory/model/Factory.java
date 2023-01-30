package patrones.abstractfactory.model;

import patrones.abstractfactory.interfac.AbstractFactory;

public class Factory {

    public static AbstractFactory getInstance(String option){
        AbstractFactory objeto =null;

        switch (option){
            case "Animal": objeto = new AnimalFactory(); break;
            case "Color":  objeto = new ColorFactory(); break;
            //default: objeto = new NullFactory(); break;
        }
        return objeto;
    }
}
