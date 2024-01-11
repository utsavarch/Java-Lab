import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Palindrome extends JFrame

{

    public static void main(String[] args)

    {

        Palindrome frame = new Palindrome();

        frame.setVisible(true);

    }

    public Palindrome()

    {

        setLayout(new GridLayout(4,1,10,20));

        JLabel inputLabel = new JLabel("Input any String: ");

        JTextField inputTextField = new JTextField(20);

        add(inputLabel);

        add(inputTextField);

        JLabel outputLabel = new JLabel("Output: ");

        JTextField outputTextField = new JTextField(20);

        add(outputLabel);

        add(outputTextField);

        outputTextField.setEditable(false);

        JButton checkPalindromeButton = new JButton("Check Palindrome");

        add(checkPalindromeButton);

        JButton reverseButton = new JButton("Reverse");

        add(reverseButton);

        JButton findVowelButton = new JButton("Find Vowel");

        add(findVowelButton);

        checkPalindromeButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent e)

            {

                String copyUserInput="";

                String userInput = inputTextField.getText();

                int length = userInput.length();

                for (int i = length-1; i>=0; i-- )

                {

                    copyUserInput = copyUserInput + userInput.charAt(i);

                }

                if (copyUserInput.equalsIgnoreCase(userInput))

                {

                    outputTextField.setText("String is palindrome.");

                }

                else

                {

                    outputTextField.setText("String isn't a palindrome.");

                }

            }

        });

        reverseButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent e)

            {

                String reverseUserInput="";

                String userInput = inputTextField.getText();

                int length = userInput.length();

                for (int i = length-1; i>=0; i-- )

                {

                    reverseUserInput = reverseUserInput + userInput.charAt(i);

                }

                    outputTextField.setText("Reverse String is: "+ reverseUserInput);

            }

        });



        findVowelButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent e)

            {

                char[] vowel={'a','e','i','o','u','A','E','I','O','U'};

                String userInput = inputTextField.getText();

                int length = userInput.length();

                char[] extractedVowel= new char[length];

                String showVowel="";

                for (int i =0; i<=length-1; i++ )

                {

                    for (int j = 0; j<=vowel.length-1; j++)

                    {

                        if(userInput.charAt(i)== vowel[j])

                        {

                            extractedVowel[i] = userInput.charAt(i);

                            showVowel = showVowel + String.valueOf(extractedVowel[i]); //append the extractedVowel to string variable so that it can be displayed at once in a textfield in the form of string.

                        }

                    }

                }

               outputTextField.setText("Vowels: "+showVowel);

            }

        });

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}