package java8.functional;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleSupplier;

public class MoreFunctionExamples {

    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Ajay", 1000);
        employeeMap.put("Vijay", 2000);
        employeeMap.put("Sanjay", 3000);

        employeeMap.replaceAll((name, salary) -> name.equals("Ajay") ? salary + 10000000 : salary);
        employeeMap.forEach((k, v) -> System.out.println(k + " " + v));
    }

    @Test
    public void testSupplier(){
        System.out.println(usageSupplier(()-> Math.random()));
    }

    public static double usageSupplier(DoubleSupplier intSupplier){
        return intSupplier.getAsDouble();
    }
}
