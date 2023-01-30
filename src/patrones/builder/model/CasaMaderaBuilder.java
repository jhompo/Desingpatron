package patrones.builder.model;

import patrones.builder.interfac.CasaBuilder;


public class CasaMaderaBuilder implements CasaBuilder {

    private Casa casa;

    public CasaMaderaBuilder() {
        this.casa = new Casa();
    }

    public void construyeCimientos() {
        casa.cimientos = "Vigas de madera";
    }

    public void construyeEstructura(){
        casa.estructura = "Tablones de madera";
    }

    public void construyeInterior() {
        casa.interior = "Decoraciones grabadas";
    }

    public void construyeTecho() {
        casa.techo = "Tablones de madera";
    }

    public Casa getCasa(){
        return this.casa;
    }

    @Override
    public void init() {
        casa.clear();
    }


}