import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingControlDemo swingControlDemo = new SwingControlDemo();  
      swingControlDemo.showEventDemo();       
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showEventDemo(){
      headerLabel.setText("Control in action: Button"); 

      JButton okButton = new JButton("OK");
      JButton submitButton = new JButton("Submit");
      JButton cancelButton = new JButton("Cancel");
//Add Code here for submit and cancel button


      okButton.setActionCommand("OK");
      submitButton = new JButton("Submit");
      cancelButton = new JButton("Cancel");


// Add Code here for submit and cancel button

      okButton.addActionListener(new ButtonClickListener());
      submitButton.addActionListener(new ButtonClickListener());
      cancelButton.addActionListener(new ButtonClickListener());

// Add Code here for submit and cancel button

      controlPanel.add(okButton);
      controlPanel.add(submitButton);
      controlPanel.add(cancelButton);
// Add Code here for submit and cancel button



      mainFrame.setVisible(true);  
   }

   private class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       
       if( command.equals( "OK" ))  {
          statusLabel.setText("Ok Button clicked.");
       } else if( command.equals( "Submit" ) )  {
           statusLabel.setText("Submit Button clicked");
// Add Code here for submit 
       } else {
          statusLabel.setText("Cancel Button clicked.");
       }  	
    }		
    }
}
