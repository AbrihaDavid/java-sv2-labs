package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public List<String> readFile(String fileName){

        try {
            return Files.readAllLines(Paths.get(fileName));
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
        finally {
            System.out.println("End of read");
        }
    }

    public void getFirstNameWithDr(String fileName){
        for (String s: readFile(fileName)){
            if (s.startsWith("dr")){
                System.out.println(s);
                break;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        new Names().getFirstNameWithDr("names_one.txt");
        new Names().getFirstNameWithDr("names_two.txt");
    }
}
