package introexceptionwritefiletestjunit5;

import introexceptionwritefiletestjunit4.Books;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempDir;

    @Test
    void writeBooks() throws IOException {

        Path path = tempDir.toPath().resolve("booktest.txt");

        new Books().writeBooks(path);
        List<String> lines = Files.readAllLines(path);
        assertEquals("Molnár Ferenc: Pál utcai fiúk",lines.get(1));
    }
}