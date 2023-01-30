package patrones.abstractfactory.model;

import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.interfac.IAnimal;
import patrones.abstractfactory.interfac.IColor;
import patrones.abstractfactory.model.animal.Cow;
import patrones.abstractfactory.model.animal.Dog;
import patrones.factory.interfac.IConexion;
import patrones.factory.model.*;

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
