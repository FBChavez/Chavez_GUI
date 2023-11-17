package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private JPanel jpanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    double res = 0;

                    switch(cbOperations.getSelectedIndex()) {
                        case 0:
                            res = num1 + num2;
                            break;
                        case 1:
                            res = num1 - num2;
                            break;
                        case 2:
                            res = num1 * num2;
                            break;
                        case 3:
                            res = num1 / num2;
                            break;
                    }
                    lblResult.setText(String.valueOf(res));
                } catch (Exception n) {
                    JOptionPane.showMessageDialog(null, "May contain invalid or empty input/s.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(550, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
