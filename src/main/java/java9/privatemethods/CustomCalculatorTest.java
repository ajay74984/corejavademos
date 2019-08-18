package java9.privatemethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomCalculatorTest implements CustomCalculator {

    CustomCalculator calculator;

    @BeforeEach
    void setCalculator() {
        calculator = new CustomCalculatorTest();
    }

    @Test
    void testEvenSum() {
        int evenNumbers = calculator.addEvenNumbers(1, 2, 3, 5);
        assertThat(evenNumbers).isEqualTo(2);
    }
}
