/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author selam computer
 */
public class NewClass2 {
        
    //double [] array={1.0,2.6,-45,8.9,4.7};
    //double [] array={0};
    double [] array={1.0,2.6,8.9,4.7};
    // double [] array={1.0,2.6,45,8.9,4.7};
      
    public void isMin(){
        if (array.length%2==0){
            System.out.println(0);}
        else if(true){
            int temp1=(array.length-1)/2;
            double temp=array[temp1];
            int sum=0;
            for (double i:array){
            if (i<=temp)
                 {sum+=1;}}
                if (sum>1)
                  {System.out.println(0);}
                else
                {System.out.println(1);}
}
}
}
