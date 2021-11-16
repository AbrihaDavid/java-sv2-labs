package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("palutcaifiuk.txt"));
    }

    public void printNames(List<String> names){
        for (String s: names){
            if (s.equals("Nemecsek Ernő")){
                System.out.println(s.toLowerCase());
            } else{
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        try {
            paulStreetBoys.printNames(paulStreetBoys.readFile());
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }
}
