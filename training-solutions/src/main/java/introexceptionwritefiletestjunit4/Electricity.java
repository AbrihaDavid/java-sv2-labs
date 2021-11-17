package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {

    public List<String> makeBlackoutList (){
        LocalDate date = LocalDate.now();
        return new ArrayList<>(Arrays.asList(date.toString(), "Kossuth utca", "Petőfi utca"));
    }

    public void writeStreets (Path path){

        try {
            Files.write(path,makeBlackoutList());
        }
        catch (IOException ioe){
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}
