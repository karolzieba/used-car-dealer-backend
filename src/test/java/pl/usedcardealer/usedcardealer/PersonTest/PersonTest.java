package pl.usedcardealer.usedcardealer.PersonTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.util.Date;

public class PersonTest {
    @Test
    public void TestAdress() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", 1234234455, new Date(), address);
        Assertions.assertEquals(person.getAdress().getPostcode(), "26-020");
        Assertions.assertEquals(person.getAdress().getTown(), "Chmielnik");
        Assertions.assertEquals(person.getAdress().getStreet(), "rynek");
        Assertions.assertEquals(person.getAdress().getPropertyNumber(), 10);
    }
    @Test
    public void TestPerson() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", 1234234455, new Date(), address);
        Assertions.assertEquals(person.getName(), "Jakub");
        Assertions.assertEquals(person.getLastName(), "Stawiarz");
        Assertions.assertEquals(person.getPesel(), 1234234455);
        Assertions.assertEquals(person.getDataOfBirth(), new Date());
    }
}
