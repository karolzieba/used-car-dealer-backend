package Osoba;

import java.util.Date;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int pesel;
    private Date dataUrodzenia;
    private AdresZamieszkania adres;

    public Osoba(String imie, String nazwisko, int pesel, Date dataUrodzenia, AdresZamieszkania adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public AdresZamieszkania getAdres() {
        return adres;
    }

    public void setAdres(AdresZamieszkania adres) {
        this.adres = adres;
    }
}