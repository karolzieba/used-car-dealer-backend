package pl.usedcardealer.usedcardealer.Account;

import pl.usedcardealer.usedcardealer.Person.Person;

import java.io.Serializable;

public class Client implements Serializable {
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

    public boolean isValidIban(String iban) {
        iban = iban.toUpperCase().replaceAll("[\\p{Punct}\\p{Space}]*","");
        if (!iban.matches("^[A-Z]{2}[0-9]{12,}"))
            return false;
        iban = iban.substring(4, iban.length()) + iban.substring(0 ,4);
        for (int i = 0; i < iban.length(); i++) {
            char c = iban.charAt(i);
            if (Character.isUpperCase(c)) {
                int code = Character.getNumericValue(c);
                iban = iban.substring(0, i) + code
                        + iban.substring(i + 1, iban.length());
            }
        }
        int mod = 0;
        int isize = iban.length();
        for (int i = 0; i < isize; i = i + 6) {
            try {
                mod = Integer.parseInt("" + mod + iban.substring(i, i + 6), 10) % 97;
            } catch (StringIndexOutOfBoundsException e) {
                return false;
            }
        }
        return (mod == 1);
    }
}
