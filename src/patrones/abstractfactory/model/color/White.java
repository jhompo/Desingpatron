package patrones.abstractfactory.model.color;

import patrones.abstractfactory.interfac.IColor;

public class White implements IColor {

    @Override
    public String getColor() {
        return "WHITE";
    }
}
