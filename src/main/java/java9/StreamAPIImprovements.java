package java9;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/*
Good read about new features: https://dzone.com/articles/java-9-streams-and-process-api

Also this: https://blog.indrek.io/articles/whats-new-in-java-9-streams/

 */
public class StreamAPIImprovements {
    List<String> strings = List.of("First", "Second", "Third", "Fourth");
    List<Person> personList = Person.persons();

    @Test
    void testTakeWhileStreams() {
        List<String> d = strings.stream()
                .takeWhile(element -> !element.endsWith("d"))
                .collect(Collectors.toList());
        assertThat(d).containsExactly("First");
    }

    /*
    Please note: when stream is not ordered, results of takewhile and dropwhile
    are not guaranteed.
     */
    @Test
    void testDropWhileWithOrderedStream() {
        Set<Integer> numbers = Set.of(2, 4, 6, 8, 9, 10, 12);
        List<Integer> collect = numbers.stream()
                .dropWhile(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
        assertThat(collect).containsExactlyInAnyOrder(9, 10, 12);
    }

    @Test
    void testStreamIterate() {
        Stream<Integer> iterate = Stream.iterate(1, integer -> integer + 2);
        //New Iterate method

        Stream<Integer> iterate1 = Stream.iterate(2, i -> i < 4, y -> y + 1);

        assertThat(iterate1).containsExactlyInAnyOrder(2, 3);
    }

    @Test
    void testOfNullable() {
        Person p = null;
        assertThat(Stream.ofNullable(p)).isEmpty();
    }
}
