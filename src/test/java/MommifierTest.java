import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_null_String_exception_when_given_null() {
        assertThrows(NullStringException.class, () -> {
            Mommifier mommifier = new Mommifier();
            mommifier.convert(null);
        });
    }

    @Test
    void should_return_itself_when_string_without_continuous_of_vowels() {
        //Given
        Mommifier mommifier = new Mommifier();
        String stringWithoutContinuousOfVowels = "aeiou";
        //When
        String result = mommifier.convert(stringWithoutContinuousOfVowels);
        //Then
        assertEquals(stringWithoutContinuousOfVowels, result);
    }
}
