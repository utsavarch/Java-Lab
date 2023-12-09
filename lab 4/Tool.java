import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tool extends JFrame implements ActionListener, ItemListener {
    // toolbar
    static JToolBar tb;

    // buttons
    static JButton b1;
    static JButton b2; // New button

    // create a frame
    static JFrame f;

    // create a combo box
    static JComboBox<String> x; // Specify the type of items as String

    // create a label
    static JLabel l;

    // label for selected items
    static JLabel selectedItemLabel;

    public static void main(String args[]) {
        // create a object of class
        Tool to = new Tool();

        // create a label
        l = new JLabel("nothing selected");

        // create a label for selected items
        selectedItemLabel = new JLabel("Selected Item: ");

        // create a frame
        f = new JFrame("Toolbar demo");

        // set layout for frame
        f.setLayout(new BorderLayout());

        // create a toolbar
        tb = new JToolBar();

        // create a panel
        JPanel p = new JPanel();

        // create a combobox
        x = new JComboBox<>(new String[] { "item 1", "item 2" }); // Specify the type of items as String

        // add actionListener
        x.addItemListener(to);

        // create new buttons
        b1 = new JButton("button 1");
        b2 = new JButton("button 2"); // Initialize the new button

        // add ActionListener to buttons
        b1.addActionListener(to);
        b2.addActionListener(to); // Add ActionListener for the new button

        // add buttons
        p.add(b1);
        p.add(b2); // Add the new button to the panel

        // add menu to menu bar
        p.add(x);

        tb.add(p);

        // create a panel for selected items
        JPanel p2 = new JPanel();
        p2.add(selectedItemLabel);

        // create a panel
        JPanel p1 = new JPanel();
        p1.add(l);

        // add toolbar, selected items panel, and label to frame
        f.add(tb, BorderLayout.NORTH);
        f.add(p2, BorderLayout.WEST);
        f.add(p1, BorderLayout.CENTER);

        // set the size of the frame
        f.setSize(600, 500);
        f.setVisible(true);
    }

    // if button is pressed
    public void actionPerformed(ActionEvent e) {
        l.setText(e.getActionCommand() + " selected.");
    }

    // when combo box item is selected
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedText = e.getItem().toString();
            selectedItemLabel.setText("Selected Item: " + selectedText);
        }
    }
}
