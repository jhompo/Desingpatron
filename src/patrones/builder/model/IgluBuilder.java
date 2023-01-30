package patrones.builder.model;

import patrones.builder.interfac.CasaBuilder;

public class IgluBuilder implements CasaBuilder {
    private Casa casa;

    public IgluBuilder() {
        this.casa = new Casa();
    }

    public void construyeCimientos() {
        casa.cimientos = "Barillas de hielo";
    }

    public void construyeEstructura() {
        casa.estructura = "Bloques de hielo";
    }

    public void construyeInterior() {
        casa.interior = "Decoraciones de hielo";
    }

    public void construyeTecho() {
        casa.techo = "Domo de hielo";
    }

    public Casa getCasa() {
        return this.casa;
    }

    @Override
    public void init() {
        casa.clear();
    }
}

