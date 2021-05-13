package eventhandlingexaample;
import javax.swing.*;
import java.awt.event.*;
public class Eventhandlingexaample extends JFrame implements ActionListener{
    JButton jb1, jb2,ashua;
    JTextField userText;
    JLabel lb1,lb2,lb3;
    JPasswordField passwordText;

    public Eventhandlingexaample()
    {
        lb1=new JLabel("Enter UserName and Password");
        lb2=new JLabel("UserName");
        lb3=new JLabel("Password");
        userText= new JTextField(60);
        passwordText = new JPasswordField(60);
        jb1= new JButton("Log in");
        jb2= new JButton("Clear");
        ashua= new JButton("to ashu");
        lb1.setBounds(10, 50, 200, 40);
        lb2.setBounds(10, 100, 200, 40);
        lb3.setBounds(10, 150, 200, 40);
        userText.setBounds(90,100,200,30);
        passwordText.setBounds(90, 150, 200, 30);
        jb1.setBounds(10, 200, 100, 40);
        jb2.setBounds(150, 200, 135, 40);
        ashua.setBounds(150, 270, 135, 40);
        add(jb1);
        add(jb2);
        add(ashua);
        add(lb1);
        add(lb2);
        add(lb3);
        add(userText);
        add(passwordText);
        setTitle("Login Form");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        ashua.addActionListener(this);
    }
   
    public static void main(String[] args) 
    {
        new Eventhandlingexaample();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==jb1)
        {
            String us="ashu";
            String ps= "1234";
            String getus=userText.getText();
            String getpass= passwordText.getText();
            if(getus.equals(us)&& getpass.equals(ps))
            {
                JOptionPane.showMessageDialog(null,"Correct account");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"incorrect account");          
            }
        }
        else if(e.getSource()==jb2)
        {
            userText.setText(null);
            passwordText.setText(null);
        }
        else if (e.getSource()==ashua)
        {
            userText.setText("ashued");
        }
        
    }
   
    
}
