package java10;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

/*
    Good Read: https://www.baeldung.com/java-10-local-variable-type-inference
 */
public class TypeInferLocalVariableExample {

    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        var map = new HashMap<>();
        assertThat(map).isInstanceOf(HashMap.class);
    }
}
