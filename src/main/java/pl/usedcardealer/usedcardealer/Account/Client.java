package pl.usedcardealer.usedcardealer.Account;

import pl.usedcardealer.usedcardealer.Person.Person;

public class Client {
    private Person person;
    private Account account;
    private String numberOfBankAccount;
    private int numberOfPurchases = 0;
    private int numberOfSales = 0;

    public Client(Person person, Account account, String numberOfBankAccount) {
        this.person = person;
        this.account = account;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setNumberOfBankAccount(String numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    public void setNumberOfPurchases(int numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
}
