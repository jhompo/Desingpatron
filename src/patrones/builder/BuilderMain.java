package patrones.builder;

import patrones.Patron;
import patrones.builder.interfac.CasaBuilder;
import patrones.builder.model.CasaMaderaBuilder;
import patrones.builder.model.IgluBuilder;
import patrones.builder.model.IngenieroCivil;

public class BuilderMain extends Patron {

    public void ejecutar() {
        this.SelectOption = 4;

        CasaBuilder builder = new IgluBuilder();
        IngenieroCivil ingeniero = new IngenieroCivil(builder);
        ingeniero.ConstruyeCasa();

        salida.setText( ingeniero.getCasa().show());
        ingeniero.CasaSimple();
        salida.append( "\n\n"+ingeniero.getCasa().show());

        builder = new CasaMaderaBuilder();
        ingeniero = new IngenieroCivil(builder);
        ingeniero.ConstruyeCasa();

        salida.append("\n\n"+ ingeniero.getCasa().show());

        Show("BUILDER");
    }
}
