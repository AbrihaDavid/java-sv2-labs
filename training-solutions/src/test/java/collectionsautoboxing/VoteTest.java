package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResultTest() {

        Vote vote = new Vote();
        Map<String,VoteResult> result = new HashMap<>();
        result.put("Jack",VoteResult.NO);
        result.put("Bob",VoteResult.YES);
        result.put("Tom",VoteResult.YES);
        result.put("Bill",VoteResult.NO);
        result.put("Jason",VoteResult.ABSTAIN);

        assertEquals(2,vote.getResult(result).get(VoteResult.NO));
        assertTrue(vote.getResult(result).containsValue(1));
    }
}