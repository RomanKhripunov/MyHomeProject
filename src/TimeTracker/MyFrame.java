package TimeTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {

    private static String windowName = "TimeTracker";
    JButton buttonStart, buttonPause, buttonStop, buttonReset;
    JLabel labelTaskDescription;
    JTextField filedTaskDescription;
    EventHandler eventHandler = new EventHandler();
    String startTime, taskDescription, endTime;

    public MyFrame() {
        this(windowName);

    }

    public MyFrame(String newWindowName) {
        super(newWindowName);
        setLayout(new FlowLayout());
        buttonReset = new JButton("Reset");
        buttonStart = new JButton("Start");
//        buttonPause = new JButton("Pause");
        buttonStop = new JButton("Stop");
        labelTaskDescription = new JLabel("Task description");
        filedTaskDescription = new JTextField(15);

        add(buttonReset);
        add(buttonStart);
//        add(buttonPause);
        add(buttonStop);
        add(labelTaskDescription);
        add(filedTaskDescription);

        buttonReset.addActionListener(eventHandler);
        buttonStart.addActionListener(eventHandler);
//        buttonPause.addActionListener(eventHandler);
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
            } else if (event.getSource() == buttonReset) {
                resetTrack();
            }
        }
    }

    private void resetTrack() {
        startTime = null;
        taskDescription = null;
        endTime = null;
    }

    public void startTrack() {
        while (true) {
            try {
                taskDescription = JOptionPane.showInputDialog(null,
                        "Please, type the description of task",
                        windowName,
                        JOptionPane.INFORMATION_MESSAGE);
                if (taskDescription == null || "".equals(taskDescription.replaceAll("\\s+", ""))) {
                    throw new IllegalAccessException();
                }
                break;
            } catch (IllegalAccessException e) {
                JOptionPane.showMessageDialog(null, "Task description cannot be empty!", windowName, JOptionPane.ERROR_MESSAGE);
            }
        }
        startTime = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }

    public void pauseTrack() {
        // todo
    }

    public void stopTrack() {
        endTime = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }
}
