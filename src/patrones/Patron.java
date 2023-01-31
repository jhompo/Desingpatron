package patrones;

import javax.swing.*;

public abstract class Patron {
    public JTextArea salida = new JTextArea(10,25);
    public int SelectOption = 0;

    public abstract void ejecutar();

    public void Show(String Title){
        salida.setSize(1000, 1000);
        JOptionPane.showMessageDialog(null,salida,Title,JOptionPane.INFORMATION_MESSAGE);
    }
}
