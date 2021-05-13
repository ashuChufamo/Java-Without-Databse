package imagebutton;

import javax.swing.*;

public class Imagebutton {
    public static void main(String[] args) 
    {
        JFrame f= new JFrame();
        JButton b= new JButton(new ImageIcon("a.jpg"));
        b.setBounds(50, 100, 200, 200);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
}
