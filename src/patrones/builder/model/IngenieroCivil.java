package patrones.builder.model;

import patrones.builder.interfac.CasaBuilder;

public class IngenieroCivil {

    private CasaBuilder casaBuilder;

    public IngenieroCivil(CasaBuilder casaBuilder){
        this.casaBuilder = casaBuilder;
    }

    public Casa getCasa(){
        return this.casaBuilder.getCasa();
    }

    public void ConstruyeCasa(){
        this.casaBuilder.construyeCimientos();
        this.casaBuilder.construyeEstructura();
        this.casaBuilder.construyeTecho();
        this.casaBuilder.construyeInterior();
    }

    public void CasaSimple(){
        this.casaBuilder.init();
        this.casaBuilder.construyeCimientos();
        this.casaBuilder.construyeTecho();
    }

}