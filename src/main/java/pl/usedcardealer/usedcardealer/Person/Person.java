package pl.usedcardealer.usedcardealer.Person;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private String pesel;
    private Date dataOfBirth;
    private Address adress;

    public Person(String name, String lastName, String pesel, Date dataOfBirth, Address adress) {
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
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

    public boolean isValidPesel(String pesel) {
        int psize = pesel.length();
        if (psize != 11) {
            return false;
        }
        int[] weights = {1,3,7,9,1,3,7,9,1,3};
        int sum = 0, j;
        int csum = Integer.parseInt(pesel.substring(psize - 1));
        for (int i = 0; i < psize - 1; i++) {
            char c = pesel.charAt(i);
            j = Integer.parseInt(String.valueOf(c));
            sum += j * weights[i];
        }
        int control = 10 - (sum % 10);
        if (control == 10) {
            control = 0;
        }
        return (control == csum);
    }
}
