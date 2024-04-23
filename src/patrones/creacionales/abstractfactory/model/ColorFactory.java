package patrones.creacionales.abstractfactory.model;

import patrones.creacionales.abstractfactory.interfac.AbstractFactory;
import patrones.creacionales.abstractfactory.interfac.IAnimal;
import patrones.creacionales.abstractfactory.interfac.IColor;

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
