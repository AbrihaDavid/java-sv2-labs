package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {

        assertTrue(new Palindrome().isPalindrome("dad"));
        assertFalse(new Palindrome().isPalindrome("ddad"));
        assertTrue(new Palindrome().isPalindrome("pallap"));
    }
}