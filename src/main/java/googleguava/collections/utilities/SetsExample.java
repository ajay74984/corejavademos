package googleguava.collections.utilities;

import com.google.common.base.Predicates;
import com.google.common.collect.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetsExample {

    public static final Set<String> stringHashSet = Sets.newHashSet("A", "B", "B");

    @Test
    public void testCartesianProduct(){
        final Set<List<Integer>> lists = Sets.cartesianProduct(Sets.newHashSet(1, 2),
                Sets.newHashSet(2, 5));
        lists.forEach(System.out::println);
    }

    @Test
    public void test(){
        final Set<Set<Integer>> powerSet = Sets.powerSet(Sets.newHashSet(1, 2));
        powerSet.forEach(System.out::println);
    }

}
