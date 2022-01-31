package pl.usedcardealer.usedcardealer.PersonTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.time.LocalDate;
import java.util.Date;

public class PersonTest {
    @Test
    public void TestAdress() {
        LocalDate date = LocalDate.now();
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", date, address);
        Assertions.assertEquals(person.getAdress().getPostcode(), "26-020");
        Assertions.assertEquals(person.getAdress().getCity(), "Chmielnik");
        Assertions.assertEquals(person.getAdress().getStreet(), "rynek");
        Assertions.assertEquals(person.getAdress().getPropertyNumber(), 10);

        address.setPostcode("22-321");
        Assertions.assertEquals(person.getAdress().getPostcode(), "22-321");

        address.setCity("Warszawa");
        Assertions.assertEquals(person.getAdress().getCity(), "Warszawa");

        address.setStreet("Testowa");
        Assertions.assertEquals(person.getAdress().getStreet(), "Testowa");

        address.setPropertyNumber(94);
        Assertions.assertEquals(person.getAdress().getPropertyNumber(), 94);

    }
    @Test
    public void TestPerson() {
        LocalDate date = LocalDate.now();
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", date, address);
        Assertions.assertEquals(person.getName(), "Jakub");
        Assertions.assertEquals(person.getLastName(), "Stawiarz");
        Assertions.assertEquals(person.getPesel(), "80032346118");
        Assertions.assertEquals(person.getDateOfBirth(), date);
        Assertions.assertEquals(person.getAdress(), address);

        person.setName("Jan");
        Assertions.assertEquals(person.getName(), "Jan");

        person.setLastName("Nowak");
        Assertions.assertEquals(person.getLastName(), "Nowak");

        person.setPesel("83332346118");
        Assertions.assertEquals(person.getPesel(), "83332346118");

        LocalDate date2 = LocalDate.now();
        person.setDateOfBirth(date2);
        Assertions.assertEquals(person.getDateOfBirth(), date2);

        Address address2 = new Address("55-120", "Krakow", "Cieman", 32);
        person.setAdress(address2);
        Assertions.assertEquals(person.getAdress(), address2);

    }
    @Test
    public void TestValidationPesel() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Person person = new Person("Jakub", "Stawiarz", "80032346118", LocalDate.now(), address);
        Assertions.assertTrue(person.isValidPesel(person.getPesel()));
        person.setPesel("80032346119");
        Assertions.assertFalse(person.isValidPesel(person.getPesel()));
        person.setPesel("800323461197");
        Assertions.assertFalse(person.isValidPesel(person.getPesel()));
        person.setPesel("8003234611");
        Assertions.assertFalse(person.isValidPesel(person.getPesel()));
        person.setPesel("81132346119");
        Assertions.assertFalse(person.isValidPesel(person.getPesel()));
    }
}
