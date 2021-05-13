
package job_application;
import java.util.Scanner;
public class Menu {
    



Scanner input=new Scanner(System.in);
 static String value;
  public void menu(){
       Jobposter p=new Jobposter ();
       Job_seekers j=new Job_seekers();
       System.out.println("what do you want to do?");
           System.out.println("get_Rgistered");
           System.out.println("__if you are job seeker");
           System.out.println("____print(a)");
           System.out.println("to see registerd student");
           System.out.println("____pritnln(b)");
           System.out.println("post job");
           System.out.println("__println(c)");
           System.out.println("find job");
           System.out.println("__println(d)");
           System.out.println("apply_for_job");
           System.out.println("____println(e)");
           
           System.out.println("to exist");
           System.out.println("___print(EXIST)");
           
       while (true){
       value=input.nextLine();
       switch(value){
           case "a": j.register();
           
               break;
           case "b":j.show_registered_student();
               break;
           case "c":p.post_job();
               break;
           case "d": j.show_job();
               break;
           case "e": j.applay_for_job();
               break;
           case "EXIST":System.exit(0);
              
       }
       
       
       }
           
               
           
           }
           
           }
           
           
                   
           
   



