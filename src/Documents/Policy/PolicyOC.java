package Documents.Policy;

import Car.Vehicle;

import java.util.Date;

public class PolicyOC extends Policy {
    public PolicyOC(Date data, Vehicle pojazd, Date dataRozpoczecia, Date dataZakonczenia) {
        super(data, pojazd, dataRozpoczecia, dataZakonczenia);
    }
}