package patrones.creacionales.builder;

import patrones.Feature;
import patrones.creacionales.builder.model.Cliente;
import patrones.creacionales.builder.model.Persona;

public class BuilderMain extends Feature {

    public void ejecutar() {
        this.SelectOption = 4;

        Persona person = Persona.Builder("JHOMPO","CARABALLO")
                .email("JHOMPO@GMAIL.COM")
                .telefono("123233-123")
                .direccion("Altos de Ambere barrio villa pozon")
                .build();

        salida.append("\n\n"+ person.toString());

        Cliente cliente = Cliente.Builder("Jhon","CARABALLO")
                .medioContacto(true)
                .Direccion("Altos de Ambere barrio villa pozon")
                .Email("JHOMPO@GMAIL.COM")
                .Telefono("123233-123")
                .build();
                //.pago()
                //.medioPago("PSE")
                //.build();

        salida.append("\n\n"+ cliente.toString());

        Show("BUILDER");
    }
}
