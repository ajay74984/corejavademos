package googleguava.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeSetExample {

    @Test
    public void testRangeSet(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(0,10));
        assertThat(rangeSet.contains(1)).isTrue();

        //Also an alternative to use apache Range
        org.apache.commons.lang3.Range<Integer> apacheRange = org.apache.commons.lang3.Range.between(1, 10);
        assertThat(apacheRange.contains(5)).isTrue();
    }

    @Test
    public void testRemoveRange(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.open(0,10));
        rangeSet.remove(Range.closed(2,5));

        assertThat(rangeSet.contains(2)).isFalse();

        assertThat(rangeSet.contains(6)).isTrue();
    }

    @Test
    public void testRangeSpan(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.open(05,10));
        rangeSet.add(Range.open(20,30));
        rangeSet.add(Range.open(40,50));

        assertThat(rangeSet.contains(11)).isFalse();

        Range<Integer> span = rangeSet.span();

        assertThat(span.lowerEndpoint()).isEqualTo(05);
        assertThat(span.upperEndpoint()).isEqualTo(50);
    }

    @Test
    public void testSubRange(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.open(05,10));
        RangeSet<Integer> subRange = rangeSet.subRangeSet(Range.closed(1,10));

        assertThat(subRange.contains(10)).isFalse();
        assertThat(subRange.contains(1)).isFalse();
        assertThat(subRange.contains(5)).isFalse();
        assertThat(subRange.contains(6)).isTrue();
    }

    @Test
    public void testComplement(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.open(05,10));
        RangeSet<Integer> complementRange = rangeSet.complement();
        assertThat(complementRange.contains(10)).isTrue();
        assertThat(complementRange.contains(1)).isTrue();
        assertThat(complementRange.contains(5)).isTrue();
        assertThat(complementRange.contains(6)).isFalse();
    }

    @Test
    public void givenRangeSet_whenIntersectsWithinRange_returnsSucessfully() {
        RangeSet<Integer> numberRangeSet = TreeRangeSet.create();

        numberRangeSet.add(Range.closed(0, 2));
        numberRangeSet.add(Range.closed(3, 10));
        numberRangeSet.add(Range.closed(15, 18));

        assertThat(numberRangeSet.intersects(Range.closed(4, 17))).isTrue();
        //check if there is subrange subset or not. Litterally does not check lower and upper bound
        assertThat(numberRangeSet.intersects(Range.closed(11, 70))).isTrue();

    }
}
