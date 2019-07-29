package apachecommons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import static apachecommons.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FileUtilsExampls {

    private static final Logger logger = Logger.getLogger(FileUtilsExampls.class.getName());

    File file  = new File(EXAMPLE_TXT_PATH);
    File file2  = new File(EXAMPLE_TXT_PATH2);
    File file3  = new File(EXAMPLE_TXT_PATH3);

    @Test
    @Disabled
    public void testDeleteDirectory() throws IOException {
        FileUtils.deleteDirectory(file);
    }

    @Test
    public void testReadFileToString() throws IOException {
        String s = FileUtils.readFileToString(file, Charset.defaultCharset());
        assertThat(s).contains("This is a text file");
    }

    @Test
    public void testDeleteQuietly() {
        boolean s = FileUtils.deleteQuietly(file2);
        assertThat(s).isTrue();
    }

    @Test
    public void testCopyFile() throws IOException {
        FileUtils.copyFile(file ,file2);
        assertThat(file2).hasSameContentAs(file);
    }

    @Test
    public void testWriteStringToFile() throws IOException {
        String s = "new string";
        FileUtils.writeStringToFile(file2, s, Charset.defaultCharset(), true);
        assertThat(file2).toString().contains(s);
    }

    @Test
    public void testForceMakeDir() throws IOException {
       FileUtils.forceMkdir(file3);
       assertThat(file3).exists();
    }

    @Test
    public void testListFiles() {
        List<File> fileList = (List<File>) FileUtils.listFiles(file3, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        assertThat(fileList).hasSize(11);
    }



}
