import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu3 {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   public Menu3(){
      prepareGUI();
   }
   public static void main(String[] args){
      Menu3 menu3obj = new Menu3();
      menu3obj.showCheckBoxDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing");
      mainFrame.setSize(600,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
   private void showCheckBoxDemo(){
      headerLabel.setText("Favourite Sports");
      final JCheckBox checkBox1 = new JCheckBox("Football");
      final JCheckBox checkBox2 = new JCheckBox("Tennis");
      final JCheckBox checkBox3 = new JCheckBox("Rugby");
      final JCheckBox checkBox4 = new JCheckBox("Cricket");
      final JCheckBox checkBox5 = new JCheckBox("Racing");

      checkBox1.setMnemonic(KeyEvent.VK_F);
      checkBox2.setMnemonic(KeyEvent.VK_T);
      checkBox3.setMnemonic(KeyEvent.VK_U);
      checkBox4.setMnemonic(KeyEvent.VK_C);
      checkBox5.setMnemonic(KeyEvent.VK_A);
     

      checkBox1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Football Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));
         }
      });
      checkBox2.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Tennis Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));
        }
     });
     checkBox3.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Rugby Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));
        }
     });
     checkBox4.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Cricket Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));
        }
     });
     checkBox5.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
           statusLabel.setText("Racing Checkbox: "+ (e.getStateChange()==1?"checked":"unchecked"));
        }
     });

      controlPanel.add(checkBox1);
      controlPanel.add(checkBox2);
      controlPanel.add(checkBox3);
      controlPanel.add(checkBox4);
      controlPanel.add(checkBox5);

      mainFrame.setVisible(true);
   }
}