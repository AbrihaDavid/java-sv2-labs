package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    NameServer nameServer = new NameServer();

    @BeforeEach
    void init(){
        nameServer.addEntry("unideb.hu","11.22.33.44");
        nameServer.addEntry("google.hu","22.33.44.55");
    }

    @Test
    void testAddEntry() {
        assertEquals(2,nameServer.getDnsEntries().size());
    }

    @Test
    void testAddEntryWithNameAlreadyExists(){
        assertThrows(IllegalArgumentException.class, ()-> nameServer.addEntry("unideb.hu","11.22.33.55"));
    }

    @Test
    void testRemoveEntryByName() {
        nameServer.removeEntryByName("unideb.hu");
        assertEquals(1,nameServer.getDnsEntries().size());
    }

    @Test
    void testRemoveEntryByIp() {
        nameServer.removeEntryByIp("22.33.44.55");
        assertEquals(1,nameServer.getDnsEntries().size());
    }

    @Test
    void testGetIpByName() {
        assertEquals("22.33.44.55",nameServer.getIpByName("google.hu"));
    }

    @Test
    void testGetNameByIp() {
        assertEquals("unideb.hu",nameServer.getNameByIp("11.22.33.44"));
    }
}