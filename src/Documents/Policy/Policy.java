package Documents.Policy;

import Car.Vehicle;
import Documents.Documents;

import java.util.Date;

public class Policy extends Documents {
    private Date dataRozpoczecia;
    private Date DataZakonczenia;

    public Policy(Date data, Vehicle pojazd, Date dataRozpoczecia, Date dataZakonczenia) {
        super(data, pojazd);
        this.dataRozpoczecia = dataRozpoczecia;
        DataZakonczenia = dataZakonczenia;
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return DataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        DataZakonczenia = dataZakonczenia;
    }
}