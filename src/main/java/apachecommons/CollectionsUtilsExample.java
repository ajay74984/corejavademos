package apachecommons;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsUtilsExample {

    List<String> emptyList = new ArrayList<>(Arrays.asList("A", "B"));

    @Test
    public void testIsEmpty(){
        final boolean empty = CollectionUtils.isEmpty(emptyList);
        assertThat(empty).isTrue();
    }

    @Test
    public void testSelect(){
        final Collection<String> b = CollectionUtils.select(emptyList, element -> element.equals("B"));
        assertThat(b).contains("B");
    }

    @Test
    public void testTransform(){
        CollectionUtils.transform(emptyList, String::toLowerCase);
        emptyList.forEach(System.out::println);
        emptyList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @Test
    public void testFilter(){
        final boolean b1 = emptyList.removeIf(element -> element.equalsIgnoreCase("B"));
        assertThat(b1).isTrue();
        assertThat(emptyList).containsExactly("A");
    }



}
