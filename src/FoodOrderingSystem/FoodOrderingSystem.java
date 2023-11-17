package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderingSystem() {
        rbNone.setSelected(true);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float total = 0;
                if(cPizza.isSelected()) {
                    total += 100;
                }
                if(cBurger.isSelected()) {
                    total += 80;
                }
                if(cFries.isSelected()) {
                    total += 65;
                }
                if(cSoftDrinks.isSelected()) {
                    total += 55;
                }
                if(cTea.isSelected()) {
                    total += 50;
                }
                if(cSundae.isSelected()) {
                    total += 40;
                }
                if(rbNone.isSelected()) {
                    total += 0;
                } else if(rb5.isSelected()) {
                    total *= 0.95;
                } else if(rb10.isSelected()) {
                    total *= 0.90;
                } else {
                    total *= 0.85;
                }
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(530, 350);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
