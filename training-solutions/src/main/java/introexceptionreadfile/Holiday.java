package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {

        try {
            List<String> fileContent = Files.readAllLines(Paths.get("holiday.txt"));
            System.out.println(fileContent);
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }
}
