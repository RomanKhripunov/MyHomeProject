package TimeTracker;

import javax.swing.*;
import java.awt.*;

public class SimpleFrame {

    public void start() {
        JFrame frame = new JFrame("TimeTracker");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton startButton = new JButton("Start");
        startButton.setBackground(Color.green);
        startButton.setBounds(100, 100, 100, 100);


        panel.add(startButton);
    }

    public static void main(String[] args) {
        new SimpleFrame().start();
    }

//    public String inputTaskSummary() {
//        String taskSummary;
//        taskSummary = JOptionPane.showInputDialog("Please, type description of task:");
//        return taskSummary;
//    }
}
