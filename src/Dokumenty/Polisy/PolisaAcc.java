package Dokumenty.Polisy;

import Auto.Pojazd;

import java.util.Date;

public class PolisaAcc extends Polisa {
    private double kwotaAcc;
    public PolisaAcc(Date data, Pojazd pojazd, Date dataRozpoczecia, Date dataZakonczenia, double kwotaAcc) {
        super(data, pojazd, dataRozpoczecia, dataZakonczenia);
        this.kwotaAcc = kwotaAcc;
    }
}