package pl.usedcardealer.usedcardealer.Document.Contract.UsedCarDealerContract;

import pl.usedcardealer.usedcardealer.Account.Client;
import pl.usedcardealer.usedcardealer.Account.Employee;
import pl.usedcardealer.usedcardealer.Car.Car;
import pl.usedcardealer.usedcardealer.Document.Contract.Contract;

import java.util.Iterator;
import java.util.List;

public class UsedCarDealerContract extends Contract {
    private List<String> conditions;

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

    public void addCondition(String condition) {
        if(correctCondition(condition)) {
            conditions.add(condition);
        }
    }

    private boolean correctCondition(String condition) {
        if(condition.equals("Warunek 1") || condition.equals("Warunek 2") || condition.equals("Warunek 3")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteCondition(String condition) {
        if(correctCondition(condition)) {
            conditions.add(condition);
        }
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }
}
