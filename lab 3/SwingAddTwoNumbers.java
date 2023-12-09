import java.awt.event.*;
import javax.swing.*;

public class SwingAddTwoNumbers {
    private JFrame frame;
    private JTextField numField1, numField2;
    private JLabel numLabel1, numLabel2, resultLabel;

    public SwingAddTwoNumbers() {
        frame = new JFrame("Add Two Numbers");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numLabel1 = new JLabel("Number 1:");
        numLabel1.setBounds(20, 50, 80, 30);

        numField1 = new JTextField();
        numField1.setBounds(100, 50, 100, 30);

        numLabel2 = new JLabel("Number 2:");
        numLabel2.setBounds(20, 90, 80, 30);

        numField2 = new JTextField();
        numField2.setBounds(100, 90, 100, 30);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 170, 200, 30);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numField1.getText());
                    int num2 = Integer.parseInt(numField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid Input");
                }
            }
        });

        addButton.setBounds(50, 130, 80, 30);

        frame.add(numLabel1);
        frame.add(numField1);
        frame.add(numLabel2);
        frame.add(numField2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingAddTwoNumbers();
            }
        });
    }
}
