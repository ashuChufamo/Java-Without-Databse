package menu;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu implements ActionListener {
   
        JFrame f;
        JMenuBar mb;
        JMenu file,edit,help;
        JMenuItem cut, copy, paste, selectAll;
        JTextArea ta;
        JTextArea area;
        public Menu()
        {     
            f= new JFrame();
            area= new JTextArea(300,300);
            area.setBounds(10, 30, 400, 400);
            area.setBackground(Color.pink);
            file= new JMenu("file");
            edit= new JMenu("edit");
            help= new JMenu("Help");
            cut= new JMenuItem("cut");
            copy= new JMenuItem("copy");
            paste= new JMenuItem("paste");
            selectAll= new JMenuItem("select all");
            mb= new JMenuBar();
            mb.setBounds(5, 5, 400, 40);
            edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
            mb.add(file);mb.add(edit);mb.add(help);
            f.add(area);
            f.add(mb);
            f.setLayout(null);
            f.setSize(500, 500);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            cut.addActionListener(this);
            copy.addActionListener(this);
        }
        
     public static void main(String[] args) 
    {
        new menu.Menu();
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cut)
        {
            //String h=area.getText();
            area.setText("cut");
            JOptionPane.showMessageDialog(null,"Correct account");
            area.setText(null);
            //System.out.println("cut");
//            String us="ashu";
//            String ps= "1234";
//       
//            if(getus.equals(us)&& getpass.equals(ps))
//            {
//                JOptionPane.showMessageDialog(null,"Correct account");
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"incorrect account");          
//            }
        }
        else if(e.getSource()==copy)
        {
            System.out.println("copy");
            area.setText("copy");
//            userText.setText(null);
//            passwordText.setText(null);
        }
    }
}
