package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public void readFile() throws IOException {
        List<String> fileContent = Files.readAllLines(Paths.get("poem.txt"));
        for (String s: fileContent){
            System.out.print(s.charAt(0));
        }
    }

    public static void main(String[] args) {

        try {
            new Poem().readFile();
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }

}
