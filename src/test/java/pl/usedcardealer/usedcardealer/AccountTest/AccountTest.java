package pl.usedcardealer.usedcardealer.AccountTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Client;
import pl.usedcardealer.usedcardealer.Account.Employee;
import pl.usedcardealer.usedcardealer.Branch.Branch;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.util.Date;

public class AccountTest {
    @Test
    public void TestAccount() {
        Account account = new Account("login", "password", "email@gmail.com");
        Assertions.assertEquals(account.getLogin(), "login");
        Assertions.assertEquals(account.getPassword(), "password");
        Assertions.assertEquals(account.getEmailAddress(), "email@gmail.com");
    }
    @Test
    public void TestClient() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", 1234234455, new Date(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Client client = new Client(person, account, "87101013970055002221000000");
        Assertions.assertEquals(client.getNumberOfBankAccount(), "87101013970055002221000000");
    }
    @Test
    public void TestEmployee() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", 1234234455, new Date(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Address addressBranch = new Address("26-020", "Chmielnik", "Orkana", 4);
        Branch branch = new Branch("Branch1", 1, addressBranch);
        Employee employee = new Employee(person, account, branch,"kierownik", 4200);
        Assertions.assertEquals(employee.getPosition(), "kierownik");
        Assertions.assertEquals(employee.getSalary(), 4200);
    }
}
