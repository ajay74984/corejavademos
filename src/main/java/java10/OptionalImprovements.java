package java10;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalImprovements {

    @Test
    void testElseGet() {
        Stream<Integer> integerStream = Stream.iterate(2, i -> i < 10, i -> i + 2);
        Integer integer = integerStream.filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow(); //will return value els throw NoSuchElementException
        assertThat(integer.intValue()).isEqualTo(2);
    }
}
