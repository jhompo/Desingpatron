package patrones.prototype;

import patrones.Feature;
import patrones.prototype.model.Tv;

public class PrototypeMain extends Feature {

    public void ejecutar(){
        this.SelectOption = 3;

        Tv productTV1  = new Tv();
        productTV1.setSerial("serial1111");

        /**se puede clonar tantos producto se necesiten,
        solo modificamos el serial por que los otros
        atributos quedarian igual para el mismo producto*/
        Tv prductTV2  =    (Tv) productTV1.clonar();
        prductTV2.setSerial("serial2222");

        salida.setText(productTV1.show());
        salida.append("\n\n"+prductTV2.show());

        Show("PROTOTYPE");
    }
}
