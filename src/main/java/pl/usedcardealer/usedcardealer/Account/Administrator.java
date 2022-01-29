package pl.usedcardealer.usedcardealer.Account;

import pl.usedcardealer.usedcardealer.Person.Person;

public class Administrator {
    private Person person;
    private Account account;

    public Administrator(Person person, Account account) {
        this.person = person;
        this.account = account;
    }

    public Person getPerson() { return person; }

    public void setPerson(Person person) { this.person = person; }

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; }

    public void addEmployee() {

    }

    public void removeEmployee() {

    }

    public void addEBranch() {

    }

    public void removeEBranch() {

    }
}
