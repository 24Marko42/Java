package first_homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(Palindrome.isPalindrome("level"));
        assertTrue(Palindrome.isPalindrome("А роза упала на лапу Азора"));
    }
    @Test
    public void testIsPalindromeFalse() {
        assertFalse(Palindrome.isPalindrome("Hello"));
        assertFalse(Palindrome.isPalindrome("Java"));
    }
}
