
package librery_system;
import java.util.Scanner;
public class Head_librerian  implements Store{
    Scanner input=new Scanner(System.in);
    private String password;
    public void add_librerian(){
        System.out.println("how many librerian do you want to add?");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){
            System.out.println("what is the name of the librerian do you want to add?");
            String name=input.next();
            System.out.println("give him/her a password");
             password=input.next();
            LIB_pass.add(password);
            System.out.println("you have finished!");
        
        
        }
    
    }
}
