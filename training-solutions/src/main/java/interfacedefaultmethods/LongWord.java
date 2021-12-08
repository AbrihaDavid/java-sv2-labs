package interfacedefaultmethods;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LongWord implements FileOperations{


    @Override
    public String getLongWord() {
        List<String> words = readFromFile(Paths.get("training-solutions/src/test/resources/longword.txt"));

        StringBuilder sb = new StringBuilder();
        sb.append(words.get(0)).append(words.get(words.size()-1));
        return sb.toString();
    }
}
