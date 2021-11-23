package Dokumenty.Umowy;

import Auto.Pojazd;
import Dokumenty.Dokumenty;
import Konto.Klient;
import Konto.Pracownik;

import java.util.Date;

public class Umowa extends Dokumenty {
    private Pracownik sprzedawca;
    private Klient klient;

    public Umowa(Date data, Pojazd pojazd, Pracownik sprzedawca, Klient klient) {
        super(data, pojazd);
        this.sprzedawca = sprzedawca;
        this.klient = klient;
    }

    public Pracownik getSprzedawca() {
        return sprzedawca;
    }

    public void setSprzedawca(Pracownik sprzedawca) {
        this.sprzedawca = sprzedawca;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}