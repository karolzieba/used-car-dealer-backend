package pl.usedcardealer.usedcardealer.Account.Administrator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AdministratorConfig {
    @Bean
    CommandLineRunner clradm(AdministratorRepository admr) {
        return args -> {
            Administrator a1 = new Administrator(1, new Person("Jan", "Kowalski", "123456789", LocalDate.now(), new Address("00-000", "Kielce", "Klonowa", 10)),
                    new Account("login123", "haslo123", "test@test.pl"));

            Administrator a2 = new Administrator(2, new Person("Dariusz", "Kowalski", "125556789", LocalDate.now(), new Address("00-000", "Warszawa", "Lipowa", 20)),
                    new Account("login123", "haslo123", "test@test.pl"));

            Administrator a3 = new Administrator(3, new Person("Wiesław", "Nowak", "1233356789", LocalDate.now(), new Address("00-000", "Poznań", "Bukowa", 30)),
                    new Account("login123", "haslo123", "test@test.pl"));

            admr.saveAll(
                    List.of(a1, a2, a3)
            );
        };
    }
}
