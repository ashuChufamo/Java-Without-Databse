
package job_application;

import java.util.ArrayList;
import java.util.Scanner;
public class Job_seekers extends Person implements Job{
    Scanner input=new Scanner(System.in);
    public void register(){
       
       ArrayList<String>info=new ArrayList<>();
       System.out.println("what is your name?");
       String name=input.next();
       info.add(name);
       System.out.println("give him/her an identification card");
       String id=input.next();
       id_key.add(id);
       info.add(id);
       System.out.println("are u male or female");
       String sex=input.next();
       info.add(sex);
       System.out.println("what is your field of study?");
       String field_of_study=input.next();
       info.add(field_of_study);
       Job_seeker_information.put(id, info);
       
       
    }
   public void show_job(){
    System.out.println("these are the jobs that are posted still");
    super.show_job();
    }
   public void show_registered_student(){
       System.out.println(Job_seeker_information);
           
       }
   public void applay_for_job(){
       int ctr=0;
       ctr++;
       
       System.out.println("enter your id");
       String idd=input.next();
       int x=0;
      
      // System.out.println(id_key.size());
       for(int v=0;v<id_key.size();v++){       
           //System.out.println(id_key.size());

           //System.out.println(id_key.get(x));
           if(id_key.contains (idd)){
               ctr++;
               System.out.println("for what field of study do you want to register?");
               String field_study=input.next();
               
               System.out.println("for what job do you want to register ?");
               String job=input.next();
               int y=0;
               int ctr2=0;
               
               while(y<job_key.size()){        
              
                   if( job_key.contains (job)){
                       ctr2++;
                       System.out.println("what is your degree_level on the job:"
                       + "diploma"
                       + "degree"
                       + "MSC"
                       + "PHD");
               String degree_level=input.next();
               //System.out.println(degree_level);
               //System.out.println(JOb_collection.get(job).get(0));
               if(JOb_collection.get(job).get(0).equals(degree_level)){
                    System.out.println("how much is your work experiance");
                    int experieance=input.nextInt();
                    
                    int var=Integer.parseInt((String) JOb_collection.get(job).get(1));
                    if(var<=experieance){
                        System.out.println("congra");
                        System.out.println("you have accpted");
                    }else{
                        System.out.println("your Experiance is less you will not be qualified here");
                    }
               }else{
                            System.out.println("your degrre level doesnt satisfie the requirment");
                            }
               }else{
                       continue;
               }
               
                   y++;
                   }if(ctr2==0){
                       System.out.println("Thise job is not exist here");
                   }else{System.out.println("you have finished");}
                   }else{
               continue;
           }
           
               x++;
               }
               }
               }
               
               
               
               
           
           
           
           
       
       
           
       
            
       
       
   
   
    

