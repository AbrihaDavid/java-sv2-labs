package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    @Test
    void formatDateStringByCountryCodeHU() {

        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(1999,5,2);

        SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();

        assertEquals("1999-5-2",simpleDateFormatter.formatDateString(simpleDate));
    }

    @Test
    void formatDateStringByCountryCodeEN() {

        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(1999,5,2);
        SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();
        assertEquals("2-5-1999",simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN,simpleDate));
    }

    @Test
    void testWrongDate(){
        SimpleDate simpleDate = new SimpleDate();
        assertThrows(IllegalArgumentException.class, ()-> simpleDate.setDate(1900,2,29));
    }
}