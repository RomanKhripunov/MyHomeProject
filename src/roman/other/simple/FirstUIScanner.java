package roman.other.simple;

import javax.swing.*;

public class FirstUIScanner {
    int i;
    int k;
    String st1;
    String st2;
    JButton b1, b2;
    JTextField t1, t2;
    JLabel l1, l2, l3, l4;
    public void graphScanner(){
        JPanel jPanel = new JPanel(true);
        jPanel.setVisible(true);

        b1 = new JButton("Посчитать");
        b2 = new JButton("Очистить");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l1 = new JLabel("Количество отработанных часов");
        l2 = new JLabel("Количество рабочих часов в месяце");
        l3 = new JLabel("Итого заработано");
        l4 = new JLabel("в РБ");

        jPanel.add(l1);
        jPanel.add(t1);
        jPanel.add(l2);
        jPanel.add(t2);
        jPanel.add(l3);
        jPanel.add(l4);
        jPanel.add(b1);
        jPanel.add(b1);

//        st1 = JOptionPane.showInputDialog("Количество отработанных часов");
//        st2 = JOptionPane.showInputDialog("Количество рабочих часов в месяце");
//        i = Integer.parseInt(st1);
//        k = Integer.parseInt(st2);
    }
//    public void graphReplay(int x, int y){
//        JOptionPane.showMessageDialog(null, "Теперь первое число = " + x + "\n" + "Теперь второе число = " + y);
//    }
}
