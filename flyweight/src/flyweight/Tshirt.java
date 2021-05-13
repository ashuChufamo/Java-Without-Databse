package flyweight;

/*
FLYWEIFHT PATTERN :
    .enables us to use sharing of objects
    .WE CAN USE FLYWEIGHT WHEN
        .we  need a large number of similar objects that are unique only in terms of few parameters
         and the other staff is simillar
        .To control memory consumption by large number of objects by
            creating some objects and sharing them across


   .Flyweight objects have two types of attributes:
        1.Intrinsic attributes:it is stored/shared in the flyweght object
                              .is independent of fly weight context
                              .is usally immutable
        2.Extrinsic attributes: varies with the flyweight objects context
                              .they can't be shared


*/

public interface Tshirt
{  
    public void setColor(String color);
    public void wearTshirt();
}
enum TshirtSize {  // used to store shared or intrinsic attributes
    XL, XXL, XXXL
}
