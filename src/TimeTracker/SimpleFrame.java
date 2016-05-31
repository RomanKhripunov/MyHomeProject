package TimeTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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

class RoundedButton extends Component {

    ActionListener actionListener;
    String label;

    protected boolean pressed = false;

    public RoundedButton() {
        this("");
    }

    public RoundedButton(String label) {
        this.label = label;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    public void setLabel(String label) {
        this.label = label;
        invalidate();
        repaint();
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void paint(Graphics g) {

        if (pressed) {
            g.setColor(getBackground().darker().darker());
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        g.setColor(getBackground().darker().darker().darker());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        Font f = getFont();
        if (f != null) {
            FontMetrics fm = getFontMetrics(getFont());
            g.setColor(getForeground());
            g.drawString(label, getWidth() / 2 - fm.stringWidth(label) / 2, getHeight() / 2 + fm.getMaxDescent());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        Font f = getFont();
        if (f != null) {
            FontMetrics fm = getFontMetrics(getFont());
            int max = Math.max(fm.stringWidth(label) + 40, fm.getHeight() + 40);
            return new Dimension(max, max);
        } else {
            return new Dimension(100, 100);
        }
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(100, 100);
    }

    public void removeActionListener(ActionListener listener) {
        actionListener = AWTEventMulticaster.remove(actionListener, listener);
    }

    /**
     * Determine if click was inside round button.
     */
    @Override
    public boolean contains(int x, int y) {
        int mx = getSize().width / 2;
        int my = getSize().height / 2;
        return (((mx - x) * (mx - x) + (my - y) * (my - y)) <= mx * mx);
    }

    public void addActionListener(ActionListener listener) {
        actionListener = AWTEventMulticaster.add(actionListener, listener);
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    /**
     * Paints the button and distribute an action event to all listeners.
     */
}