package generics;


import java.util.ArrayList;
import java.util.List;

public class BoundriesExamples {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person chottu = new Person(10, "chottu");
        Person chottuEmployee = new Employee(10, "chottuEmployee");
        Person bada_chottu = new Person(20, "bada chottu");
        Person chotta_chottu = new Person(30, "chotta chottu");
        people.add(chotta_chottu);
        people.add(bada_chottu);
        people.add(chottu);
        people.add(chottuEmployee);

        upperBoundExample(people);
    }

    public static void upperBoundExample(List<? extends Person> persons) {
        persons.forEach(System.out::println);
    }
}
