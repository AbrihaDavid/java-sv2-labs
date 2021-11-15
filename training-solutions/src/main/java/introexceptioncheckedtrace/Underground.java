package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {

    public static void main(String[] args) {

        Operations operations = new Operations();
        List<String> file = new ArrayList<>();
        try {
            file = operations.readFile();
            System.out.println(operations.getDailySchedule(file));
        }
        catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }
}
