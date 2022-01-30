package pl.usedcardealer.usedcardealer.Account.Employee;

import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Person.Person;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private int id;
    @Embedded
    private Person person;
    @Embedded
    private Account account;
    private String position;
    private int salary;

    public Employee() { }

    public Employee(int id, Person person, Account account, String position, int salary) {
        this.id = id;
        this.person = person;
        this.account = account;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
