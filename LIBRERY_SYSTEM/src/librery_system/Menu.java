
package librery_system;
import java.util.Scanner;
public class Menu {
    Scanner input=new Scanner(System.in);
    public void menu(){
        System.out.println("____who are you____");
        System.out.println("head_librerian ");
        System.out.println("____println(1)");
        
        System.out.println("librerian");
        System.out.println("____println(2)");
        System.out.println("Student");
        System.out.println("____println(3)");
        System.out.println("Staff");
        System.out.println("____println(4)");
        System.out.println("exist");
        System.out.println("____println(5)");
        int value;
        Librerian_menu l=new Librerian_menu();
        Head_librerian_menu H=new Head_librerian_menu();
       
        Student_menu s=new Student_menu();
        Staff_menu st=new Staff_menu();
        while(true){
            value=input.nextInt();
            switch(value){
                case 1:H.Head_librerian();
                    break;
                case 2:l.lib_menu();
                    break;
                case 3:s.Student_menu();
                    break;
                case 4:st.Staff_menu();
                    break;
                case 5:System.exit(0);
                  
            }
        
        
        
        }
        
    
    }
    
}
