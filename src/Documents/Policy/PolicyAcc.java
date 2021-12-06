package Documents.Policy;

import Car.Vehicle;

import java.util.Date;

public class PolicyAcc extends Policy {
    private double kwotaAcc;

    public PolicyAcc(Date data, Vehicle pojazd, Date dataRozpoczecia, Date dataZakonczenia, double kwotaAcc) {
        super(data, pojazd, dataRozpoczecia, dataZakonczenia);
        this.kwotaAcc = kwotaAcc;
    }

    public double getKwotaAcc() {
        return kwotaAcc;
    }

    public void setKwotaAcc(double kwotaAcc) {
        this.kwotaAcc = kwotaAcc;
    }
}