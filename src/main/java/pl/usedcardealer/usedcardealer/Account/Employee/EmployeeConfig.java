package pl.usedcardealer.usedcardealer.Account.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Account.Administrator.Administrator;
import pl.usedcardealer.usedcardealer.Account.Administrator.AdministratorRepository;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner clremp(EmployeeRepository empr) {
        return args -> {
            Employee e1 = new Employee(1, new Person("Jan", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Kielce", "Klonowa", 10)),
                    new Account("login123", "haslo123", "test@test.pl"), "Sprzedawca", 5000);

            Employee e2 = new Employee(2, new Person("Dariusz", "Nowak", "123456789", LocalDate.now(), new Address("00-000", "Warszawa", "Klonowa", 20)),
                    new Account("login123", "haslo123", "test@test.pl"), "Sprzedawca", 10000);

            Employee e3 = new Employee(3, new Person("Marian", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Toruń", "Klonowa", 30)),
                    new Account("login123", "haslo123", "test@test.pl"), "Kierownik", 15000);

            empr.saveAll(
                    List.of(e1, e2, e3)
            );
        };
    }
}
