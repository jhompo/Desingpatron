import patrones.abstractfactory.Abstractmain;
import patrones.builder.Buildermain;
import patrones.factory.Factorymain;
import patrones.prototype.Prototypemain;
import patrones.singleton.Singletonmain;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            String[] optionsToChoose = {"Singleton",
                    "Factory Method",
                    "Abstract Factory",
                    "Prototype",
                    "Builder",
                    "SALIR"};

            String result = "";
            int SelectOption = 0;
            while (result != "Salir") {
                result = (String) JOptionPane.showInputDialog(
                        null,
                        "Que patron de diseño desea ejecutar",
                        "Patrones de Diseño" ,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        optionsToChoose, optionsToChoose[SelectOption]);

                switch (result) {
                    case "Singleton":  Singletonmain.ejecutar(); SelectOption = 0; break;
                    case "Factory Method": Factorymain.ejecutar(); SelectOption = 1; break;
                    case "Abstract Factory": Abstractmain.ejecutar(); SelectOption = 2; break;
                    case "Prototype":  Prototypemain.ejecutar(); SelectOption = 3; break;
                    case "Builder": Buildermain.ejecutar(); SelectOption = 4; break;
                    default: result = "Salir"; System.out.printf("Salir"); break;
                }
            }

        }catch(Exception ex){
            System.out.printf("CERRANDO APLICACION");
        }

    }
}