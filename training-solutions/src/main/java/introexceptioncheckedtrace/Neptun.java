package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Neptun {

    public List<String> readFile() throws IOException{
        return Files.readAllLines(Paths.get("neptun.csv"));
    }

    public static void main(String[] args) {

        List<String> file = new ArrayList<>();
        try {
            file = new Neptun().readFile();
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }

        List<String> onlyNeptun = new ArrayList<>();
        for (String s: file){
            String neptun = s.substring(s.indexOf(",")+1);
            onlyNeptun.add(neptun);
        }
        System.out.println(onlyNeptun);
    }
}
