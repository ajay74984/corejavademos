package java8.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExamples {

    List<Person> persons;
    @BeforeEach
    void setUp() {
        persons = Person.persons();
    }

    @Test
    void testToMap(){
        final Map<String, Person> collect = persons.stream()
                .collect(Collectors.toMap(Person::getName,
                        Function.identity()));
        collect.entrySet().forEach(System.out::println);
    }

    @Test
    void testAverage(){
        final Double collect = persons.stream()
                .collect(Collectors.averagingDouble(Person::getIncome));
        System.out.println(collect);
    }

    @Test
    void testSum(){
        final Integer collect = persons.stream()
                .collect(Collectors.summingInt(Person::hashCode));
        System.out.println(collect);
    }

    @Test
    void testMax(){
        persons.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getIncome)));
    }
}
