package java8.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static java8.streams.Person.Gender.FEMALE;
import static java8.streams.Person.Gender.MALE;

@Data
@AllArgsConstructor
@Builder
public class Person {
    private long id;
    private String name;
    private Gender gender;
    private LocalDate Dob;
    private double income;

    enum Gender {
        MALE, FEMALE
    }
    public static List<Person> persons() {
        Person ken = Person.builder()
                .id(1)
                .name("Jame")
                .gender(MALE)
                .Dob(LocalDate.of(1970,
                        Month.MAY, 4))
                .income(6123.0)
                        .build();
        Person jeff = new Person(2, "Jeff", MALE, LocalDate.of(1971,
                Month.JULY, 5), 7112.0);
        Person donna = new Person(3, "Jane", FEMALE, LocalDate.of(1972,
                Month.JULY, 9), 8712.0);
        Person chris = new Person(4, "Jodd", MALE, LocalDate.of(1973,
                Month.DECEMBER, 6), 1823.0);
        Person laynie = new Person(5, "Janey", FEMALE, LocalDate.of(1974,
                Month.DECEMBER, 3), 1234.0);
        Person lee = new Person(6, "Jason", MALE, LocalDate.of(1975, Month.MAY,
                8), 2412.0);

        // Create a list of persons
        List<Person> persons = Arrays.asList(ken, jeff, donna, chris, laynie, lee);

        return persons;
    }
}
