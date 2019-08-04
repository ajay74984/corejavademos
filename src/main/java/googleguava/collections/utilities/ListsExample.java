package googleguava.collections.utilities;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListsExample {

    public static final List<String> LIST = Lists.newArrayList("A", "B", "B");

    @Test
    public void testReverse(){
        final List<String> list = Lists.newArrayList("A", "B");
        final List<String> reverse = Lists.reverse(list);
        reverse.forEach(System.out::println);
    }

    @Test
    public void testStringToCharacters(){
        final ImmutableList<Character> hello = Lists.charactersOf("Hello");
        hello.forEach(System.out::println);
    }

    @Test
    public void testRemoveDuplicate(){
        final ImmutableList<String> strings = ImmutableSet.copyOf(LIST).asList();
        strings.forEach(System.out::println);
    }

    @Test
    public void removeNullValues(){
        final ArrayList<String> strings = Lists.newArrayList(null, "BCA", "ABC", null);
        Iterables.removeIf(strings, Predicates.isNull()); //this can remove any null values from any Iterable
        assertThat(Iterables.getLast(strings)).isNotNull();
        assertThat(strings).hasSize(2);
    }


}
