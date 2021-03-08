package hu.eszterhazy;

import java.util.List;
import java.util.UUID;

public abstract class DigitalBank implements Bank{

    String name;
    String ownerName;
    String websiteURL;
    List<Account> accountList;
    UUID id;

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public UUID getId() {
        return id;
    }

    public DigitalBank(String name, String ownerName, String websiteURL, UUID id) {
        this.name = name;
        this.ownerName = ownerName;
        this.websiteURL = websiteURL;
        this.id = id;
    }

    @Override
    public Account queryUser(UUID userID) {
        return null;
    }

    @Override
    public Account queryUser(String name) {
        return null;
    }

    @Override
    public String getBankInformation() {
        return getName() + getWebsiteURL() + "Owner: "+ getOwnerName();
        //return this.toString()
    }

    @Override
    public String toString() {
        return "DigitalBank{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", websiteURL='" + websiteURL + '\'' +
                '}';
    }
}
