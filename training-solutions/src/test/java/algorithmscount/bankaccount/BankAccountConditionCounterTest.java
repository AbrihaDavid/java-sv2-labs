package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void countWithBalanceGreaterThanTest() {

        List<BankAccount> bankAccountList = Arrays.asList(new BankAccount(200),new BankAccount(100),new BankAccount(500));

        assertEquals(2,new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccountList,100));
    }
}