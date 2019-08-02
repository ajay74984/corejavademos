package googleguava.throwables;

import com.google.common.base.Throwables;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ThrowableExample {

    @Test
    public void testGetRootCause() {
        try {
            throw new IOException(new IllegalArgumentException(new NumberFormatException("Foo")));
        } catch (Exception e) {
            assertThat(Throwables.getRootCause(e)).isInstanceOf(NumberFormatException.class);
            System.out.println(Throwables.getStackTraceAsString(e));
        }
    }

    @Test
    public void testPropagate() {
        try {
            throw new IOException(new IllegalArgumentException(new RuntimeException("Foo")));
        } catch (Throwable e) {

            Throwables.throwIfUnchecked(e);
           // System.out.println(Throwables.getCausalChain(e));
               // Throwables.propagateIfPossible(e, NumberFormatException.class);
            // Throwables.propagate(e);
            //Throwables.throwIfUnchecked(e);
        }
    }
}
