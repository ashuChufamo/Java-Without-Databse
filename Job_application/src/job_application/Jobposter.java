
package job_application;
import java.util.ArrayList;
import java.util.Scanner;
public class Jobposter extends Person implements Job,Store{
    Scanner input=new Scanner(System.in);
     String field_name;
   public void register(){
       super.register();
       jop_posters.add(id);
   } 
   public void post_job(){
        
        System.out.println("how many job do yuu want to add?");
        int num=input.nextInt();
        for(int x=0;x<=num;x++){
            
            
           
            System.out.println("what study field job do you want to add?");
            field_name=input.next();
            field_key.add(field_name);
            ArrayList<String>neww=new ArrayList<>();
             //job_collection.clear();
             System.out.println("what is the job name do you want to add?");
             String j_name=input.next();
             //neww.add(j_name);
            job_key.add(j_name);
           System.out.println("what degree_level needs:"
                       + "DIMPLOMA("
                       + "DEGREE"
                       + "MSC"
                       + "PHD");
           String degre_level=input.next();
           neww.add(degre_level);
             System.out.println("how many year of experiance nedded?");
             String  num1=input.next();
             neww.add(num1);
             System.out.println("when is the dead line?");
             String num2=input.next();
            neww.add(num2);
            System.out.println("how many nedded");
            String num3=input.next();
            neww.add(num3);
            System.out.println("how much is the salary?");
            String salary=input.next();
            neww.add(salary);
             System.out.println( job_collection);
             JOb_collection.put(j_name, neww);
             //Job_info.put(field_key, JOb_collection);
             System.out.println(JOb_collection);
             
             
        }
        
        
   }
   public void show_job(){
       super.show_job();
      }
   }
