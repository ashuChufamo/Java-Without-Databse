
package librery_system;
import java.util.Scanner;
public class Student_menu extends Student implements Store {
  Scanner input=new Scanner(System.in);
    private String student_pass;
    public void Student_menu(){
        System.out.println(" if you are student");
        System.out.println("enter your password");
       student_pass=input.next();
       System.out.println(student_pass);
       System.out.println(Student_pass);
        if(Student_pass.contains(student_pass)){
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
