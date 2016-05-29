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
    EventHandler eventHandler = new EventHandler();
    String taskDescription;
    String startTime, endTime, pauseTime;

    public MyFrame() {
        super(windowName);
        setLayout(new FlowLayout());
        buttonReset = new JButton("Reset");
        buttonStart = new JButton("Start");
        buttonStop = new JButton("Stop");

        add(buttonReset);
        add(buttonStart);
        add(buttonStop);

        buttonReset.addActionListener(eventHandler);
        buttonStart.addActionListener(eventHandler);
        buttonStop.addActionListener(eventHandler);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
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
        buttonStart.setEnabled(true);
    }

    public void startTrack() {
        while (taskDescription == null || "".equals(taskDescription.trim().replaceAll("\\s+", " "))) {
            try {
                taskDescription = showInputWindow("Please, type the description of task");
                if (taskDescription == null || "".equals(taskDescription.trim().replaceAll("\\s+", " "))) {
                    throw new IllegalAccessException();
                }
                startTime = new SimpleDateFormat("hh:mm").format(new Date());
                buttonStart.setEnabled(false);
            } catch (IllegalAccessException e) {
                showMessageWindow("Task description cannot be empty!");
            }
        }
    }

    public void pauseTrack() {
        // todo
    }

    public void stopTrack() {
        // todo: add @endTime to anywhere and display it
        try {
            if (startTime != null) {
                endTime = new SimpleDateFormat("hh:mm").format(new Date());
                showMessageWindow(taskDescription + ": " + startTime + " - " + endTime);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            showMessageWindow("Task doesn't start yet");
        }

        startTime = null;
        taskDescription = null;
        endTime = null;
        buttonStart.setEnabled(true);
    }

    public void showMessageWindow(String msg) {
        JOptionPane.showMessageDialog(null, msg, windowName, JOptionPane.INFORMATION_MESSAGE);
    }

    public String showInputWindow(String msg) {
        return JOptionPane.showInputDialog(null, msg, windowName, JOptionPane.INFORMATION_MESSAGE);
    }
}
