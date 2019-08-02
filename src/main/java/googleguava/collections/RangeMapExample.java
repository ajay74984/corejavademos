package googleguava.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class RangeMapExample {

    RangeMap<Integer, String> rangeMap;

    @Test
    public void testRangeMap(){
        assertThat(rangeMap.get(4)).isEqualTo("Associate");
    }

    @Test
    public void testRemove(){
        rangeMap.remove(Range.closed(2,10));
        assertThat(rangeMap.get(9)).isNull();
    }

    @BeforeEach
    void setUp() {
        rangeMap = initMap();
    }

    @Test
    public void test(){
        final Map.Entry<Range<Integer>, String> entry = rangeMap.getEntry(2);
        System.out.println("Key= " + entry.getKey().toString() + "Value = "+ entry.getValue());
    }

    private RangeMap<Integer, String> initMap() {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

        rangeMap.put(Range.closed(0,5), "Associate");
        rangeMap.put(Range.closed(5,10), " Senior Associate");
        rangeMap.put(Range.closed(11,15), "Super Senior Associate");
        return rangeMap;
    }
}
