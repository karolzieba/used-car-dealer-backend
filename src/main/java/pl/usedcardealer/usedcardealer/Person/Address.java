package pl.usedcardealer.usedcardealer.Person;

import java.io.Serializable;

public class Address implements Serializable {
    private String postcode;
    private String city;
    private String street;
    private int propertyNumber;

    public Address(String postcode, String city, String street, int propertyNumber) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.propertyNumber = propertyNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(int propertyNumber) {
        this.propertyNumber = propertyNumber;
    }
}