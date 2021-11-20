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
    public Pojazd(String vin, int rok, String marka, Umowa[] umowy, PolisaOC polisaOC){
        this.vin=vin;
        this.rok=rok;
        this.marka=marka;
        this.umowy = umowy;
        this.polisaOC = polisaOC;
    }
    public Pojazd(String vin, int rok, String marka, Umowa[] umowy, PolisaOC polisaOC,PolisaAcc polisaAcc){
        this.vin=vin;
        this.rok=rok;
        this.marka=marka;
        this.umowy = umowy;
        this.polisaOC = polisaOC;
        this.polisaAcc = polisaAcc;

    }

}