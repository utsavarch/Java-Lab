import java.awt.*;    
import javax.swing.*;    
    
public class Border   
{    
JFrame f;    
Border()  
{    
    f = new JFrame();    
        
     // creating buttons  
    JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH   
    //add your code here
    JButton b3 = new JButton("EAST");; // the button will be labeled as EAST  
    JButton b4 = new JButton("WEST");; // the button will be labeled as WEST  
    JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER  
    JButton b6 = new JButton("SOUTH");;
    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
//add your code here
    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
    f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
    f.add(b6, BorderLayout.SOUTH);
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new Border();    
}    
}    