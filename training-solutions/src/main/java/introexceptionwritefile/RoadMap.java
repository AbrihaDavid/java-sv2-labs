package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {

        List<String> listOfSettlements = Arrays.asList("Tenk","Dormánd","Poroszló","Tiszafüred","Hortobágy","Debrecen");

        try {
            Files.write(Paths.get("roadmap.txt"),listOfSettlements);
        }
        catch (IOException ioe){
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}
