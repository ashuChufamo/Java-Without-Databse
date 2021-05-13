

package librery_system;

import java.util.Scanner;
public class Staff extends Shared implements Store {
    public void  borrow_book(){   
                super.borrow_book();
                Staff_borrow.put(password, Book_list); 
                System.out.println(Student_borrow);
                
                Staff_who_borrow.add(password);
            System.out.println(Student_borrow);
    }  
    public void return_book(){
        System.out.println("enter your password");
        password=input.next();
        if(Staff_who_borrow.contains(password)){
            System.out.println("thise is the if method");
            super.return_book();
            
                System.out.println("thise is the for method");
                 System.out.println(Staff_borrow.get((password)));
                   System.out.println(Staff_borrow);
                   
                   System.out.println(Book_list);
                    System.out.println(book_list);
                if(Staff_borrow.get(password).containsAll(book_list)){
                    System.out.println("this is the if method again");
                    Staff_borrow.get(password).retainAll(book_list);
                    System.out.println(Staff_borrow.get(password));
                    System.out.println(Staff_borrow);
                }else{System.out.println("there is abook name in the list that you arenot borrowed");}
            
            
            }
        
        else{System.out.println("you have not borrowed!!!");}
    
    }
        
    
}

    

