/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

public class XLTshort implements Tshirt {
     
    final TshirtSize tshirtSize =TshirtSize.XL;// intrinsic state shareable
    private String color = null; //extrinsic state given by thre user
     
    public void setColor(String color) {
        this.color = color;
    }

   

    @Override
    public void wearTshirt() {
     System.out.println("you are wearing smaller size(XL) Tshirt of color : " + color);

    }
 
   
 
}
