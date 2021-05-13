
package librery_system;
import java.util.Scanner;
public class Librerian_menu extends Librerian  implements Store{
    Scanner input=new Scanner(System.in);
    private String  pass;
    public void lib_menu(){
        System.out.println("enter your password");
         pass=input.next();
        
        Menu m=new Menu();
        if(LIB_pass.contains(pass)){
            System.out.println("what do you want to do?");
            System.out.println("To register");
            System.out.println("____println(1)");
            System.out.println("To add book");
            System.out.println("____println(2)");
            System.out.println("to remove book");
            System.out.println("____print(3)");
            System.out.println("to see book store");
            System.out.println("_____println(4)");
            System.out.println("back");
            System.out.println("_____pritnln(5)");
            System.out.println("exit");
            System.out.println("____println(6)");
           
            while(true){
                int num1=input.nextInt();
                switch(num1){
                    case 1:register();
                        break;
                    case 2:add_bookk();
                        break;
                    case 3:remove_book();
                        break;
                    case 4:Show_book_store();
                        break;
                    case 5:m.menu();
                        break;
                    case 6:System.exit(0);
                
                
                }
                
            }
            
        
        }else{System.out.println("you have not registerd!!");}
    
    
    }
    
}
