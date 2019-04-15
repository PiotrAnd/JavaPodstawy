package training.swing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculator {
    private JFrame frame;
    private JButton but0;
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    private JButton but6;
    private JButton but7;
    private JButton but8;
    private JButton but9;

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.runApp();
    }
    private void runApp(){
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCompetens();
        viev(frame);
        frame.pack();

        frame.setVisible(true);

    }

    private void viev(JFrame frame) {
        frame.setLayout(new GridLayout());
        frame.add(but0);
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(but5);
        frame.add(but6);
        frame.add(but7);
        frame.add(but8);
        frame.add(but9);
    }

    private void initCompetens() {
        but0 = new JButton("0");
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");


    }
}
