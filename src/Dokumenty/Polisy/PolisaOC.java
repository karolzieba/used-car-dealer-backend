package Dokumenty.Polisy;

import Auto.Pojazd;

import java.util.Date;

public class PolisaOC extends Polisa{
    public PolisaOC(Date data, Pojazd pojazd, Date dataRozpoczecia, Date dataZakonczenia) {
        super(data, pojazd, dataRozpoczecia, dataZakonczenia);
    }
}