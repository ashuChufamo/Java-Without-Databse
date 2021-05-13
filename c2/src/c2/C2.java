/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;
//imported items
import java.awt.Color;//for backgroun color
import java.io.BufferedReader;//message reader
import java.io.InputStreamReader;//message reader
import java.net.ServerSocket;//socket creater
import java.net.Socket;//socket acceptor
import javax.swing.JLabel;//some written things
import javax.swing.JTextField;//respose text field 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//for event handling
import java.io.IOException;//exception
import java.io.PrintStream;//to send
import java.util.Scanner;// scan
import javax.swing.JButton;//buttons GUI
import javax.swing.JFrame;//the whole frame of the GUI


public class C2 {
   public static void main(String[] args) 
    {
        //ServerSocket aa= new ServerSocket(300);
        Thread t1= new Thread(new sender("Client 2"));
        Thread t2= new Thread(new acceptor());//aa));//two threads for parallel processing
        t2.start();
        t1.start();
    }
}





//JFrame fot the frame, Runnable for thread and ActrionListener for event Handling
class sender extends JFrame implements Runnable, ActionListener{
    
    //some attributes
    String name;
    JButton jb1, jb2,jb3;
    JTextField userText;
    JLabel lb1,lb2;
    
    //constractor of the sender method and the GUI
    public sender(String  name)
    {
        this.name= name;
        lb1=new JLabel("Type and click for whom to send");
        lb2=new JLabel("give text");
        userText= new JTextField(60);
        jb1= new JButton("to server");
        jb2= new JButton("to client1");
        jb3= new JButton("broadcast");
        lb1.setBounds(10, 50, 200, 40);
        lb2.setBounds(10, 100, 200, 40);
        userText.setBounds(90,100,200,30);
        jb1.setBounds(10, 200, 100, 40);
        jb2.setBounds(150, 200, 135, 40);
        jb3.setBounds(75,280,135,40);
        add(jb1);
        add(jb2);
        add(jb3);
        add(lb1);
        add(lb2);
        add(userText);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Client2 sender");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setLocation(900,0);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    
    //the event handler
    @Override
    public void actionPerformed(ActionEvent e){
    String text=userText.getText();
    
    //to server
    if (e.getSource()==jb1){
        try
        {
           
            Scanner input= new Scanner(System.in);
            Socket sw;
            sw= new Socket("localhost", 300);
            String text2=name+" says: "+text;
            PrintStream ps= new PrintStream(sw.getOutputStream());
            ps.println(text2);
        }
        catch(Exception ex){System.out.println(ex.getMessage()); }
        }
    
    //to client 1
    else if(e.getSource()==jb2){
        try
        {
           
            Scanner input= new Scanner(System.in);
            Socket sw;
            sw= new Socket("localhost", 200);
            String text2=name+" says: "+text;
            PrintStream ps= new PrintStream(sw.getOutputStream());
            ps.println(text2);   
        }
        catch(Exception ex){System.out.println(ex.getMessage()); }
    
    //to broadcast
    }else if(e.getSource()==jb3){
        try
        {
           
            Scanner input= new Scanner(System.in);
            Socket sw;
                sw= new Socket("localhost", 200);
                String text2=name+" says: "+text;
                PrintStream ps= new PrintStream(sw.getOutputStream());
                ps.println(text2);
                sw= new Socket("localhost", 300);
                ps= new PrintStream(sw.getOutputStream());
                ps.println(text2);
             
        }
        catch(IOException ex){System.out.println(ex.getMessage()); }}}
    
    //the run method
    @Override
    public void run(){}}



//JFrame for the frame, Runnable for thread and ActrionListener for event Handling
class acceptor extends JFrame implements Runnable {
    
    //some attrbutes
    JLabel lb1;
    JTextField mess;

    //constractor of the acceptor and the GUI
    public acceptor(){
        lb1=new JLabel("messages");
        lb1.setBounds(150, 50, 180, 40);
        mess= new JTextField(60);
        mess.setBackground(Color.GRAY);
        mess.setBounds(10, 100, 350, 150);
        add(lb1);
        add(mess);
        setTitle("client 2 message Form");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(900,400);
        setVisible(true);}
    
    //the run method with some acceptor and reader code
    @Override
    public void run() {
        try{
            ServerSocket aa= new ServerSocket(400);
            Socket sw;
            InputStreamReader st;
            BufferedReader br;
            String message=null;;
            
            while (message==null || message.equalsIgnoreCase("exit")!=true){
                
                sw= aa.accept();
                //read what the client sent
                st = new InputStreamReader(sw.getInputStream());
                br= new BufferedReader(st);    
                message = br.readLine();
                mess.setText(message);
            
                    }            
            }
        catch(Exception ex){System.out.println(ex.getMessage());}}
    
}

