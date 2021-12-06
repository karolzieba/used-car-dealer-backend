package Documents.Contracts;

import Car.Vehicle;
import Documents.Documents;
import Account.Client;
import Account.Worker;

import java.util.Date;

public class Contract extends Documents {
    private Worker sprzedawca;
    private Client klient;

    public Contract(Date data, Vehicle pojazd, Worker sprzedawca, Client klient) {
        super(data, pojazd);
        this.sprzedawca = sprzedawca;
        this.klient = klient;
    }

    public Worker getSprzedawca() {
        return sprzedawca;
    }

    public void setSprzedawca(Worker sprzedawca) {
        this.sprzedawca = sprzedawca;
    }

    public Client getKlient() {
        return klient;
    }

    public void setKlient(Client klient) {
        this.klient = klient;
    }
}