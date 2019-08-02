package googleguava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultisetExample {

    @Test
    public void testMultiSetExample1(){

        Multiset<String> bookStore = HashMultiset.create();
        bookStore.add("Learn");
        bookStore.add("Learn");
        bookStore.add("Learn2");
        bookStore.add("Learn1");
        bookStore.add("Learn3");

        assertThat(bookStore).contains("Learn");
        assertThat(bookStore.count("Learn")).isEqualTo(2);

        bookStore.entrySet().stream().forEach(entry ->
                System.out.println("Element= " + entry.getElement() + " Count= " + entry.getCount()));


    }


}
