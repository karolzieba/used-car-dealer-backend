package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

import pl.usedcardealer.usedcardealer.Account.Client.Client;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Contract.Contract;

import javax.persistence.*;
import java.util.Iterator;
import java.util.List;

@Entity
public class UsedCarDealerContract extends Contract {
    @ElementCollection
    @CollectionTable(name = "contractConditions", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "conditions")
    private List<String> conditions;

    public UsedCarDealerContract() { }

    public UsedCarDealerContract(int id, Employee employee, Client client, Car car, List<String> conditions) {
        super(id, employee, client, car);
        this.conditions = conditions;
    }

    @Override
    public void displayDocument() {
        Iterator<String> it = conditions.iterator();

        String tekst = "Umowa komisowa " + super.getId() + " o warunkach: \n";

        while(it.hasNext()) {
            tekst += ("- " + it.next() + "\n");
        }

        System.out.println(tekst);
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }
}
