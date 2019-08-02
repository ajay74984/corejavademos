package googleguava.preconditions;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

import static com.google.common.base.Preconditions.*;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

public class PreconditionsExamples {

    public static void main(String[] args) {
        Car car = new Car (new TurboEngine());
        car.turnOn();
        car.accerlateTo(70);
        System.out.println(car);
        System.out.println(car.toStrings());
    }

    @Test
    public void testCheckElementIndex(){
        int[] intarray = new int[]{1, 2, 3};
        String message = "Please check the bound of the array and retry";

        assertThatThrownBy(() ->
                checkPositionIndex(6, ArrayUtils.getLength(intarray) -1, message))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageStartingWith(message)
                .hasNoCause();
    }
}
