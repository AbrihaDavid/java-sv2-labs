package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempFolder;

    @Test
    void writeStreets() throws IOException {

        Path path = tempFolder.toPath().resolve("blackout.txt");

        new Electricity().writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("2021-11-17", "Kossuth utca", "Petőfi utca"),lines);

    }
}