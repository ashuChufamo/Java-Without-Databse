package se2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assumptions.*;

class Assumption {


    //   linear Search
    private static  int[] numbers= {10,20,30,40,50,90,50};
    private static  int key = 50;

    @Test
    public static void main(String [] args) {
        
       assumeTrueWithNoMessage();
       assumeFalseWithNoMessage();
       assumingThatWithBooleanCondition();
    }


    @Test
    public static void  assumeTrueWithNoMessage(){
//        System.setProperty("ENV","DEV");
        System.out.println(System.getProperty("ENV"));
        assumeTrue("DEV".equals(System.getProperty("ENV")));
        System.out.println("Assumption Passed!!!");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
    }

    @Test
    public static void assumeFalseWithNoMessage(){
//        System.setProperty("ENV","DEV");
        assumeFalse("DEV".equals(System.getProperty("ENV")));
        System.out.println("Assumption Passed!!!");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
    }
    @Test
    public static void assumingThatWithBooleanCondition(){
//        System.setProperty("ENV","DEV");
        assumingThat("DEV".equals(System.getProperty("ENV")),() ->{
            System.out.println("Assumption passed!!");

            assertEquals(4,LinearSearch.linearSearch(numbers,50));

        });

        System.out.println("Excutable in All Environment!!!");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));

    }
}
