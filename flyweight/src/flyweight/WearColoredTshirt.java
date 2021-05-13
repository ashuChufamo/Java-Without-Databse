/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author 123
 */
public class WearColoredTshirt
{
    public static void main(String[] args)
    {
        Tshirt yellowLargeTshirt1 = TshirtsFactory.getXXXLTshirt("YELLOW");  // new Tshirt created
        yellowLargeTshirt1.wearTshirt();         
        Tshirt yellowLargeTshirt2 = TshirtsFactory.getXXXLTshirt("YELLOW");  //Tshirt is shared
        yellowLargeTshirt2.wearTshirt();
         //NOTE yellowThikTshirt1 AND yellowThinPen2 SEEMS DIFFERENT OBJECTS BUT THEY ARE THE SAME OBJECTS
        Tshirt blueLargeTshirt = TshirtsFactory.getXXXLTshirt("BLUE");       //new Tshirt created
        blueLargeTshirt.wearTshirt();
        // check which of the Tshirrts are similar BY USING THEIR HASH CODE
        
        System.out.println("");
        System.out.println("################## SEE WHICH OF THE OBJECTS HAVE THE SAME LACATION USING HASHCODE ############################");
        System.out.println("The hashcode of yellowLargeTshirt1 is :"+yellowLargeTshirt1.hashCode());
        System.out.println("The hashcode of yellowLargeTshirt2 is :"+yellowLargeTshirt2.hashCode());
        System.out.println("");
        System.out.println("The hashcode of blueLargeTshirt is :"+blueLargeTshirt.hashCode());
        System.out.println("#################### TWO OBJECRTS HAVING SAME HASHCODE MEANS THE OBJECT IS ONE ########################"); 
        System.out.println("");
        if(yellowLargeTshirt1.hashCode()==yellowLargeTshirt2.hashCode()){
        System.out.println(" So yellowLargeTshirt1 and yellowLargeTshirt2 are one object names");
        }
    }
}
