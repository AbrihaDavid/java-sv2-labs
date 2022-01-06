package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes){
        Map<VoteResult, Integer> result = new HashMap<>();
        int yes = 0;
        int no = 0;
        int abstain = 0;
        for (Map.Entry entry: votes.entrySet()){
            if (entry.getValue().equals(VoteResult.YES)){
                yes++;
            } else if (entry.getValue().equals(VoteResult.NO)){
                no++;
            } else {
                abstain++;
            }
        }
        result.put(VoteResult.YES,yes);
        result.put(VoteResult.NO,no);
        result.put(VoteResult.ABSTAIN,abstain);

        return result;
    }
}
