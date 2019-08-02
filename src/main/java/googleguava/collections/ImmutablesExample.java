package googleguava.collections;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ImmutablesExample {

    private Map<String, String> immutablMap = ImmutableMap.of("Key", "Value");

    private Map<String, String> muttableMap = new HashMap<>();

    private Map<String, String> immutableMap2 = ImmutableMap.copyOf(muttableMap);

    private Set<String> immutableSet = ImmutableSet.<String>builder().add("hello").build();

    @Test
    public void testPut(){
        //immutablMap.put("Should throw exception", "");
       // immutableMap2.put("Should throw exception", "");
        muttableMap.put("Should throw exception", "value");

        immutableMap2.keySet().stream()
                .forEach(System.out::println);

    }

    @Test
    public void testUnmodifiableVsImmutable(){

        Map<String, String> mutableMap2 = new HashMap<>();
        mutableMap2.put("IND", "India");

        Map<String, String> immutableMap = ImmutableMap.copyOf(mutableMap2);

        assertThatThrownBy(() -> immutableMap.put("NPL", "Nepal"))
                .isInstanceOf(UnsupportedOperationException.class);

        //remove elements from mutable map
        mutableMap2.remove("IND");

        assertThat(immutableMap).containsKey("IND");

        //add elements

        mutableMap2.put("SL", "Sri Lanka");
        assertThat(immutableMap).doesNotContainKeys("SL");

    }

    @Test
    public void testUnmodifiable() {
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("IND", "India");

        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);

        assertThatThrownBy(() -> unmodifiableMap.put("NPL", "Nepal"))
                .isInstanceOf(UnsupportedOperationException.class);

        //remove elements from mutable map
        mutableMap.remove("IND");

        assertThat(unmodifiableMap).doesNotContainKey("IND");

        //add elements

        mutableMap.put("SL", "Sri Lanka");
        assertThat(unmodifiableMap).containsKey("SL");
    }

}
