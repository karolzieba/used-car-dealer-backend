package Auto;

import Dokumenty.Polisy.*;
import Dokumenty.Umowy.Umowa;

public class Pojazd {
    private String vin;
    private int rok;
    private String marka;
    private Umowa[] umowy;
    private PolisaOC polisaOC;
    private PolisaAcc polisaAcc;

    public Pojazd(String vin, int rok, String marka, Umowa[] umowy, PolisaOC polisaOC) {
        this.vin = vin;
        this.rok = rok;
        this.marka = marka;
        this.umowy = umowy;
        this.polisaOC = polisaOC;
    }

    public Pojazd(String vin, int rok, String marka, Umowa[] umowy, PolisaOC polisaOC, PolisaAcc polisaAcc) {
        this.vin = vin;
        this.rok = rok;
        this.marka = marka;
        this.umowy = umowy;
        this.polisaOC = polisaOC;
        this.polisaAcc = polisaAcc;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Umowa[] getUmowy() {
        return umowy;
    }

    public void setUmowy(Umowa[] umowy) {
        this.umowy = umowy;
    }

    public PolisaOC getPolisaOC() {
        return polisaOC;
    }

    public void setPolisaOC(PolisaOC polisaOC) {
        this.polisaOC = polisaOC;
    }

    public PolisaAcc getPolisaAcc() {
        return polisaAcc;
    }

    public void setPolisaAcc(PolisaAcc polisaAcc) {
        this.polisaAcc = polisaAcc;
    }
}