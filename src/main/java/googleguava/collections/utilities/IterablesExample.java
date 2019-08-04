package googleguava.collections.utilities;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IterablesExample {

    List<String> list = Lists.newArrayList("hello", "hello2", "hello3", "hello4");
    List<String> list_new = Lists.newArrayList("hello5", "hello2", "hello6", "hello7");

    /*
    CollectionsUtils and Java8 also has filter and transform
     */
    @Test
    public void testIterablesFilter(){
        final Iterable<String> hello = Iterables.filter(list, element -> element.endsWith("4"));
        hello.forEach(System.out::println);
    }

    @Test
    public void testIterablesTransform(){
        final Iterable<String> aNew = Iterables.transform(list_new, element -> element.concat("_new"));
        aNew.forEach(System.out::println);
    }

    /*
    Will return only single element, else will throw an errors
     */
    @Test
    public void testIterables(){
        assertThatThrownBy(()-> Iterables.getOnlyElement(list))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testIterablessConcat(){
        final Iterable<String> concat = Iterables.concat(list, list_new);
        final Integer integer = Iterables.get(Sets.newHashSet(1, 3), 1);
        assertThat(integer).isEqualTo(3);
    }

    @Test
    public void testGetLast(){
        final Integer last = Iterables.getFirst(Sets.newHashSet(), 5);
        assertThat(last).isEqualTo(5);
    }

    @Test
    public void testFrequency(){
        List<String> list = Lists.newArrayList("A", "A", "C");
        assertThat(Iterables.frequency(list, "A")).isEqualTo(2);
    }

    @Test
    public void testPartition(){
        List<String> strings = Lists.newArrayList("B", "C", "D", "E", "E", "N");
        final Iterable<List<String>> partition = Iterables.paddedPartition(strings, 2);
        partition.forEach(System.out::println);
    }


}
