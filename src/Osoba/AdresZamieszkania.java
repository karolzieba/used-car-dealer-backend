package Osoba;

public class AdresZamieszkania {
    private String kodPocztowy;
    private String miejscowosc;
    private String ulica;
    private int numerDomu;

    public AdresZamieszkania(String kodPocztowy, String miejscowosc, String ulica, int numerDomu){
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }
}