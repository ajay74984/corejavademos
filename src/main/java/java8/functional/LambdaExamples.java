package java8.functional;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class LambdaExamples {

    public static void main(String[] args) {
    }


    public static Integer testIntegerOperations(BinaryOperator<Integer> function){
        return function.apply(10,5);
    }

    @Test
    public void testSum(){
        assertThat(testIntegerOperations(Integer::sum)).isEqualTo(10);
    }

    @Test
    public void testMultiply(){
        assertThat(testIntegerOperations(Integer::min)).isEqualTo(5);

    }


}
