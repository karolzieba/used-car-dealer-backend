package pl.usedcardealer.usedcardealer.Account;

import pl.usedcardealer.usedcardealer.Person.Person;
import pl.usedcardealer.usedcardealer.Branch.Branch;

public class Employee {
    private Person person;
    private Account account;
    private Branch branch;
    private String position;
    private int salary;

    public Employee(Person person, Account account, Branch branch, String position, int salary) {
        this.person = person;
        this.account = account;
        this.branch = branch;
        this.position = position;
        this.salary = salary;
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

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
