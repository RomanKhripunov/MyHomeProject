package TimeTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    private static String windowName = "TimeTracker";
    JButton buttonStart, buttonPause, buttonStop;
    JLabel labelTaskDescription;
    JTextField taskDescription;
    EventHandler eventHandler = new EventHandler();

    public MyFrame() {
        this(windowName);
    }

    public MyFrame(String newWindowName) {
        super(newWindowName);
        setLayout(new FlowLayout());
        buttonStart = new JButton("Start");
        buttonPause = new JButton("Pause");
        buttonStop = new JButton("Stop");
        labelTaskDescription = new JLabel("Task description");
        taskDescription = new JTextField(15);

        add(buttonStart);
        add(buttonPause);
        add(buttonStop);
        add(labelTaskDescription);
        add(taskDescription);

        buttonStart.addActionListener(eventHandler);
        buttonPause.addActionListener(eventHandler);
        buttonStop.addActionListener(eventHandler);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonStart) {
                startTrack();
            } else if (event.getSource() == buttonPause) {
                pauseTrack();
            } else if (event.getSource() == buttonStop) {
                stopTrack();
            }
        }
    }

    public String startTrack() {
        String taskDescription;
        taskDescription = JOptionPane.showInputDialog(null, "Please, type the description of task", windowName, JOptionPane.INFORMATION_MESSAGE);
        return taskDescription;
    }

    public void pauseTrack() {
        JOptionPane.showMessageDialog(null, "Pause", windowName, JOptionPane.INFORMATION_MESSAGE);
    }

    public void stopTrack() {
        JOptionPane.showMessageDialog(null, "Stop", windowName, JOptionPane.ERROR_MESSAGE);
    }
}
