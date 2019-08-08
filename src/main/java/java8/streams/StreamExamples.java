package java8.streams;

import com.google.common.collect.Lists;
import java8.Employee;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java8.streams.Person.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StreamExamples {

    private static List<Employee> employeeList = Lists.newArrayList(
            new Employee(456, "Ajay", "Garg", 100.00),
            new Employee(131, "Neha", "Garg1", 20000.00),
            new Employee(856, "Aayu", "Garg2", 3000.00)
    );

    @Test
    public void testMapStream(){
        final List<Integer> collect = employeeList
                .stream()
                .map(employee -> employee.getId())
                .collect(Collectors.toList());
        assertThat(collect).containsExactly(123,231,456);
    }

    @Test
    public void testFilterStreams(){
        final List<Employee> collect = employeeList
                .stream()
                .filter(employee -> employee.getId() > 400)
                .collect(Collectors.toList());
        assertThat(collect).containsExactly
                (new Employee(456, "Aayu", "Garg", 400.00));
    }

    @Test
    public void testFindFirstStreams(){
        final Employee collect = employeeList
                .stream()
                .filter(employee -> employee.getId() > 100)
                .findFirst()
                .orElse(null);
        assertThat(collect).isEqualTo(
                new Employee(123, "Ajay", "Garg", 4000.00));
    }

    @Test
    public void testToArrayStreams(){
        final Employee[] collect = employeeList
                .stream()
                .filter(employee -> employee.getId() > 400)
                .toArray(Employee[]::new);
        assertThat(collect).containsExactly
                (new Employee(456, "Aayu", "Garg", 5000.00));
    }

    @Test
    public void testFlatMapStreams(){
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("First", "List", "withsize3"),
                Arrays.asList("Second", "List"),
                Arrays.asList("Third", "List")
        );

        final List<String> collect = listOfList
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        assertThat(collect)
                .withFailMessage("Size should be %d", 1)
                .containsExactly("First", "List",
                        "withsize3", "Second", "List",
                        "Third", "List");
    }

    @Test
    public void testFlatMapWithArrayofArrays(){
        String[][] dataArray = new String[][]{
                {"a", "b"},
                {"c", "d"},
                {"e", "f"},
                {"g", "h"}};

        final List<String> collect = Arrays.stream(dataArray)
                .flatMap(ar -> Arrays.stream(ar))
                .collect(Collectors.toList());

        assertThat(collect).hasSize(8);
    }

    @Test
    public void testPeek(){
        employeeList.stream()
                .peek(e -> e.idChange(3))
                .forEach(System.out::println);
    }

    @Test
    public void testInfiniteStream(){
        final Stream<Integer> iterate = Stream.iterate(2, i -> i * 2);
        final List<Integer> collect = iterate
                .skip(3)
                .limit(2)
                .collect(Collectors.toList());
        assertThat(collect).containsExactly(16,32);
    }

    @Test
    public void testSkipAndLimit(){
        final List<Employee> collect = employeeList
                .stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        assertThat(collect).containsExactly(
                new Employee(231, "Neha", "Garg", 5500.00),
                new Employee(456, "Aayu", "Garg", 343.5)
        );
    }

    @Test
    public void testSorted(){
        final List<Employee> collect = employeeList
                .stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        assertThat(collect.get(0).getName()).isEqualTo("Aayu");
    }

    @Test
    public void testMin(){
        final Employee optionalEmployee = employeeList
                .stream()
                .min((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .orElse(null);
        assertThat(optionalEmployee).isEqualTo
                (new Employee(456, "Aayu", "Garg", 400.44));
    }

    @Test
    public void testComparing(){
        List<Employee> employeeList = Lists.newArrayList(
                new Employee(456, "Ajay", "Garg", 100.1),
                new Employee(131, "Neha", "Garg", 100.0),
                new Employee(856, "Aayu", "Garg2",100.5));

        final List<Employee> optionalEmployee = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getId))
                .collect(Collectors.toList());

        assertThat(optionalEmployee).containsSequence(
                        new Employee(131, "Neha", "Garg",100.0 ),
                        new Employee(456, "Ajay", "Garg", 100.1),
                        new Employee(856, "Aayu", "Garg2", 100.2)
        );
    }

    @Test
    public void testDistinct(){
        List<Employee> employeeList = Lists.newArrayList(
                new Employee(456, "Ajay", "Garg", 100),
                new Employee(456, "Ajay", "Garg", 100),
                new Employee(456, "Ajay", "Garg", 100));

        final long count = employeeList.stream()
                .distinct()
                .count();
        assertThat(count).isEqualTo(1);
    }

    @Test
    public void testNMatchOperations(){
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        boolean allEven = intList.stream()
                .allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream()
                .anyMatch(i -> i % 2 == 0);
        boolean noneMatch = intList.stream()
                .noneMatch(i -> i>9);

        assertThat(allEven).isFalse();
        assertThat(oneEven).isTrue();
        assertThat(noneMatch).isTrue();
    }

    /*
    difference between map and map to int is that map will return a stream of double
    where as mapToDouble will return double value
     */
    @Test
    public void testPremittiveStreams(){
        final double sum = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        assertThat(sum).isEqualTo(23100.0);

        final OptionalInt max = employeeList.stream()
                .mapToInt(Employee::getId)
                .max();
        assertThat(max.getAsInt()).isEqualTo(856);
    }


    @Test
    public void testReduce(){
        final Double reduce = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        assertThat(reduce).isEqualTo(23100.0);
    }

    @Test
    public void testJoining(){
        final String collect = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(",", "#", "$"));
        assertThat(collect).isEqualTo("#Ajay,Neha,Aayu$");
    }

    @Test
    public  void testToCollection(){
        final Set<String> collect = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        assertThat(collect).containsExactlyInAnyOrder("Ajay", "Neha", "Aayu");
    }

    @Test
    public  void testSummarizingDouble(){
        final IntSummaryStatistics stats = employeeList.stream()
                .mapToInt(Employee::getId)
                .summaryStatistics();

        assertThat(stats.getMax()).isEqualTo(856);
        assertThat(stats.getCount()).isEqualTo(3);
        assertThat(stats.getMin()).isEqualTo(131);
        assertThat(stats.getAverage()).isEqualTo(481);
    }

    @Test
    public void testPartitionBy(){
        final Map<Boolean, List<Employee>> collect = employeeList.stream()
                .collect(Collectors
                        .partitioningBy(emp -> emp.getId() > 200));
        assertThat(collect.get(true)).hasSize(2);
        assertThat(collect.get(false)).hasSize(1);
    }

    @Test
    public void testGroupingBy() {
        List<Employee> employeeList = Lists.newArrayList(
                new Employee(456, "Ajay", "Garg", 100.00),
                new Employee(131, "Ajay", "Garg1", 20000.00),
                new Employee(856, "Aayu", "Garg2", 3000.00)
        );
        final Map<String, List<Employee>> collect = employeeList.stream()
                .collect(Collectors
                        .groupingBy(emp -> emp.getName()));
        assertThat(collect.get("Ajay")).hasSize(2);
        assertThat(collect.get("Aayu")).hasSize(1);
    }



}
