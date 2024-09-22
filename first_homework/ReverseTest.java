package first_homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void testReverseString() {
        assertEquals("mom", Reverse.reverseString("mom"));
        assertEquals("rehtom", Reverse.reverseString("mother"));
        assertEquals("olleh", Reverse.reverseString("hello"));
        assertEquals("", Reverse.reverseString(""));
    }
}