package patrones.builder;

import patrones.Feature;
import patrones.builder.model.Persona;

public class BuilderMain extends Feature {

    public void ejecutar() {
        this.SelectOption = 4;

        Persona person = Persona.Builder("JHOMPO","CARABALLO")
                .setEmail("JHOMPO@GMAIL.COM")
                .setTelefono("123233-123")
                .build();


        salida.append("\n\n"+ person.toString());

        Show("BUILDER");
    }
}
