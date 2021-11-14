package introexceptionthrowjunit4;

public class Tank {

    private int angle = 0;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle (int angleNumber){
        angle+=angleNumber;
        if (angle > 80 || angle < -80){
            throw new IllegalArgumentException("The barrel can not turn more than 80 degrees in either way.");
        }
    }
}
