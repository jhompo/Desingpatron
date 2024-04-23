package patrones.creacionales.abstractfactory.interfac;

public interface AbstractFactory {

    IAnimal  createAnimal(String option);
    IColor createColor(String option);

}
