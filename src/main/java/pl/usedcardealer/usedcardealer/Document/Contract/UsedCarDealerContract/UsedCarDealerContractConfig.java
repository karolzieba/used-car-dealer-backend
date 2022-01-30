package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

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
import java.util.ArrayList;
import java.util.List;

@Configuration
public class UsedCarDealerContractConfig {

    @Bean
    CommandLineRunner clrucdc(UsedCarDealerContractRepository ucdcr) {
        return args -> {
            Car c1 = new Car(1, "1234", 2011, "Volkswagen", "Polo");
            Car c2 = new Car(2, "2345", 2018, "Toyota", "Yaris");
            Car c3 = new Car(3, "3456", 2014, "Fiat", "Panda");

            Employee e1 = new Employee(3, new Person("Marian", "Kowalski", "122222222", LocalDate.now(), new Address("00-000", "Poznań", "Marszałkowska", 50)),
                    new Account("login789", "haslo789", "test5@test5.pl"), "Kierownik", 5000);

            Client cl1 = new Client(3, new Person("Marian", "Nowak", "133333333", LocalDate.now(), new Address("00-001", "Kraków", "Wawel", 60)),
                    new Account("login987", "haslo987", "test6@test6.pl"), "111111");

            List<String> con = new ArrayList<>();
            con.add("Warunek 1");
            con.add("Warunek 2");

            UsedCarDealerContract ucdc1 = new UsedCarDealerContract(3, e1, cl1, c2, con);

            ucdcr.save(ucdc1);
        };
    }
}
