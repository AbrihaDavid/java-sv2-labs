package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException{
        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule (List<String> file) throws IOException{
        LocalDate localDate = LocalDate.now();
        List<String> beginsWithTwo = new ArrayList<>();
        for (String s: this.readFile()){
            if (s.startsWith("2")){
                beginsWithTwo.add(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(localDate.toString().concat(", "));
        for (String s: beginsWithTwo){
            sb.append(s.concat(" "));
        }
        return sb.toString();
    }
}
