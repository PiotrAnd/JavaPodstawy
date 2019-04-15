package training.swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ConverterSwingApp implements ActionListener, FocusListener {
    private static final String KM_PH_MPH = "KmPH->MPH";
    private static final String MPH_KM_PH = "MPH->KmPH";
    private JButton from;
    private JButton to;
    private JLabel result;
    private JTextField input;
    JFrame frame = new JFrame("Speed converter");

    public static void main(String[] args) {
        ConverterSwingApp app = new ConverterSwingApp();
        app.runApp();
    }

    private void runApp() {

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        initListenersConverter();
        assembleViev(frame);

        frame.setVisible(true);
    }

    private void assembleViev(JFrame frame) {
        frame.setLayout(new GridLayout(2, 2));
        frame.add(input);
        frame.add(from);
        frame.add(result);
        frame.add(to);
        frame.pack();
    }

    private void initListenersConverter() {
        from.addActionListener(this);
        to.addActionListener(this);
    }

    private void initComponents() {
        result = new JLabel("Result:");
        input = new JTextField("Speed", 10);
        from = new JButton(KM_PH_MPH);
        to = new JButton(MPH_KM_PH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //System.out.println("click: "+command);
        switch (command) {
            case KM_PH_MPH:
                //int speed = getInputValue();
                converteToMPH(getInputValue());
                break;
            case MPH_KM_PH:
                converteTokmph(getInputValue());
                break;
        }
    }

    private void converteTokmph(int speed) {
        double resultkmph = speed / 0.6213;
        result.setText(String.format("KmPH: %.2f", resultkmph));
    }

    private void converteToMPH(int speed) {
        double resultMph = 0.6213 * speed;
        result.setText(String.format("Mph: %.2f", resultMph));
    }

    private int getInputValue() {
        String text = input.getText();
        int speed = 0;
        try {
            speed = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            //dialog box
            JOptionPane.showMessageDialog(
                    frame, "Wrong input", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return  speed;
        /*Optional<String> opt = Optional.of(text);
        speed = opt.map(s -> Integer::parseInt(s).ofElse(0);
        return speed;*/
    }

    @Override
    public void focusGained(FocusEvent e) {
        input.setText("");
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}

