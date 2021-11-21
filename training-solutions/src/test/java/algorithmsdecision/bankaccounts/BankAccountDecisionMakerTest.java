package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void containsBalanceGreaterThan() {

        List<BankAccount> accounts = Arrays.asList(
                new BankAccount(1000),
                new BankAccount(5000),
                new BankAccount(200)
        );

        assertTrue(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,4999));
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,5000));
    }
}