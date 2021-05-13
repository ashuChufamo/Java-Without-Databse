
package librery_system;
import java.util.Scanner;
public class Head_librerian_menu extends Head_librerian {
    Scanner input=new Scanner(System.in);
    private String head_pass;
    public void Head_librerian(){
        System.out.println(" if you are head librerian");
        System.out.println("enter your password");
       head_pass=input.next();
        if(head_pass.equals("atr/3774/10")){
            System.out.println("to add librerian");
            System.out.println("____println(1)");
            System.out.println("back");
            System.out.println("____println(2)");
            System.out.println("exis");
            System.out.println("____println(3)");
            String value;
            Head_librerian h=new Head_librerian();
            Menu m=new Menu();
            while(true){
                value=input.next();
                switch(value){
                    case "1":h.add_librerian();
                        break;
                    case "2":m.menu();
                        break;
                    case "3":System.exit(0);
                        
                        
                         
                        
                
                
                }
            
            }
        
        
        }
    
    
    }
}
