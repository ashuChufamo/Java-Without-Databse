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
import java.util.HashMap;
 
public class TshirtsFactory
{
    
    private static final HashMap<String, Tshirt> TshirtsMap = new HashMap<>();
 
    public static Tshirt getXXXLTshirt(String color)
    {
        String key = color + "XXXL";
         
        Tshirt tshirt = TshirtsMap.get(key);
         // check if this Tshirt exists in the hash map
        if(tshirt != null) {
            return tshirt;//if this Tshirt exists in the hashmap return this Tshirt
        } else {
            tshirt = new XXXLTshirt();//else produce new Tshirt
            tshirt.setColor(color);
            TshirtsMap.put(key, tshirt);
        }
        return tshirt;
    }
     
    public static Tshirt getXLTshirt(String color)
    {
        String key = color + "XL";
        Tshirt tshirt = TshirtsMap.get(key);
        if(tshirt!= null) {
            return tshirt;
        } else {
            tshirt = new XLTshort();
            tshirt.setColor(color);
            TshirtsMap.put(key, tshirt);
        }
        return tshirt;
    }
     
    public static Tshirt getXXLTshirt(String color)
    {
        String key = color + "XXL";
         
        Tshirt tshirt =TshirtsMap.get(key);
         
        if(tshirt!= null) {
            return tshirt;
        } else {
            tshirt = new XXLTshirt();
            tshirt.setColor(color);
            TshirtsMap.put(key, tshirt);
        }
         
        return tshirt;
    }
}
