package java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceImprovementExample {
    /*
    Deprecated is just for reference purpose here
    These two parameters has been added here since Java 9 to provide more meta data information.
     */
    @Deprecated(since = "version", forRemoval = true)
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        /*
        With Java 9, we can declare final or possible final objects in try block
        Before Java 9, try(FileOutputStream stream2 = fileOutputStream) -> had to do something like this.
        Good Read -> https://beginnersbook.com/2018/05/java-9-try-with-resources-enhancements/
         */
        try (fileOutputStream) {
            //We are writing this string in the output file using FileOutputStream
            String mystring = "We are writing this line in the output file.";

            //Converting the given string in bytes
            byte[] bytes = mystring.getBytes();

            //Writing the bytes into the file
            fileOutputStream.write(bytes);

            //Displaying success message after the successful write operation
            System.out.println("The given String is written in the file successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
