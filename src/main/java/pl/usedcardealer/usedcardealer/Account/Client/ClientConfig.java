package pl.usedcardealer.usedcardealer.Account.Client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.usedcardealer.usedcardealer.Account.Account;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner clrclient(ClientRepository clientr) {
        return args -> {
            Client cl1 = new Client(1, new Person("Jan", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Warszawa", "Lipowa", 20)),
                    new Account("login321", "haslo321", "test2@test2.pl"), "543210");

            Client cl2 = new Client(2, new Person("Dariusz", "Kowalski", "987654321", LocalDate.now(), new Address("00-001", "Kraków", "Lipowa", 30)),
                    new Account("login321", "haslo321", "test2@test2.pl"), "543210");

            Client cl3 = new Client(3, new Person("Marian", "Nowak", "987654321", LocalDate.now(), new Address("00-001", "Lublin", "Lipowa", 40)),
                    new Account("login321", "haslo321", "test2@test2.pl"), "543210");

            clientr.saveAll(
                    List.of(cl1, cl2, cl3)
            );
        };
    }
}
