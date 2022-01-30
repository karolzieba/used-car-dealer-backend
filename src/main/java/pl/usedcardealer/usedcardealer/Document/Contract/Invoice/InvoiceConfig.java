package pl.usedcardealer.usedcardealer.Document.Contract.Invoice;

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
public class InvoiceConfig {

    @Bean
    CommandLineRunner clri(InvoiceRepository ir) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            Employee e1 = new Employee(new Person("Jan", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Kielce", "Klonowa", 10)),
                    new Account("login123", "haslo123", "test@test.pl"), "Kierownik", 5000);

            Client cl1 = new Client(new Person("Jan", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Warszawa", "Lipowa", 20)),
                    new Account("login321", "haslo321", "test2@test2.pl"), "543210");

            Invoice i1 = new Invoice(1, e1, cl1, c3, 5000);

            ir.save(i1);
        };
    }
}
