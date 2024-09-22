package first_homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class fizzbuzzTest {
    @Test
    public void testFizzBuzz() {
        fizzbuzz fizzbuzz = new fizzbuzz();
        assertEquals("1", fizzbuzz.getValue(1));
        assertEquals("2", fizzbuzz.getValue(2));
        assertEquals("4", fizzbuzz.getValue(4));
        assertEquals("fizz", fizzbuzz.getValue(5));
        assertEquals("6", fizzbuzz.getValue(6));
        assertEquals("fizzbuzz", fizzbuzz.getValue(35));
    }
}
