package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {

        assertTrue(new Prime().isPrime(2));
        assertTrue(new Prime().isPrime(7));
        assertTrue(new Prime().isPrime(13));
        assertFalse(new Prime().isPrime(88));
    }
}