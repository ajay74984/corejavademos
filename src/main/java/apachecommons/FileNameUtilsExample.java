package apachecommons;

import org.apache.commons.io.FilenameUtils;

import java.util.logging.Logger;

public class FileNameUtilsExample {

        private static final String EXAMPLE_TXT_PATH =
                "C:\\Users\\ajay7\\test.txt";
        private static final Logger logger = Logger.getLogger(FileNameUtilsExample.class.getName());

    public static void main(String[] args) {
        logger.info(FilenameUtils.getFullPath(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getBaseName(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getExtension(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getName(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getPath(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getFullPathNoEndSeparator(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.getPrefix(EXAMPLE_TXT_PATH));
        logger.info(FilenameUtils.normalize(EXAMPLE_TXT_PATH)); //will remove . or .. from file path
    }
}
