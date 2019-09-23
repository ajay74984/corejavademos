package java11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class NewFileMethods {

    @Test
    void testWriteAndReadString() throws IOException {
        var value = "value to be written";
        Files.writeString(Path.of("test.txt"), value);
        String readString = Files.readString(Path.of("test.txt"));
        assertThat(readString).isEqualTo(value);
    }

    @Test
    void testIsSameFile() throws IOException {
        assertThat(Files.isSameFile(Path.of("test.txt"),
                Path.of("test.txt"))).isTrue();
    }
}

