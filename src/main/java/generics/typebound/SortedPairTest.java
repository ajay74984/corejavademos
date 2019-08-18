package generics.typebound;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortedPairTest {

    @Test
    void correctOrderShouldGiveAlreadySortedValue() {
        SortedPair<Integer> sortedPair = new SortedPair<>(1, 2);
        assertThat(sortedPair.getFirst()).isEqualTo(1);
        assertThat(sortedPair.getSecond()).isEqualTo(2);
    }

    @Test
    void incorrectOrderShouldNotGiveAlreadySortedValue() {
        SortedPair<Integer> sortedPair = new SortedPair<>(2, 1);
        assertThat(sortedPair.getFirst()).isEqualTo(1);
        assertThat(sortedPair.getSecond()).isEqualTo(2);
    }
}
