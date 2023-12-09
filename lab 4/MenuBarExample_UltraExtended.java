import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class implements three different types of listener.
public class MenuBarExample_UltraExtended implements  ActionListener, ItemListener{

    JTextArea whitebox;
    JCheckBoxMenuItem cake, sorbet;
    
    public Container createContentPane()
    {
        whitebox = new JTextArea();
        whitebox.setEditable(false);
        whitebox.setLineWrap(true);
        whitebox.setWrapStyleWord(true);
        whitebox.setMinimumSize(new Dimension(300, 200));
        whitebox.setPreferredSize(new Dimension(300, 200));
        whitebox.setMaximumSize(new Dimension(300, 200));

        JPanel totalGUI = new JPanel();
        totalGUI.add(whitebox);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public JMenuBar createMenuBar()
    {
        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();

        //Add a JMenu
        // The Mnemonic is S, but you need to press Alt+S to access it as it is a top level menu.
        JMenu starter = new JMenu("Starters");
        starter.setMnemonic(KeyEvent.VK_S);
        menuBar.add(starter);

        // Now we want to fill the menu.
        // This has every type of widget in the MenuBar
        // and has Event Listeners attached to each.
           
        // Sout with the Mnemonic 'U', and the Accelerator Alt+U
        JMenuItem soup = new JMenuItem("Soup");
        soup.setMnemonic(KeyEvent.VK_U);
        soup.setAccelerator(KeyStroke.getKeyStroke(
                            KeyEvent.VK_U, ActionEvent.ALT_MASK));
        soup.addActionListener(this);

        // Steak with the Mnemonic T
        JMenu steak = new JMenu("Steak");
        steak.setMnemonic(KeyEvent.VK_T);
           
        // Rare with the Mnemonic 'R', and the Accelerator Alt+R
        JMenuItem rare = new JMenuItem("Rare");
        rare.setMnemonic(KeyEvent.VK_R);
        rare.setAccelerator(KeyStroke.getKeyStroke(
                            KeyEvent.VK_R, ActionEvent.ALT_MASK));
        rare.addActionListener(this);
        
        JMenuItem welldone = new JMenuItem("Well Done");
        welldone.setMnemonic(KeyEvent.VK_W);
        welldone.setAccelerator(KeyStroke.getKeyStroke(
                            KeyEvent.VK_W, ActionEvent.ALT_MASK));
        welldone.addActionListener(this);
        //add well done here
           
        steak.add(rare);
        steak.add(welldone);


        // Chips with the Mnemonic 'C', Potato with the Mnemonic 'P'
        JRadioButtonMenuItem chips = new JRadioButtonMenuItem("Chips");
        chips.setMnemonic(KeyEvent.VK_C);
        chips.addActionListener(this);
        JRadioButtonMenuItem potato = new JRadioButtonMenuItem("Baked Potato");
        potato.setMnemonic(KeyEvent.VK_P);
       potato.addActionListener(this);

        // A button group to group the radiobuttons together.
        ButtonGroup sides = new ButtonGroup();
        sides.add(chips);
        sides.add(potato);

        // Cake with the Mnemonic 'k', Sorbet with the Mnemonic 'b'
        cake = new JCheckBoxMenuItem("Cake");
        cake.setMnemonic(KeyEvent.VK_K);
        cake.addItemListener(this);
        
        sorbet = new JCheckBoxMenuItem("Sorbet");
        sorbet.setMnemonic(KeyEvent.VK_B);
        sorbet.addItemListener(this);

        // Items added in the order you want them displayed.
        starter.add(soup);
        starter.addSeparator();
        starter.add(steak);
        starter.addSeparator();
        starter.add(chips);
        starter.add(potato);

        starter.addSeparator();
        starter.add(cake);
        starter.add(sorbet);


        return menuBar;
    }

    // Deals with the Action Events.
    public void actionPerformed(ActionEvent e)
    {
        whitebox.append(e.getActionCommand() + " Selected \n");
    }

    // Deals with the Item Events.
    public void itemStateChanged(ItemEvent e)
    {     
        if(e.getSource() == cake)
        {
            whitebox.append("Cake Clicked\n");
        }
        else if(e.getSource() == sorbet)
        {
            whitebox.append("Sorbet Clicked\n");
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JMenuBar [=]");

        //Create and set up the ContentPane and MenuBar
        MenuBarExample_UltraExtended demo = new MenuBarExample_UltraExtended();
        
        frame.setContentPane(demo.createContentPane());
        frame.setJMenuBar(demo.createMenuBar());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}