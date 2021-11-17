package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public List<String> readFile (){

        try {
            return Files.readAllLines(Paths.get("training-solutions/src/test/resources/books.txt"));
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public List<String> makeBookListMoreReadable(){
        List<String> books = readFile();
        List<String> booksFormatted = new ArrayList<>();
        for (String s: books){
            String[] array = s.split(";");
            StringBuilder sb = new StringBuilder(array[2]).append(": ").append(array[1]);
            booksFormatted.add(sb.toString());
        }
        return booksFormatted;
    }

    public void writeBooks (Path path){

        try {
            Files.write(path,makeBookListMoreReadable());
        }
        catch (IOException ioe){
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}