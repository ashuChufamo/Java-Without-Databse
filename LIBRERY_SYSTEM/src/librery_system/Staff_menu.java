
package librery_system;
import java.util.Scanner;
public class Staff_menu extends Staff implements Store {
  Scanner input=new Scanner(System.in);
    private String staff_pass;
    public void Staff_menu(){
        System.out.println(" if you are staff");
        System.out.println("enter your password");
       staff_pass=input.next();
       System.out.println(staff_pass);
       System.out.println(Student_pass);
        if(Staff_pass.contains(staff_pass)){
            System.out.println("to borrow book");
            System.out.println("____println(1)");
            System.out.print("to return book");
            System.out.println("____println(2)");
            System.out.println("back");
            System.out.println("____println(3)");
            System.out.println("exis");
            System.out.println("____println(4)");
            String value;
            Menu m=new Menu();
            while(true){
                value=input.next();
                switch(value){
                    case "1": borrow_book();
                        break;
                    case "2":return_book();
                        break;
                    case "3":m.menu();
                        break;
                      
                    case "4":System.exit(0);
}
            }
        }
    }
}

