package java11;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class MiscAPIChanges {

    /*
    Difference between asPredicate and asMatchPredicate -> asMatch -> check whole string and asPredicate check substring
    https://github.com/mtumilowicz/java11-pattern-asMatchPredicate-vs-asPredicate/blob/master/README.md
     */
    @Test
    void testAsMatchPredicate() {
        var pattern = Pattern.compile("\\d+");
        Predicate<String> stringPredicate = pattern.asMatchPredicate();
        assertThat(stringPredicate.test("123")).isTrue();
    }

    @Test
    void testAsPredicate() {
        var pattern = Pattern.compile("[a-z]");
        Predicate<String> stringPredicate = pattern.asPredicate();
        Predicate<String> stringPredicate1 = pattern.asMatchPredicate();
        assertThat(stringPredicate.test("123a")).isTrue(); //will return true as substring matches
        assertThat(stringPredicate1.test("123a")).isFalse(); //will return false as whole string does not matche
    }

    @Test
    void testEmptyOptional() {
        Optional optional = Optional.empty();
        assertThat(optional.isEmpty()).isTrue();
    }

}
