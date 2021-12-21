package pl.usedcardealer.usedcardealer.Branch;

import pl.usedcardealer.usedcardealer.Person.Address;

public class Branch {
    private String name;
    private int numberOfBranch;
    private Address adress;

    public Branch(String name, int numberOfBranch, Address adress) {
        this.name = name;
        this.numberOfBranch = numberOfBranch;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBranch() {
        return numberOfBranch;
    }

    public void setNumberOfBranch(int numberOfBranch) {
        this.numberOfBranch = numberOfBranch;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
