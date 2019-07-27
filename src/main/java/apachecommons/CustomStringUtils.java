package apachecommons;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class CustomStringUtils extends StringUtils {

    public static boolean isAllLowerCase(final CharSequence cs) {
        return functionCall(cs, Character::isLowerCase);
    }

    private static boolean functionCall(CharSequence cs, Predicate<Character> predicate) {
        if (cs == null || isEmpty(cs)) {
            return false;
        }
        final int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            if(!predicate.test(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUpperCase(final CharSequence cs) {
        return functionCall(cs, Character::isUpperCase);
    }
}
