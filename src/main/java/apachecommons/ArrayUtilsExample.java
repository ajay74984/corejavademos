package apachecommons;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilsExample {

    private static final String[] STRINGS = {"A"};

    public static final String[] STRINGS_UNSORTED = {"D", "C", "A"};

    @Test
    public void testContains(){
        final boolean a = ArrayUtils.contains(new String[]{"A", "B"}, "A");
        assertThat(a).isTrue();
    }

    @Test
    void testAddAll(){
        final String[] strings = ArrayUtils.addAll(STRINGS, "B");
        assertThat(strings).contains("A","B");
    }

    @Test
    public void testClone(){
        final String[] clone = ArrayUtils.clone(STRINGS);
        assertThat(clone).containsExactly("A");
    }

    @Test
    public void testIsEmpty(){
        final boolean empty = ArrayUtils.isEmpty(STRINGS);
        assertThat(empty).isFalse();
        ArrayUtils.add(null, null);
    }

    @Test
    public void testIsSorted(){
        final boolean sorted = ArrayUtils.isSorted(STRINGS_UNSORTED);
        assertThat(sorted).isTrue();
    }


}
