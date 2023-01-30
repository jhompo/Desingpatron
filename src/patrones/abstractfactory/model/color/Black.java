package patrones.abstractfactory.model.color;

import patrones.abstractfactory.interfac.IColor;

public class Black implements IColor {


    @Override
    public String getColor() {
        return "BLACK\n";
    }
}
