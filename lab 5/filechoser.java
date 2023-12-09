import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class filechoser {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("File Chooser Example");

        // Create a JLabel to display the selected file path
        JLabel label = new JLabel("Selected File: ");

        // Create a panel to hold buttons and label
        JPanel panel = new JPanel();
        
        // Create a button for save file chooser
        JButton saveButton = new JButton("Save File");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
                int returnValue = fileChooser.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                    label.setText("Selected File: " + selectedFilePath);
                } else {
                    label.setText("No file selected");
                }
            }
        });

        // Create a button for open file chooser
        JButton openButton = new JButton("Open File");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                    label.setText("Selected File: " + selectedFilePath);
                } else {
                    label.setText("No file selected");
                }
            }
        });

        // Add buttons and label to the panel
        panel.add(saveButton);
        panel.add(openButton);
        panel.add(label);

        // Set layout for the frame
        frame.setLayout(new FlowLayout());

        // Add panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
