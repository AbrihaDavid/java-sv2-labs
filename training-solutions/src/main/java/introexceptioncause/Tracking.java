package introexceptioncause;

import java.io.IOException;

public class Tracking {

    public static void main(String[] args) {

        TrackPoints trackPoints = new TrackPoints();

        try {
            trackPoints.trackHeightInformation(trackPoints.readFile());
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }
}
