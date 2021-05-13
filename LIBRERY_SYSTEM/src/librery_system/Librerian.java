
package librery_system;
import java.util.Scanner;
public class Librerian implements Store{
    Scanner input=new Scanner(System.in);
    String name;
    String password;
    public void register(){
        System.out.println("how many do you want to register?");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){ 
            System.out.println("what do you want to register");
            System.out.println("Student");
            System.out.println("____pritnln(1)");
            System.out.println("Staff");
            System.out.println("____println(2)");
            int x=input.nextInt();
            System.out.println("what is the name do you want to register?");
            name=input.next();
            System.out.println("give him/her apassword");
            
            password=input.next();
            if(x==1){
            Student_pass.add(password);
            }else{Staff_pass.add(password);}
           
        }
    
    }
    public void add_bookk(){
        System.out.println("how many book do you want to add?");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){
            System.out.println("what is the name of the book do you want to add?");
            String book_name=input.next();
            book_Store.add( book_name);
            System.out.println("what is the author of the book?");
            String book_author=input.next();
            
        }
    }
    public void remove_book(){
        System.out.println("how many book do you want to remove?");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){
            System.out.println("what is the name of he book do you want to remove?");
            String remove_book=input.next();
            book_Store.remove(remove_book);
            
        
        }
    }
    public void Show_book_store(){
        System.out.println("___these are the books available here___");
        for(int i=0;i<book_Store.size();i++){
            System.out.println(book_Store.get(i));
        
        }
    
    }
        
}
