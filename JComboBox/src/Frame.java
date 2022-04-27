//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    //Array of Strings
    String[] pc = {"Mi","Asus","MacBook"};

    //new JComboBox
    JComboBox ComboBox;

    //new JButton
    JButton button;

    Frame() {

        //classifying button inside the Constructor
        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        //classifying ComboBox inside the Constructor and adding the array list
        ComboBox = new JComboBox(pc);

        //JFrame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(ComboBox);
        this.pack();
        this.setVisible(true);




    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            System.out.println("You Want "+ComboBox.getSelectedItem());
        }

    }
}
