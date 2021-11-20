package Dokumenty.Polisy;

import Auto.Pojazd;
import Dokumenty.Dokumenty;

import java.util.Date;

public class Polisa extends Dokumenty {
    private Date dataRozpoczecia;
    private Date DataZakonczenia;

    public Polisa(Date data, Pojazd pojazd, Date dataRozpoczecia, Date dataZakonczenia) {
        super(data, pojazd);
        this.dataRozpoczecia = dataRozpoczecia;
        DataZakonczenia = dataZakonczenia;
    }

}