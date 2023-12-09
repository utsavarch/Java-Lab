import javax.swing.*;
public class field{
    public static void main(String arg[]){
        JFrame frame = new JFrame("SetBounds Method Test");
        frame.setSize(375, 250);
        frame.setLayout(null);

        // Creating text field and radio buttons
        JTextField textField = new JTextField(null, null, 0);
        JRadioButton r1Button = new JRadioButton("A) Male");
        JRadioButton r2Button = new JRadioButton("B) Female");
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(r1Button);
        bGroup.add(r2Button);

        // Setting positions and sizes
        textField.setBounds(40, 60, 150, 20);
        r1Button.setBounds(40, 90, 100, 20);
        r2Button.setBounds(40, 110, 100, 20);
        JButton button = new JButton("Submit");
        button.setBounds(100, 140, 100, 40);

        // Adding components to the frame
        frame.add(textField);
        frame.add(r1Button);
        frame.add(r2Button);
        frame.add(button);

        // Setting default close operation, centering frame, and making it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
