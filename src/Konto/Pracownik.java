package Konto;

import Osoba.Osoba;
import Placowka.Placowka;

public class Pracownik {
    private Osoba osoba;
    private Konto konto;
    private Placowka placowka;
    private String stanowisko;
    private int pensja;

    public Pracownik(Osoba osoba, Konto konto, Placowka placowka, String stanowisko, int pensja) {
        this.osoba = osoba;
        this.konto = konto;
        this.placowka = placowka;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public Placowka getPlacowka() {
        return placowka;
    }

    public void setPlacowka(Placowka placowka) {
        this.placowka = placowka;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }
}
