package java9;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private double income;

    public static List<Person> persons() {
        Person ken = Person.builder()
                .name("Jame")
                .income(6123.0)
                .build();
        Person jeff = new Person("Jeff", 600);
        Person donna = new Person("Jane", 8712.0);
        Person chris = new Person("Bodd", 800);
        Person laynie = new Person("Janey", 1234.0);
        Person lee = new Person("Aason", 2412.0);

        // Create a list of persons
        List<Person> persons = Arrays.asList(ken, jeff, donna, chris, laynie, lee);

        return persons;
    }
}
