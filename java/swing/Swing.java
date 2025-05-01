import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Abc extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton addBtn, subBtn, prodBtn, divBtn;
    JLabel l3;

    public Abc() {
        setLayout(new FlowLayout());

        l1 = new JLabel("Number 1:");
        t1 = new JTextField(20);

        l2 = new JLabel("Number 2:");
        t2 = new JTextField(20);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        prodBtn = new JButton("*");
        divBtn = new JButton("/");

        l3 = new JLabel("Result");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(addBtn);
        add(subBtn);
        add(prodBtn);
        add(divBtn);
        add(l3);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        prodBtn.addActionListener(this);
        divBtn.addActionListener(this);

        setVisible(rootPaneCheckingEnabled);
        setVisible(true);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == addBtn) {
                result = num1 + num2;
            } else if (e.getSource() == subBtn) {
                result = num1 - num2;
            } else if (e.getSource() == prodBtn) {
                result = num1 * num2;
            } else if (e.getSource() == divBtn) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    l3.setText("Error: Division by 0 not possible");
                    return;
                }
            }

            l3.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            l3.setText("Error: Invalid Input");
        }
    }
}

public class Swing {
    public static void main(String args[]) {
        Abc ob = new Abc();
    }
}