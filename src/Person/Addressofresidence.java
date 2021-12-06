package Person;

public class Addressofresidence {
    private String kodPocztowy;
    private String miejscowosc;
    private String ulica;
    private int numerDomu;

    public Addressofresidence(String kodPocztowy, String miejscowosc, String ulica, int numerDomu) {
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }
}