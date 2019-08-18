package java9;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CollectionFactoryMethods {

    public static final String KEY = "Key";
    public static final String VALUE = "Value";

    @Test
    void testCreateList() {
        List<String> strings = List.of("Ajay", "Neha");
        assertThatThrownBy(() -> strings.add("Can not add"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void testMapCreation() {
        Map<String, String> unmodiableMap = Map.of(KEY, VALUE);
        assertThat(unmodiableMap.get(KEY)).isEqualTo(VALUE);
    }
}
