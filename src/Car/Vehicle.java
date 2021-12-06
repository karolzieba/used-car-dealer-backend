package Car;

import Documents.Policy.*;
import Documents.Contracts.Contract;

public class Vehicle {
    private String vin;
    private int rok;
    private String marka;
    private Contract[] umowy;
    private PolicyOC polisaOC;
    private PolicyAcc polisaAcc;

    public Vehicle(String vin, int rok, String marka, Contract[] umowy, PolicyOC polisaOC) {
        this.vin = vin;
        this.rok = rok;
        this.marka = marka;
        this.umowy = umowy;
        this.polisaOC = polisaOC;
    }

    public Vehicle(String vin, int rok, String marka, Contract[] umowy, PolicyOC polisaOC, PolicyAcc polisaAcc) {
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

    public Contract[] getUmowy() {
        return umowy;
    }

    public void setUmowy(Contract[] umowy) {
        this.umowy = umowy;
    }

    public PolicyOC getPolisaOC() {
        return polisaOC;
    }

    public void setPolisaOC(PolicyOC polisaOC) {
        this.polisaOC = polisaOC;
    }

    public PolicyAcc getPolisaAcc() {
        return polisaAcc;
    }

    public void setPolisaAcc(PolicyAcc polisaAcc) {
        this.polisaAcc = polisaAcc;
    }

    public void wyswietl(){}
}