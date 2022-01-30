package pl.usedcardealer.usedcardealer.Account.Administrator;

import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Person.Person;

import javax.persistence.*;

@Entity
@Table
public class Administrator {
    @Id
    @SequenceGenerator(
            name = "admin_sequence",
            sequenceName = "admin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "admin_sequence"
    )
    private int id;
    @Embedded
    private Person person;
    @Embedded
    private Account account;

    public Administrator() { }

    public Administrator(int id, Person person, Account account) {
        this.id = id;
        this.person = person;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() { return person; }

    public void setPerson(Person person) { this.person = person; }

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; }
}
