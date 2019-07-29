package apachecommons;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

import static apachecommons.Constants.EXAMPLE_TXT_PATH;
import static apachecommons.Constants.EXAMPLE_TXT_PATH4;
import static org.assertj.core.api.Assertions.assertThat;

public class IOUtilsDemo {

    File file = new File(EXAMPLE_TXT_PATH);
    File file2 = new File(EXAMPLE_TXT_PATH4);

    InputStream inputStream;

    public IOUtilsDemo() throws FileNotFoundException {
        inputStream = new FileInputStream(file);
    }

    @Test
    public void testToString() throws IOException {
       String content = IOUtils.toString(inputStream, Charset.defaultCharset());
       assertThat(content).contains("This is a text file");
   }
    /*
           copyLarge could be used for copying large files likes 2GB
    */
   @Test
    public void testCopy() throws IOException {
        OutputStream outputStream = new FileOutputStream(file2);
       IOUtils.copy(inputStream, outputStream);
       assertThat(file2).hasSameContentAs(file);
   }

    @Test
    public void testToByteArray() throws IOException {
        byte[] byteArray = IOUtils.toByteArray(inputStream);
    }

    @Test
    public void testToInputStream() throws IOException {
        final String input = "hello";
        InputStream inputStream = IOUtils.toInputStream(input, Charset.defaultCharset());
        final String s = IOUtils.toString(inputStream, Charset.defaultCharset());
        assertThat(s).isEqualTo(input);
    }


    @Test
    public void testReadLines() throws IOException {
        final List<String> readLines = IOUtils.readLines(new FileInputStream(file), Charset.defaultCharset());
        assertThat(readLines).hasSize(2);
    }

    @Test
    public void testLineIterator() throws IOException {
        final LineIterator lineIterator = IOUtils.lineIterator(new FileInputStream(file), Charset.defaultCharset());
        lineIterator.forEachRemaining(System.out::println);
    }

    @Test
    public void testReadFully() throws IOException {
        final byte[] bytes = IOUtils.readFully(new FileInputStream(file), 2);
        assertThat(bytes).hasSize(2);
        assertThat(new String(bytes)).contains("Th");
    }
}
