import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_null_String_exception_when_given_null() {
        assertThrows(NullStringException.class, () -> {
            Mommifier mommifier = new Mommifier();
            mommifier.convert(null);
        });
    }
}
