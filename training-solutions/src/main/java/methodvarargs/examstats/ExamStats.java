package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("No results were provided");
        }
        int counter = 0;
        for (int i : results) {
            if ( (double) i / maxPoints * 100 > limitInPercent) {
                counter++;
            }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results.length == 0) {
            throw new IllegalArgumentException("No results were provided");
        }
        boolean failed = false;
        for (int i : results) {
            if ( (double) i / maxPoints * 100 < limitInPercent) {
                failed = true;
                return failed;
            }
        }
        return failed;
    }
}
