package TimeTracker;

import javax.swing.*;

public class MyFrameCaller {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

//    class EventHandler implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            if (event.getSource() == buttonStart);
//        }
//    }

    public void startTrack() {
        String taskSummary;
        taskSummary = JOptionPane.showInputDialog("Start");
    }

    public void pauseTrack() {
        // todo
    }

    public void stopTrack() {
        // todo
    }
}
