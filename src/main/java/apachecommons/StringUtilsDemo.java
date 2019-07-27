package apachecommons;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.logging.Logger;

public class StringUtilsDemo {

    private static final Logger logger = Logger.getLogger(StringUtilsDemo.class.getName());
    public static void main(String[] args) {

        logger.info("Is Blank " + StringUtils.isBlank("  "));

        logger.info("Is Empty " + StringUtils.isEmpty(null));

        logger.info("Does start with " + StringUtils.startsWithIgnoreCase("abc", "A"));

        logger.info("Is Alpha " + StringUtils.isAlphanumeric("abc"));

        logger.info("Is Alpha " + StringUtils.isAlphanumericSpace("abc"));

        logger.info("Is Lower Case " + CustomStringUtils.isAllLowerCase("abcA"));

        logger.info("Is Upper Case with custom string utils " + CustomStringUtils.isAllUpperCase("ABCc"));

        logger.info("Padding " + StringUtils.center("bb", 6, "_"));

        logger.info("Chomp " + StringUtils.chomp("oooo\n"));

        logger.info("Join " + StringUtils.join(Arrays.asList("abc", "bd"), ","));

        logger.info("Newline");















    }
}
