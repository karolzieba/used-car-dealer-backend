package pl.usedcardealer.usedcardealer.Branch;

import pl.usedcardealer.usedcardealer.Account.Employee.Employee;
import pl.usedcardealer.usedcardealer.Person.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Branch {
    @Id
    @SequenceGenerator(
            name = "branch_sequence",
            sequenceName = "branch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "branch_sequence"
    )
    private int id;
    private String name;
    private int numberOfBranch;
    @Embedded
    private Address adress;
    @ElementCollection
    @CollectionTable(name = "branchEmployees", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "listOfEmployees")
    private List<Employee> listOfEmployees;

    public Branch() { }

    public Branch(int id, String name, int numberOfBranch, Address adress) {
        this.id = id;
        this.name = name;
        this.numberOfBranch = numberOfBranch;
        this.adress = adress;
        this.listOfEmployees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        if(!Objects.isNull(employee)) {
            listOfEmployees.add(employee);
        }
    }

    public void deleteEmployee(Employee employee) {
        if(!Objects.isNull(employee)) {
            listOfEmployees.remove(employee);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
}
