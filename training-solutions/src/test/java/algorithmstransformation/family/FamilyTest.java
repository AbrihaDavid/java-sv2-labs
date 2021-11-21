package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    @Test
    void getAgesOfFamilyMembersWithNameGiven() {

        Family family = new Family(new ArrayList<>(Arrays.asList(
                new FamilyMember("John Doe",20),
                new FamilyMember("Jack Doe",24),
                new FamilyMember("Bob John Doe",56),
                new FamilyMember("Sarah Doe",55)
        )));

        assertEquals(2,family.getAgesOfFamilyMembersWithNameGiven("John").size());
        assertEquals(56,family.getAgesOfFamilyMembersWithNameGiven("John").get(1));
    }
}