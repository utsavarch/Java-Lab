import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class work {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(40, 20, 150, 20);

        // Password Field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(40, 50, 150, 20);

        // Check Box
        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBox.setBounds(40, 80, 200, 20);

        // Combo Box
        String[] options = {"Male", "Female"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(40, 110, 150, 20);

        // Sliders
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setBounds(40, 140, 150, 20);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Handle slider value change here
            }
        });

        // Text Area
        JTextArea textArea = new JTextArea();
        textArea.setBounds(40, 170, 150, 80);

        // Scroll Pane for Text Area
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(200, 170, 150, 80);

        // Adding components to the frame
        frame.add(textField);
        frame.add(passwordField);
        frame.add(checkBox);
        frame.add(comboBox);
        frame.add(slider);
        frame.add(scrollPane);

        // Setting default close operation, centering frame, and making it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
