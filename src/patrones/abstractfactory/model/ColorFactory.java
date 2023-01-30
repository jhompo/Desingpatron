package patrones.abstractfactory.model;

import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.interfac.IAnimal;
import patrones.abstractfactory.interfac.IColor;

public class ColorFactory implements AbstractFactory {


    @Override
    public IAnimal createAnimal(String option) {
        return null;
    }

    @Override
    public IColor createColor(String option) {
        IColor objeto;
        try {
            //CREACION DINAMICA DEL OBJETO PARA PRICIPIO SOLID OPEN/CLOSE
            String namespace = "patrones.abstractfactory.model.color."+  option;
            objeto = (IColor)Class.forName(namespace).newInstance();

        }catch (Exception ex) {
            System.out.printf("NO EXISTE ENTIDAD A CREAR");
            objeto = new NullFactory();
        }

        return objeto;
    }
}
