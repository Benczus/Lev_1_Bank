import hu.eszterhazy.Account;
import hu.eszterhazy.Bank;
import hu.eszterhazy.PublicDigitalBank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class BankTest {
    Bank bank;
    Account account;
    @BeforeEach
    public void setBank(){
        bank= new PublicDigitalBank("Dagobert", "Dagobert INC", "www.duckburg.com", UUID.randomUUID());
        account = new BasicAccount("Kis Jóska", UUID.randomUUID(), 200);
        bank.addNewAccount(account);
    }


    @Test
    public void testWithdrawFromAccount(){
        Assertions.assertEquals(bank.withrawFromAccount(account,50), 150);
    }

}
