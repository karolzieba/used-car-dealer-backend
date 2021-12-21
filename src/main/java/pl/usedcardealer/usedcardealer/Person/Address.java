package pl.usedcardealer.usedcardealer.Person;

public class Address {
    private String postcode;
    private String town;
    private String street;
    private int propertyNumber;

    public Address(String postcode, String town, String street, int propertyNumber) {
        this.postcode = postcode;
        this.town = town;
        this.street = street;
        this.propertyNumber = propertyNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
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