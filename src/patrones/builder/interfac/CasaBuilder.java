package patrones.builder.interfac;

import patrones.builder.model.Casa;

public interface CasaBuilder {

    public void construyeCimientos();

    public void construyeEstructura();

    public void construyeTecho();

    public void construyeInterior();

    public Casa getCasa();

    public void init();
}
