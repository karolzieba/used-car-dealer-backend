package pl.usedcardealer.usedcardealer.AccountTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Administrator.Administrator;
import pl.usedcardealer.usedcardealer.Account.Client.Client;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;
import pl.usedcardealer.usedcardealer.Branch.Branch;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;

public class AccountTest {
    @Test
    public void TestAccount() {
        Account account = new Account("login", "password", "email@gmail.com");

        Assertions.assertNotNull(account);

        Assertions.assertEquals(account.getLogin(), "login");
        Assertions.assertEquals(account.getPassword(), "password");
        Assertions.assertEquals(account.getEmailAddress(), "email@gmail.com");

        account.setLogin("login2");
        account.setPassword("password2");
        account.setEmailAddress("email2@o2.pl");
        Assertions.assertEquals(account.getLogin(), "login2");
        Assertions.assertEquals(account.getPassword(), "password2");
        Assertions.assertEquals(account.getEmailAddress(), "email2@o2.pl");
    }
    @Test
    public void TestClient() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", LocalDate.now(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Client client = new Client(1, person, account, "87101013970055002221000000");

        Assertions.assertNotNull(address);
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(account);
        Assertions.assertNotNull(client);

        Assertions.assertEquals(client.getPerson(), person);
        Assertions.assertEquals(client.getAccount(), account);
        Assertions.assertEquals(client.getNumberOfBankAccount(), "87101013970055002221000000");

        Address address2 = new Address("25-200", "Kielce", "Jasna", 17);
        Person person2 = new Person("Jan", "Kowalski", "99032346113", LocalDate.now(), address2);
        client.setPerson(person2);
        Account account2 = new Account("login", "password", "email@gmail.com");
        client.setAccount(account2);
        Assertions.assertEquals(client.getPerson(), person2);
        Assertions.assertEquals(client.getAccount(), account2);

        client.setNumberOfPurchases(123);
        Assertions.assertEquals(client.getNumberOfPurchases(), 123);

        client.setNumberOfSales(1);
        Assertions.assertEquals(client.getNumberOfSales(), 1);
        }
    @Test
    public void TestEmployee() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", LocalDate.now(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Address addressBranch = new Address("26-020", "Chmielnik", "Orkana", 4);
        Branch branch = new Branch(1, "Branch1", 1, addressBranch);
        Employee employee = new Employee(1, person, account,"kierownik", 4200);

        Assertions.assertNotNull(address);
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(account);
        Assertions.assertNotNull(addressBranch);
        Assertions.assertNotNull(branch);
        Assertions.assertNotNull(employee);

        Assertions.assertEquals(employee.getPerson(), person);
        Assertions.assertEquals(employee.getAccount(), account);
        Assertions.assertEquals(employee.getPosition(), "kierownik");
        Assertions.assertEquals(employee.getSalary(), 4200);

        employee.setPosition("kasjer");
        Assertions.assertEquals(employee.getPosition(), "kasjer");

        employee.setSalary(3200);
        Assertions.assertEquals(employee.getSalary(), 3200);
    }
    @Test
    public void TestAdministrator() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", LocalDate.now(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Administrator administrator = new Administrator(1, person, account);

        Assertions.assertNotNull(address);
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(account);
        Assertions.assertNotNull(administrator);

        Assertions.assertEquals(administrator.getPerson(), person);
        Assertions.assertEquals(administrator.getAccount(), account);

        Address address2 = new Address("25-200", "Kielce", "Jasna", 17);
        Person person2 = new Person("Jan", "Kowalski", "99032346113", LocalDate.now(), address2);
        administrator.setPerson(person2);
        Account account2 = new Account("login", "password", "email@gmail.com");
        administrator.setAccount(account2);
        Assertions.assertEquals(administrator.getPerson(), person2);
        Assertions.assertEquals(administrator.getAccount(), account2);
    }
    @Test
    public void TestValidationNumberOfBankAccount() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", LocalDate.now(), address);
        Account account = new Account("login", "password", "email@gmail.com");
        Client client = new Client(2, person, account, "PL 83 1010 1023 0000 2613 9510 0000");

        Assertions.assertNotNull(address);
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(account);
        Assertions.assertNotNull(client);

        Assertions.assertTrue(client.isValidIban(client.getNumberOfBankAccount()));

        client.setNumberOfBankAccount("PL 83 1010 1023 0000 2613 9510 0055");
        Assertions.assertFalse(client.isValidIban(client.getNumberOfBankAccount()));
    }
}
