package Dokumenty.Umowy;

import Auto.Pojazd;
import Dokumenty.Dokumenty;
import Osoba.Osoba;

import java.util.Date;

public class Umowa extends Dokumenty {
    private Osoba sprzedawca;
    private Osoba klient;

    public Umowa(Date data, Pojazd pojazd, Osoba sprzedawca, Osoba klient) {
        super(data, pojazd);
        this.sprzedawca = sprzedawca;
        this.klient = klient;
    }

    public Osoba getSprzedawca() {
        return sprzedawca;
    }

    public void setSprzedawca(Osoba sprzedawca) {
        this.sprzedawca = sprzedawca;
    }

    public Osoba getKlient() {
        return klient;
    }

    public void setKlient(Osoba klient) {
        this.klient = klient;
    }
}