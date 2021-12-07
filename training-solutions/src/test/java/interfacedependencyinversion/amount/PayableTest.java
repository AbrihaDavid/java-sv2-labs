package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount(){
        assertEquals(1000,new Amount().getPayableAmount(1000));
    }

    @Test
    void testCash(){
        assertEquals(1005,new Cash().getPayableAmount(1003));
    }

    @Test
    void testBankAtm(){
        assertEquals(2000, new BankAtm().getPayableAmount(1001));
    }

}