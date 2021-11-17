package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {


    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void writeBooks() throws IOException {

        Path path = temporaryFolder.newFile("formattedbooks.txt").toPath();

        new Books().writeBooks(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals("Molnár Ferenc: Pál utcai fiúk",lines.get(1));
    }
}