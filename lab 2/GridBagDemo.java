import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagDemo {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame frame = new JFrame("Swing Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }
   
   private static void createUI(final JFrame frame){  
    JPanel panel = new JPanel();
    GridBagLayout layout = new GridBagLayout();

    panel.setLayout(layout);        
    GridBagConstraints gbc = new GridBagConstraints();

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(new JButton("Button 1"),gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    panel.add(new JButton("Button 2"),gbc); 

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipady = 20;   
    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(new JButton("Button 3"),gbc); 

    gbc.gridx = 1;
    gbc.gridy = 1;       
    panel.add(new JButton("Button 4"),gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;       
    panel.add(new JButton("Button 6"),gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;       
    panel.add(new JButton("Button 7"),gbc);

    gbc.gridx = 2;
    gbc.gridy = 2;       
    panel.add(new JButton("Button 8"),gbc);
    
    gbc.gridx = 0;
    gbc.gridy = 3;      
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridwidth = 2;
    panel.add(new JButton("Button 5"),gbc);  
    frame.getContentPane().add(panel, BorderLayout.CENTER);





 }
}

