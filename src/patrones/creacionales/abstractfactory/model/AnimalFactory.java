package patrones.creacionales.abstractfactory.model;

import patrones.creacionales.abstractfactory.interfac.AbstractFactory;
import patrones.creacionales.abstractfactory.interfac.IAnimal;
import patrones.creacionales.abstractfactory.interfac.IColor;

public class AnimalFactory implements AbstractFactory {


    @Override
    public IAnimal createAnimal(String option) {
        IAnimal objeto;
        try {
            //CREACION DINAMICA DEL OBJETO PARA PRICIPIO SOLID OPEN/CLOSE
            String namespace = "patrones.abstractfactory.model.animal."+ option;
            System.out.printf(namespace);
            objeto = (IAnimal)Class.forName(namespace).newInstance();

        }catch (Exception ex) {
            System.out.printf("NO EXISTE ENTIDAD A CREAR");
            objeto = new NullFactory();
        }

        return objeto;
    }

    @Override
    public IColor createColor(String option) {
        return null;
    }
}
