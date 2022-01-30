package pl.usedcardealer.usedcardealer.Document.Contract.SaleAndPurchaseContract;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Client;
import pl.usedcardealer.usedcardealer.Account.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;

@Configuration
public class SaleAndPurchaseContractConfig {

    @Bean
    CommandLineRunner clrsapc(SaleAndPurchaseContractRepository sapcr) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            Employee e1 = new Employee(2, new Person("Janusz", "Kowalski", "122222222", LocalDate.now(), new Address("00-000", "Gdańsk", "Tatrzańska", 30)),
                    new Account("login456", "haslo456", "test3@test3.pl"), "Kierownik", 5000);

            Client cl1 = new Client(2, new Person("Janusz", "Nowak", "133333333", LocalDate.now(), new Address("00-001", "Warszawa", "Nowy Świat", 40)),
                    new Account("login654", "haslo654", "test4@test4.pl"), "111111");

            SaleAndPurchaseContract sapc1 = new SaleAndPurchaseContract(2, e1, cl1, c1, 10000);

            sapcr.save(sapc1);
        };
    }
}
