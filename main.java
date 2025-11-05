package practice.gui.final2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("calculator");

        frame.setLayout(null);
        frame.setSize(1000,900);


        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,1000,320);








        JTextArea textArea1=new JTextArea();
        textArea1.setBounds(10,10,1000,300);
        textArea1.setBackground(Color.pink);

        panel1.add(textArea1);
        panel1.setBackground(Color.black);
        frame.add(panel1);

        JPanel panel2=new JPanel();
        panel2.setBounds(0,400,1000,400);
        panel2.setLayout(new GridLayout(4,4));
        JButton button1=new JButton("0");
        button1.setBounds(0,0,40,40);
        JButton button2=new JButton("1");
        button2.setSize(40,30);
        JButton button3=new JButton("2");
        button3.setSize(50,30);
        JButton button4=new JButton("3");
        button4.setSize(50,30);
        JButton button5=new JButton("4");
        button5.setSize(50,30);
        JButton button6=new JButton("5");
        button6.setSize(50,30);

        JButton button7=new JButton("6");
        button7.setSize(50,30);
        JButton button8=new JButton("7");
        button8.setSize(50,30);
        JButton button9=new JButton("8");
        button9.setSize(50,30);



        JButton button10=new JButton("9");
        button10.setSize(50,30);

        JButton button11=new JButton("+");
        button11.setSize(50,30);
        JButton button12=new JButton("-");
        button12.setSize(50,30);
        JButton button13=new JButton("*");
        button13.setSize(50,30);

        JButton button14=new JButton("/");
        button14.setSize(50,30);
        JButton button15=new JButton(".");
        button15.setSize(50,30);
        JButton button16=new JButton("=");
        button16.setSize(50,30);


panel2.setBackground(Color.green);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);

        panel2.add(button5);

        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel2.add(button11);
        panel2.add(button12);

        panel2.add(button13);
        panel2.add(button14);
        panel2.add(button15);
        panel2.add(button16);

      frame.add(panel2);
       frame.setBackground(Color.white);


        button1.addActionListener(e -> {
           textArea1.append("0");



        });
        button2.addActionListener(e -> {
            textArea1.append("1");
        });
        button3.addActionListener(e -> {
            textArea1.append("2");
        });
        button4.addActionListener(e -> {
            textArea1.append("3");
        });
        button5.addActionListener(e -> {
            textArea1.append("4");

        });
        button6.addActionListener(e -> {
            textArea1.append("5");
        });
        button7.addActionListener(e -> {
            textArea1.append("6");
        });
        button8.addActionListener(e -> {

            textArea1.append("7");
        });


        button9.addActionListener(e -> {
            textArea1.append("8");
        });
        button10.addActionListener(e -> {
            textArea1.append("9");
        });
        button11.addActionListener(e -> {
            textArea1.append("+");
        });
        button12.addActionListener(e -> {
            textArea1.append("-");
        });
        button13.addActionListener(e -> {
            textArea1.append("*");
        });
        button14.addActionListener(e -> {

            textArea1.append("/");
        });
        button15.addActionListener(e -> {
            textArea1.append(".");
        });
        button16.addActionListener(e -> {
            calulator c = new calulator(textArea1.getText());
            c.calculation();

            System.out.println(textArea1.getText());
            textArea1.setText("");




        });
















                frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
