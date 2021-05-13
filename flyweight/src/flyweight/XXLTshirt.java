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
public class XXLTshirt implements Tshirt {
     
    final TshirtSize tshirtSize = TshirtSize.XXL;
    private String color = null;
     
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void wearTshirt() {
       System.out.println("you are wearing  MEDIUM sized(XXL) Tshirt of color :" + color);
    }

    
 
    
}