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
}