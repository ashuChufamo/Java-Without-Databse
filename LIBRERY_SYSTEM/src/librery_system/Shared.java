
package librery_system;
import java.util.Scanner;
import java.util.ArrayList;
public class Shared implements Store {
    Scanner input =new Scanner(System.in);
    int num;
    public String password;
    
    
    ArrayList< String>Book_list=new ArrayList<>();
     ArrayList< String>book_list=new ArrayList<>();
    public void borrow_book(){
        Book_list.clear();
        String book_name;
      ;
        System.out.println("enter your password");
        password=input.next();
        System.out.println("how many book do you want to borrow?");
        num=input.nextInt();
        if(num<3){
            for(int i=0;i<num;i++){
                System.out.println("what is the name of the book do you want to borrow?");
        book_name=input.next();
        if(book_Store.contains(book_name)){
        Book_list.add(book_name);
                
            }else{System.out.println("thise book is not exist in the book store");}
        }
        
        
        
    }else{System.out.println("the maximum number of the book you can borrow is 3");}
}
    public void return_book(){
       String book_name;
        book_list.clear();
        System.out.println("inheritance 1");
        System.out.println("how many book do you want to retrun?");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){
            System.out.println("thise is the shared for method");
            System.out.println("what is the name of the book do you want to return?");
            book_name=input.next();
            book_list.add(book_name);
            
        
        }
    
    
    }
}
