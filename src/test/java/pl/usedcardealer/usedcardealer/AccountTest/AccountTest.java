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
        Person person = new Person("Jakub", "Stawiarz", "80032346118", new Date(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Client client = new Client(person, account, "87101013970055002221000000");
        Assertions.assertEquals(client.getPerson(), person);
        Assertions.assertEquals(client.getAccount(), account);
        Assertions.assertEquals(client.getNumberOfBankAccount(), "87101013970055002221000000");
    }
    @Test
    public void TestEmployee() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", new Date(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Address addressBranch = new Address("26-020", "Chmielnik", "Orkana", 4);
        Branch branch = new Branch("Branch1", 1, addressBranch);
        Employee employee = new Employee(person, account, branch,"kierownik", 4200);
        Assertions.assertEquals(employee.getPerson(), person);
        Assertions.assertEquals(employee.getAccount(), account);
        Assertions.assertEquals(employee.getBranch(), branch);
        Assertions.assertEquals(employee.getPosition(), "kierownik");
        Assertions.assertEquals(employee.getSalary(), 4200);
    }
    @Test
    public void TestValidationNumberOfBankAccount() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", new Date(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Client client = new Client(person, account, "82 1020 5226 0000 6102 0417 7895");
        //Assertions.assertTrue(client.isValidIban(client.getNumberOfBankAccount()));
        //person.setPesel("72 1090 2183 0000 0005 6605 6475");
        Assertions.assertFalse(client.isValidIban(client.getNumberOfBankAccount()));
    }


}
