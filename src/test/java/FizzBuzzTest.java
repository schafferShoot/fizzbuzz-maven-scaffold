import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void name() {
        int num = 3;
        assertThat(FizzBuzz.of(num)).isEqualTo("Fizz");

    }
}
