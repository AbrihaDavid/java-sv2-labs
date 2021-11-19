package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer t = null;

        for (Trainer trainer: trainers){
            if (t == null ||  trainer.getAge() > t.getAge()){
                t = trainer;
            }
        }
        return t;
    }
}
