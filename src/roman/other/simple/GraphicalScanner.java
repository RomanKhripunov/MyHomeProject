package roman.other.simple;


import javax.swing.*;
import java.awt.*;

public class GraphicalScanner {
    Integer i;
    Integer k;
    String st1;
    String st2;
    public void intputScanner(){
        JTextField iTextField = new JTextField(5);
        JTextField kTextField = new JTextField(5);

        JPanel multiPanel = new JPanel();
//        multiPanel.setVisible(true);
        multiPanel.add(new Label("Введите первое число: "));
//        st1 = iTextField.getText();
//        i = Integer.parseInt(st1);
        multiPanel.add(iTextField);

        multiPanel.add(Box.createHorizontalStrut(10));

        multiPanel.add(new Label("Введите второе число: "));
//        st2 = kTextField.getText();
//        k = Integer.parseInt(st2);
        multiPanel.add(kTextField);

        multiPanel.setVisible(false);
    }
    public void outputScanner(int x){
        JPanel resultMultiPanel = new JPanel();
        resultMultiPanel.add(new Label("Теперь первое число: " + x));
    }
}
