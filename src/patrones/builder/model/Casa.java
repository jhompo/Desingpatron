package patrones.builder.model;

public class Casa {
    protected String cimientos;
    protected String estructura;
    protected String techo;
    protected String interior;

    public String show(){
        return "Cimientos: " + this.cimientos +
                "\nEstructura:"+ this.estructura +
                "\nTecho:" + this.techo +
                "\nInterior:" + this.interior;
    }

    public void clear(){
        this.cimientos ="NO INCLUYE";
        this.estructura ="NO INCLUYE";
        this.techo ="NO INCLUYE";
        this.interior ="NO INCLUYE";
    }
}
