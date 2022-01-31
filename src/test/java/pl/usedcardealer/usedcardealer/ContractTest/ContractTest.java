package pl.usedcardealer.usedcardealer.ContractTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Client.Client;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Contract.Invoice.Invoice;
import pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract.SaleAndPurchaseContract;
import pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract.UsedCarDealerContract;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractTest {
    @Test
    public void TestInvoice() {
        Employee e1 = new Employee(1, new Person("Jan", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Kielce", "Klonowa", 10)),
                new Account("login123", "haslo123", "test@test.pl"), "Kierownik", 5000);
        Client cl1 = new Client(1, new Person("Jan", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Warszawa", "Lipowa", 20)),
                new Account("login321", "haslo321", "test2@test2.pl"), "543210");
        Car car = new Car(1, "222222", 2012, "Kia", "Stinger");

        Invoice i = new Invoice(1, e1, cl1, car, 10000);

        Assertions.assertEquals(i.getId(), 1);
        Assertions.assertEquals(i.getIdCar(), 1);
        Assertions.assertEquals(i.getAmount(), 10000);

        i.setAmount(20000);

        Assertions.assertEquals(i.getAmount(), 20000);
    }

    @Test
    public void TestSaleAndPurchaseContract() {
        Employee e1 = new Employee(2, new Person("Marian", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Gdańsk", "Klonowa", 15)),
                new Account("login123", "haslo123", "test@test.pl"), "Kierownik", 5000);
        Client cl1 = new Client(2, new Person("Dariusz", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Zakopane", "Tatrzańska", 25)),
                new Account("login321", "haslo321", "test2@test2.pl"), "543210");
        Car car = new Car(2, "111111", 2011, "Hyundai", "Tucson");

        SaleAndPurchaseContract sapc = new SaleAndPurchaseContract(3, e1, cl1, car, 50000);

        Assertions.assertEquals(sapc.getId(), 3);
        Assertions.assertEquals(sapc.getIdCar(), 2);
        Assertions.assertEquals(sapc.getAmount(), 50000);

        sapc.setAmount(30000);

        Assertions.assertEquals(sapc.getAmount(), 30000);
    }

    @Test
    public void TestUsedCarDealerContract() {
        Employee e1 = new Employee(3, new Person("Wiktor", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Szczecin", "Klonowa", 31)),
                new Account("login123", "haslo123", "test@test.pl"), "Kierownik", 5000);
        Client cl1 = new Client(3, new Person("Marcin", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Wrocław", "Tatrzańska", 42)),
                new Account("login321", "haslo321", "test2@test2.pl"), "543210");
        Car car = new Car(3, "111111", 2005, "Opel", "Astra");

        List<String> conditions = new ArrayList<>();
        conditions.add("Condition 1");
        conditions.add("Condition 2");
        conditions.add("Condition 3");

        UsedCarDealerContract ucdc = new UsedCarDealerContract(4, e1, cl1, car, conditions);

        Assertions.assertEquals(ucdc.getId(), 4);
        Assertions.assertEquals(ucdc.getIdCar(), 3);
        Assertions.assertEquals(ucdc.getClient(), cl1);

        Car car2 = new Car(2, "111111", 2011, "Hyundai", "Tucson");

        ucdc.setCar(car2);

        Assertions.assertEquals(ucdc.getCar(), car2);
    }
}
