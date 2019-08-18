package generics;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;

public class PersonExamples {
    public static void main(String[] args) {
        List<Person> persons = Lists.newArrayList(
                new Person(30, "Ajay"),
                new Person(31, "Neha"),
                new Person(15, "Neha2")
        );
        //System.out.println(persons);
        persons.sort(new AgeComparator());
        //System.out.println(persons);
        persons.sort(new ReverseComparator<>(new AgeComparator()));
        //System.out.println(persons);
        Person person = findMin(persons, new AgeComparator());
        System.out.println(person);
    }

    private static <T> T findMin(List<T> elements, Comparator<T> comparator) {
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T lowestElement = elements.get(0);

        for (int i = 1; i < elements.size(); i++) {
            if (comparator.compare(elements.get(i), lowestElement) < 0) {
                lowestElement = elements.get(i);
            }
        }
        return lowestElement;
    }

    private void findMinByUpperBound(List<? extends Person> elements) {

    }

}
