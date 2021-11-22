package Osoba;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int pesel;
    private AdresZamieszkania adres;

    public Osoba(String imie, String nazwisko, int pesel, AdresZamieszkania adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
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

    public AdresZamieszkania getAdres() {
        return adres;
    }

    public void setAdres(AdresZamieszkania adres) {
        this.adres = adres;
    }
}