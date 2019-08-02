package apachecommons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import static apachecommons.Constants.*;

public class IOFileFilterExamples {

    private static final Logger logger = Logger.getLogger(FileUtilsExampls.class.getName());

    File file  = new File(EXAMPLE_TXT_PATH);
    File file2  = new File(EXAMPLE_TXT_PATH2);
    File file3  = new File(EXAMPLE_TXT_PATH3);

    @Test
    public void testListFiles(){

        final Collection<File> files = FileUtils
                .listFiles(file3, new SuffixFileFilter(".txt"),
                        new SuffixFileFilter("_java"));
        files.stream().forEach(System.out::println);
    }
}
