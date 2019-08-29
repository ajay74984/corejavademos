package java10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CollectionsImprovements {

    @Test
    void testCopyOf() {
        List<String> strings = new ArrayList<>();
        strings.add("Helllo");
        List<String> strings1 = List.copyOf(strings); //Collections.unmodifiableList(strings);
        assertThatThrownBy(() -> strings1.add("Should not get added"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void testCollectorsToUnmodifiableCollection() {
        List<String> strings = new ArrayList<>();
        strings.add("Helllo");
        strings.add("Bye");
        List<String> h = strings.stream()
                .filter(s -> s.startsWith("H"))
                .collect(Collectors.toUnmodifiableList());
        assertThatThrownBy(() -> h.add("Should not get added"))
                .isInstanceOf(UnsupportedOperationException.class);
    }
}
