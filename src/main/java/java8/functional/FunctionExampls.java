package java8.functional;

import com.google.common.collect.Lists;
import java8.Employee;

import java.util.List;
import java.util.function.Function;

public class FunctionExampls {
    static List<Employee> employeeList = Lists.newArrayList(
            new Employee(123, "Ajay", "Garg"),
            new Employee(231, "Neha", "Garg"),
            new Employee(456, "Aayu", "Garg")
    );

    static Function<Employee, String> employeeStringFunction = Employee::getName;

    static Function<Employee, Integer> getId = Employee::getId;

    static Function<Integer, Integer> squareId = value -> value * 2;

    public static void main(String[] args) {
        List<String> employeeNames = convertEmployeeToNames(employeeList,
                employeeStringFunction.andThen(String::toLowerCase));

        List<Integer> ids = testComponse(employeeList, getId);
        employeeNames.forEach(System.out::println);
        ids.forEach(System.out::println);

        List<Employee> employees = testIdentity(employeeList, Function.identity());
        employees.forEach(System.out::println);
    }

    private static List<Integer> testComponse(List<Employee> employeeList, Function<Employee, Integer> function){
        List<Integer> ids = Lists.newArrayList();
        employeeList.forEach(emp -> ids.add(squareId.compose(function).apply(emp)));
        return ids;
    }
    private static List<String> convertEmployeeToNames(
            List<Employee> employeeList, Function<Employee,
            String> employeeStringFunction) {
        List<String> strings = Lists.newArrayList();
        employeeList.forEach(emp -> strings.add(employeeStringFunction.apply(emp)));
        return strings;
    }

    private static List<Employee> testIdentity(List<Employee> emps, Function<Employee, Employee> function){
        List<Employee> employees = Lists.newArrayList();
        emps.forEach(emp -> employees.add(function.apply(emp)));
        return employees;
    }
}
