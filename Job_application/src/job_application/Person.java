
package job_application;
import java.util.Scanner;
import java.util.HashMap;
public class Person implements Job{
    Scanner input=new Scanner(System.in);
    String name;
    String id;
    
   

    public void register(){
       System.out.print("what is your name?");
       name=input.nextLine();
       System.out.println("give him an identification card");
       id=input.nextLine();
      }
    public void show_job(){
       //System.out.println("hey dude");
       System.out.println(field_key);
       for(int i=0;i<field_key.size();i++){
               //System.out.println("hey i am stoned");
               //System.out.println("name of the job:   " + JOb_collection.values());
           //System.out.println(JOb_collection);
          // System.out.println(key.get(i));
              System.out.println("Name of the job:    "+ job_key.get(i));
              System.out.println("______degree_level_it_needs"+JOb_collection.get(job_key.get(i)).get(0));
              System.out.println("_____ years of experiance:  "+ JOb_collection.get(job_key.get(i)).get(1));
              System.out.println("______dead line:  "+ JOb_collection.get(job_key.get(i)).get(2));
              System.out.println("______number of worker nedded:  "+JOb_collection.get(job_key.get(i)).get(3));
              System.out.println("______salary:  "+JOb_collection.get(job_key.get(i)).get(4));
           }
      }
}
