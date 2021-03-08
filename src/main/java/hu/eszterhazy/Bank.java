package hu.eszterhazy;

import java.util.UUID;

public interface Bank {


    public String getBankInformation();

    public Account queryUser(UUID userID);

    public Account queryUser(String name);

    public float withrawFromAccount(Account account, float amount);

    public float depositToAccount(Account account, float amount);

}
