package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections(){
        int start = 0;
        int divergence = 0;
        int steps = 0;
        for (int i = 0; start != 360; i++){
            divergence = divergence + 10;
            start = start + divergence;
            steps = steps + 1;
        }
        return steps;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();

        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
