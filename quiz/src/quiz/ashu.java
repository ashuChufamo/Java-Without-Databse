package quiz;

import java.util.ArrayList;
public class ashu {
    int start,Long;
  double [] array={0};
  
public void tranckate(int start, int Long)
{
    this.start=start;
    this.Long=Long;
    ArrayList<Double> newArray= new ArrayList<>();
    if (start + Long<= array.length){
        for (int i = 0;i<Long;i++)
        {newArray.add(array[start]);
        start+=1; }
    
for (double k:newArray)
{System.out.print(k+", ");}}
    else {
    System.out.println("it's impossible");}
if (Long==0){System.out.print("noting to print ");}}}
