package java11;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StringImprove {

    @Test
    void testIsBlank() {
        assertThat("".isBlank()).isTrue();
        assertThat(" ".isBlank()).isTrue();
        assertThat("Not Blank".isBlank()).isFalse();
    }

    @Test
    void testLines() {
        var s = "Hello\nThis\nIs\nA\nNew\nLie";
        Stream<String> lines = s.lines();
        assertThat(lines.collect(Collectors.toList()))
                .containsExactlyInAnyOrder("Hello", "This", "Is", "A", "New", "Lie");
    }

    @Test
    void testRepeat() {
        var repeat = "hello";
        assertThat(repeat.repeat(2)).isEqualTo("hellohello");
    }

    @Test
    void testStripLeading() {
        var withSpaceInFrontAndBack = "  IAmAStringWithSpaces  ";
        assertThat(withSpaceInFrontAndBack.stripLeading()).isEqualTo("IAmAStringWithSpaces  ");
    }

    @Test
    void testStripTrailing() {
        var withSpaceInFrontAndBack = "  IAmAStringWithSpaces  ";
        assertThat(withSpaceInFrontAndBack.stripTrailing()).isEqualTo("  IAmAStringWithSpaces");
    }

    @Test
    void testStrip() {
        var withSpaceInFrontAndBack = "  IAmAStringWithSpaces  ";
        assertThat(withSpaceInFrontAndBack.strip()).isEqualTo("IAmAStringWithSpaces");
    }
}
