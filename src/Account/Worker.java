package Account;

import Person.Person;
import Institution.Institution;

public class Worker {
    private Person osoba;
    private Konto konto;
    private Institution placowka;
    private String stanowisko;
    private int pensja;

    public Worker(Person osoba, Konto konto, Institution placowka, String stanowisko, int pensja) {
        this.osoba = osoba;
        this.konto = konto;
        this.placowka = placowka;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Person getOsoba() {
        return osoba;
    }

    public void setOsoba(Person osoba) {
        this.osoba = osoba;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public Institution getPlacowka() {
        return placowka;
    }

    public void setPlacowka(Institution placowka) {
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
