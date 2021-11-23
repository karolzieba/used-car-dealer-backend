package Placowka;

import Osoba.AdresZamieszkania;

public class Placowka {
    private String nazwa;
    private int numerPlacowki;
    private AdresZamieszkania adres;

    public Placowka(String nazwa, int numerPlacowki, AdresZamieszkania adres) {
        this.nazwa = nazwa;
        this.numerPlacowki = numerPlacowki;
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumerPlacowki() {
        return numerPlacowki;
    }

    public void setNumerPlacowki(int numerPlacowki) {
        this.numerPlacowki = numerPlacowki;
    }

    public AdresZamieszkania getAdres() {
        return adres;
    }

    public void setAdres(AdresZamieszkania adres) {
        this.adres = adres;
    }
}
