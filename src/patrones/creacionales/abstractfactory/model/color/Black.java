package patrones.creacionales.abstractfactory.model.color;

import patrones.creacionales.abstractfactory.interfac.IColor;

public class Black implements IColor {


    @Override
    public String getColor() {
        return "BLACK\n";
    }
}
