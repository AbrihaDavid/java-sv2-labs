package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String getFirstWordWithA(Path path) {
        List<String> words = readFile(path);
        for (String s : words) {
            if (s.startsWith("A")) {
                return s;
            }
        }
        return "A";
    }
}
