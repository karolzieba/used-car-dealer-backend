package pl.usedcardealer.usedcardealer.Person;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private int pesel;
    private Date dataOfBirth;
    private Address adress;

    public Person(String name, String lastName, int pesel, Date dataOfBirth, Address adress) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dataOfBirth = dataOfBirth;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
