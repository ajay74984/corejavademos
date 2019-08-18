package regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class RegExExamples {

    public static int runTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    @Test
    void testSimple(){
        final int i = runTest("ajay", "ajay ajay");
        assertThat(i).isEqualTo(1);
    }

    @Test
    void testWithDotMetaCharacter(){
        final int runTest = runTest("aj.", "ajay");
        assertThat(runTest).isEqualTo(1);
    }

    @Test
    void testOrCharacters(){
        int matches = runTest("[ja]", "ajay");
        assertThat(matches).isEqualTo(3);
    }

    @Test
    void testOrCharacters2(){
        int matches = runTest("[bcr]at", "bat cat rat");
        assertThat(matches).isEqualTo(3);
    }
    @Test
    void testNORCharacters(){
        int matches = runTest("[^abc]", "def");
        assertThat(matches).isEqualTo(3);
    }

    @Test
    void testRangeUpperClass(){
        int matches = runTest("[A-Z]", "Hello This is A Test");
        assertThat(matches).isEqualTo(4);
    }


    @Test
    void testRangeLowerClass(){
        int matches = runTest("[a-z]", "Hello");
        assertThat(matches).isEqualTo(4);
    }

    @Test
    void testRangeUpperAndLowerClass(){
        int matches = runTest("[a-zA-Z]", "Hello");
        assertThat(matches).isEqualTo(5);
    }

    @Test
    void testNumberRange(){
        int matches = runTest("[1-3]", "Hello 2");
        assertThat(matches).isEqualTo(1);
    }

    @Test
    void testUnion(){
        int matches = runTest("[a-z[1-2]]", "Hello12");
        assertThat(matches).isEqualTo(6);
    }

    @Test
    void testDigits(){
        int matches = runTest("\\d", "123hello");
        assertThat(matches).isEqualTo(3);
    }

    @Test
    void testNonDigits(){
        int matches = runTest("\\D", "123hello");
        assertThat(matches).isEqualTo(5);
    }

    @Test
    void testWithWhiteSpace(){
        int matches = runTest("\\s", " it has couple of white spaces ");
        assertThat(matches).isEqualTo(7);
    }

    @Test
    void testWithoutWhiteSpace(){
        int matches = runTest("\\S", " Nospace ");
        assertThat(matches).isEqualTo(7);
    }

    /*
    this is equivalent to [a-zA-Z_0-9]
     */
    @Test
    void testWord(){
        int matches = runTest("\\w", "Word123$$$$$");
        assertThat(matches).isEqualTo(7);
    }

    @Test
    void testNonWord(){
        int matches = runTest("\\W", "Word123$$$$$");
        assertThat(matches).isEqualTo(5);
    }

    /*
    this will also match en empty string at the end, so result is 4
     */
    @Test
    void testQuantifiersZeroOrOne(){
        int matches = runTest("\\d?", "123");
        assertThat(matches).isEqualTo(4);
    }

    @Test
    void testQuantifiersZeroOrOneAlternative(){
        int matches = runTest("a{1,2}", "aaa");
        assertThat(matches).isEqualTo(2);
    }

    /*
    This will match 0,1,2 occurrences
     */
    @Test
    void testQuantifiersZeroOrOneAlternative2(){
        int matches = runTest("a{0,2}", "aaa");
        assertThat(matches).isEqualTo(3);
    }

    /*
    This will match 0 or limitless occurrences
     */
    @Test
    void testZeroOrLimitlessTimes(){
        int matches = runTest("a*", "aaa");
        assertThat(matches).isEqualTo(2);
    }

    @Test
    void testOneOrLimblessTimes(){
        int matches = runTest("a+", "aaa");
        assertThat(matches).isEqualTo(1);
    }

    /*
    It will match aa twice
     */
    @Test
    void testNumbersOfOccurrences(){
        int matches = runTest("a{2}", "aaaa");
        assertThat(matches).isEqualTo(2);
    }

    @Test
    void testMixAndMatch(){
        int matches = runTest("a{2,3}?", "aaaa");
        assertThat(matches).isEqualTo(2);
    }

    @Test
    void testEmailAddress(){
        final int i = runTest("\\w+@\\w+\\.\\w+", "ajay_garg@gmaail.com");
        assertThat(i).isEqualTo(1);
    }

    /*
    This is a good way to use group
     */
    @Test
    void testNegateSuccessor(){
        final int i = runTest("(.)(?!\\1)", "goooood");
        assertThat(i).isEqualTo(3);
    }

    @Test
    void testStringLength(){
        final int i = runTest("[a-z][1-9][^a-z][^A-Z][A-Z].*", "q9$?WWe");
        assertThat(i).isZero();
    }

    @Test
    void testBackReference(){
        final int i = runTest("([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])"+
        "([aeiouAEIOU])(\\S)\\1\\2\\\3\\4\\5\\6\\7\\8\\9\\10){20}", "q9$?WWe");
        assertThat(i).isZero();
    }





}
