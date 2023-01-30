package patrones.prototype.model;

import patrones.prototype.interfac.IProducto;

public class Tv implements IProducto {

    private String serial;
    private String tipo;
    private String modelo;
    private double precio;

    public Tv(){
        tipo ="LED";
        modelo="2023";
        precio = 4999999;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    @Override
    public IProducto clonar() {
        Tv product = null;

        try {
            product = (Tv) clone();
        } catch (CloneNotSupportedException ex) {
            System.out.printf("No se pudo clonar");
        }

        return product;
    }

    public String show(){
        return "Serial: " + this.serial +
                "\nTipo:"+ this.tipo +
                "\nModelo:" + this.modelo +
                "\nPrecio:" + this.precio;
    }

}
