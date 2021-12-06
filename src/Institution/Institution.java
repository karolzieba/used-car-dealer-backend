package Institution;

import Person.Addressofresidence;

public class Institution {
    private String nazwa;
    private int numerPlacowki;
    private Addressofresidence adres;

    public Institution(String nazwa, int numerPlacowki, Addressofresidence adres) {
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

    public Addressofresidence getAdres() {
        return adres;
    }

    public void setAdres(Addressofresidence adres) {
        this.adres = adres;
    }
}
