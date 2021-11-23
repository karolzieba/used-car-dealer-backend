package Konto;

import Osoba.Osoba;

public class Klient {
    private Osoba osoba;
    private Konto konto;
    private String numerKontaBankowego;
    private int iloscZakupow = 0;
    private int iloscSprzedazy = 0;

    public Klient(Osoba osoba, Konto konto, String numerKontaBankowego) {
        this.osoba = osoba;
        this.konto = konto;
        this.numerKontaBankowego = numerKontaBankowego;
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

    public String getNumerKontaBankowego() { return numerKontaBankowego; }

    public void setNumerKontaBankowego(String numerKontaBankowego) { this.numerKontaBankowego = numerKontaBankowego; }

    public int getIloscZakupow() {
        return iloscZakupow;
    }

    public void setIloscZakupow(int iloscZakupow) {
        this.iloscZakupow = iloscZakupow;
    }

    public int getIloscSprzedazy() {
        return iloscSprzedazy;
    }

    public void setIloscSprzedazy(int iloscSprzedazy) {
        this.iloscSprzedazy = iloscSprzedazy;
    }
}
