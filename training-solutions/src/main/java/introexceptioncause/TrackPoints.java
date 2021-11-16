package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {

    public List<String> readFile() throws IOException{
        return Files.readAllLines(Paths.get("tracking.csv"));
    }

    public void trackHeightInformation(List<String> heights){
        for (int i = 0; i<heights.size()-1; i++){
            System.out.println(Integer.parseInt(heights.get(i+1).substring(heights.get(i).lastIndexOf(";")+1)) - Integer.parseInt(heights.get(i).substring(heights.get(i).lastIndexOf(";")+1)));
        }
    }
}
