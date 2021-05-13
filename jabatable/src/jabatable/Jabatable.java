package jabatable;

import javax.swing.*;

public class Jabatable {
    public static void main(String[] args) 
    {
        JFrame f= new JFrame();
        String data[][]={{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};
        String column[]={"ID","Name","Sallary"};
        JTable jt=new JTable(data,column);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    
}
