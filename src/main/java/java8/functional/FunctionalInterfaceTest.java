package java8.functional;

import org.junit.jupiter.api.Test;

public class FunctionalInterfaceTest {

    public void testMyInterface(int value, MyFunctionalInterface<Integer> myFunctionalInterface){
        myFunctionalInterface.test(value);
    }

    @Test
    public void test(){
        testMyInterface(3, System.out::println);
    }
}
