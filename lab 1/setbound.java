import javax.swing.*;
public class setbound {
    public static void main(String args[])
    {   
        JFrame frame =new JFrame("setbound method");
        frame.setSize(375,250 );
        frame.setLayout(null);
        JButton button=new JButton("hello");
        button.setBounds(80,30 ,120 ,40);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

