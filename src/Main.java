import patrones.Patron;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {

            Option option[] = {
                    new Option("Singleton", "Singleton"),
                    new Option("Factory Method", "Factory"),
                    new Option("Abstract Factory", "AbstractFactory"),
                    new Option("Prototype", "Prototype"),
                    new Option("Builder", "Builder"),
                    new Option("SALIR", "")
            };

            int SelectOption = 0;
            Patron mypatron=null;

            while (SelectOption != -1) {
                Option result = (Option) JOptionPane.showInputDialog(
                        null,
                        "Que patron de diseño desea ejecutar",
                        "Patrones de Diseño" ,
                        JOptionPane.QUESTION_MESSAGE,
                       null,
                        option, option[SelectOption]);

                        String pack = "patrones."+result.Value.toLowerCase()+"."+result.Value+"Main";
                        mypatron = (Patron)Class.forName(pack).newInstance();
                        mypatron.ejecutar();
                        SelectOption = mypatron.SelectOption;
            }

        }catch(Exception ex){
            System.out.printf("\nCERRANDO APLICACION: " + ex.getMessage());
        }

    }
}