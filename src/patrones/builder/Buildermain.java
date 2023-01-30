package patrones.builder;

import patrones.builder.interfac.CasaBuilder;
import patrones.builder.model.Casa;
import patrones.builder.model.CasaMaderaBuilder;
import patrones.builder.model.IgluBuilder;
import patrones.builder.model.IngenieroCivil;

import javax.swing.*;

public class Buildermain {

    private static JTextArea salida = new JTextArea();
    private Buildermain(){}
    public static void ejecutar() {
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

        salida.setSize(800, 800);
        JOptionPane.showMessageDialog(null,salida,"BUILDER",JOptionPane.INFORMATION_MESSAGE);

    }
}
