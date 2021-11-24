package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    RegisterDate dateOfBirthOfMan = new RegisterDate("születési ideje", LocalDate.of(1980,1,20));
    RegisterDate dateOfBirthOfWoman = new RegisterDate("születési ideje", LocalDate.of(1982,5,9));

    Woman woman = new Woman("Jane Carpenter");
    Man man = new Man("Jack Doe");

    Marriage marriage = new Marriage();

    @BeforeEach
    void init(){
        woman.addRegisterInfo(dateOfBirthOfWoman);
        man.addRegisterInfo(dateOfBirthOfMan);
        marriage.getMarried(woman,man);
    }

    @Test
    void getMarriedTest() {
        assertEquals("Jane Doe",woman.getName());
    }

    @Test
    void updatedRegisterInfoTest(){
        assertEquals(LocalDate.now(),man.getRegisterDates().get(1).getDate());
    }
}