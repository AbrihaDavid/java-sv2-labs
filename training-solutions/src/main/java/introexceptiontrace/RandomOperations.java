package introexceptiontrace;

import java.util.Random;

public class RandomOperations {

    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {  // i<= lengthOfArray: nem kell az egyenlőségjel, mert úgy ArrayIndexOutOfBoundsException-t kapunk
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}