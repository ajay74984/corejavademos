package googleguava.collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiMapExample {

    @Test
    public void testMultiMapExample1(){
        Multimap<String, String> multimap = ArrayListMultimap.create();
        String key = "a-key";

        multimap.put(key, "first");
        multimap.put(key, "second");

        multimap.entries().forEach(entry ->
                System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue()));


        final boolean second = multimap.remove(key, "second");

        assertThat(second).isTrue();
        final Collection<String> strings = multimap.get(key);
        System.out.println(strings);
    }
}
