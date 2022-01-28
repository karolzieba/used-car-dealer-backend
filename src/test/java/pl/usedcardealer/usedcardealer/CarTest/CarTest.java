package pl.usedcardealer.usedcardealer.CarTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Person.Address;
import pl.usedcardealer.usedcardealer.Person.Person;

import java.util.Date;

public class CarTest {
    @Test
    public void Test1(){
        Address address = new Address("26-020","Chmielnik","rynek",10);
        Person person = new Person("Jakub","Stawiarz",1234234455,new Date(),address);
        Assertions.assertEquals(person.getAdress().getPostcode(),"26-020");
        Assertions.assertNotEquals(person.getAdress().getPostcode(),"26-00");
        System.out.println(person.getAdress().getPostcode());
    }
}
