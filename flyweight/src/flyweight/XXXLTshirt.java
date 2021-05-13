package flyweight;
public class XXXLTshirt implements Tshirt {
     
    final TshirtSize tshirtSize =TshirtSize.XXXL;    //intrinsic state - shareable
    private String color = null;                    //extrinsic state - supplied by client
     
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void wearTshirt() {
              System.out.println(" you are wearing big sized(XXXL) Tshirt of color :" + color);

    }

   
}